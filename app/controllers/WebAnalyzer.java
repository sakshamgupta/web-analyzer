package controllers;

import org.jsoup.nodes.Document;
import play.data.Form;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.WebAnalyzerService;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by saksham on 20/01/16.
 */
public class WebAnalyzer extends Controller {
    public Result analyze() {
        String url = request().body().asFormUrlEncoded().get("url")[0];

        try {
            WebAnalyzerService.validateURL(url);
        } catch (MalformedURLException e) {
            return ok(views.html.index.render("Malformed URL", url));
        }

        Document doc = null;
        try {
            doc = WebAnalyzerService.getWebPage(url);
        } catch (Exception e) {
            return ok(views.html.index.render("Error reading from URL", url));
        }

        Map<String, Long> tagCount = WebAnalyzerService.getTagCount(doc);
        String instrumentedHtml = WebAnalyzerService.getInstrumentedHtml(doc);

        Map<Object, Object> jsonMap = new HashMap<>();

        jsonMap.put("tagCount", tagCount);
        //jsonMap.put("html", instrumentedHtml);

        return ok(views.html.analyzer.render(instrumentedHtml, Json.toJson(jsonMap)));
    }
}
