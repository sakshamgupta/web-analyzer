
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(error: String)(url: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.30*/("""

"""),_display_(/*3.2*/main("Welcome to Web Analyzer")/*3.33*/ {_display_(Seq[Any](format.raw/*3.35*/("""

    """),format.raw/*5.5*/("""<div class="container">
        <p>Welcome to the webpage analyzer tool. Simply provide us with the URL of the webpage that you want to analyze, and let us cook some awesomeness for you:</p>
        <form role="form" action=""""),_display_(/*7.36*/controllers/*7.47*/.routes.WebAnalyzer.analyze()),format.raw/*7.76*/("""" method="post">
            <div class="form-group">
                <label for="url">URL:</label>
                <input type="text" class="form-control" id="url" name="url" """),_display_(/*10.78*/if(error!=null)/*10.93*/{_display_(Seq[Any](format.raw/*10.94*/("""value=""""),_display_(/*10.102*/url),format.raw/*10.105*/(""""""")))}),format.raw/*10.107*/(""">
            </div>
            """),_display_(/*12.14*/if(error != null)/*12.31*/{_display_(Seq[Any](format.raw/*12.32*/("""
                """),format.raw/*13.17*/("""<div class="alert alert-danger" role="alert">
                    <span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
                    <span class="sr-only">Error:</span>
                    """),_display_(/*16.22*/error),format.raw/*16.27*/("""
                """),format.raw/*17.17*/("""</div>
            """)))}),format.raw/*18.14*/("""
            """),format.raw/*19.13*/("""<button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>


""")))}),format.raw/*24.2*/("""
"""))
      }
    }
  }

  def render(error:String,url:String): play.twirl.api.HtmlFormat.Appendable = apply(error)(url)

  def f:((String) => (String) => play.twirl.api.HtmlFormat.Appendable) = (error) => (url) => apply(error)(url)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Jan 21 14:36:31 PST 2016
                  SOURCE: /Users/saksham/workspace/web-analyzer/app/views/index.scala.html
                  HASH: f65dd2a7f04c05cbcf24517625a8f0ba909b85ac
                  MATRIX: 752->1|875->29|903->32|942->63|981->65|1013->71|1265->297|1284->308|1333->337|1537->514|1561->529|1600->530|1636->538|1661->541|1695->543|1756->577|1782->594|1821->595|1866->612|2114->833|2140->838|2185->855|2236->875|2277->888|2399->980
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|38->7|38->7|38->7|41->10|41->10|41->10|41->10|41->10|41->10|43->12|43->12|43->12|44->13|47->16|47->16|48->17|49->18|50->19|55->24
                  -- GENERATED --
              */
          