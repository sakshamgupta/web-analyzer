package services;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by saksham on 20/01/16.
 */
public class WebAnalyzerService {
    private static final String ROOT_ELEMENT_TAG = "#root";

    /**
     * Helper function to get a JSOUP document from the provided URI
     * @param urlString
     * @return
     * @throws MalformedURLException
     * @throws IOException
     */
    public static Document getWebPage(String urlString) throws Exception {
        URL url;
        InputStream is = null;
        BufferedReader br;
        String line;

        String res = "";

        try {
            if (!urlString.startsWith("http") && !urlString.startsWith("https")) {
                urlString = "http://" + urlString;
            }

            url = new URL(urlString);
            HttpURLConnection httpcon = (HttpURLConnection) url.openConnection();
            httpcon.setRequestMethod("GET");
            httpcon.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");

            is = httpcon.getInputStream();
            br = new BufferedReader(new InputStreamReader(is));

            while ((line = br.readLine()) != null) {
                res += line;
            }
        } finally {
            try {
                if (is != null) is.close();
            } catch (IOException ioe) {
                // nothing to see here
            }
        }

        return Jsoup.parse(res);
    }

    /**
     * Returns a raw html string encapsulated in <xmp> and tag specific classes
     * NOTE: This function modifies the provided doc
     * @param doc
     * @return
     */
    public static String getInstrumentedHtml(Document doc) {
        List<String> tags = getTags(doc);

        for (String tag: tags) {
            doc.select(tag).tagName("</xmp><p class='highlight-" + tag + "' style='display:inline;'>" + tag + "</p><xmp style='display:inline;'>");
        }

        return "<xmp style='display:inline;'>" + doc.toString() + "</xmp>";
    }

    private static List<String> getTags(Document doc) {
        return doc.select("*").stream().filter(distinctByKey(element -> element.tagName())).filter(element -> {return !element.tagName().equals(ROOT_ELEMENT_TAG);}).map(element -> element.tagName()).collect(Collectors.toList());
    }

    public static Map<String, Long> getTagCount(Document doc) {
        List<String> el = getTags(doc);

        Map<String, Long> tagCount = new HashMap<>();

        for (String tag: el) {
            long count = doc.select("*").stream().filter(element -> {return element.tagName().equals(tag);}).count();
            tagCount.put(tag, count);
        }

        return tagCount;
    }

    /**
     * Returns a predicate that returns distinct objects based on the matching criteria
     * @param keyExtractor
     * @param <T>
     * @return
     */
    private static <T> Predicate<T> distinctByKey(Function<? super T,Object> keyExtractor) {
        Map<Object,Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

    public static void validateURL(String url) throws MalformedURLException {
        return;
    }
}
