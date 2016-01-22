
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object analyzer_Scope0 {
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

class analyzer extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,com.fasterxml.jackson.databind.JsonNode,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(instrumentedHtml: String)(json: com.fasterxml.jackson.databind.JsonNode):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.75*/("""

"""),_display_(/*3.2*/main("Welcome to Web Analyzer")/*3.33*/ {_display_(Seq[Any](format.raw/*3.35*/("""


"""),format.raw/*6.1*/("""<script>
    var jsonParse = JSON.parse('"""),_display_(/*7.34*/{Html(json.toString())}),format.raw/*7.57*/("""');
</script>

<script type="text/javascript" src='"""),_display_(/*10.38*/routes/*10.44*/.Assets.versioned("javascripts/analyzer.js")),format.raw/*10.88*/("""'></script>

<div class="container" id="analyzer" ng-controller="analyzerAppCtrl" ng-app="analyzerApp">
    <div class="row">
        <div class="checkbox">
            <label><input type="checkbox" ng-true-value="1" ng-false-value="0" ng-model="hoverToHighlight">Hover to highlight</label>
        </div>
    </div>
    <div class="row">
        <div class="col-xs-6 content-container" style="width:500px;height:500px;overflow-x: scroll;overflow-y: scroll;">
            <div>
                <table class="table table-hover">
                    <thead>
                    <tr>
                        <th>Tag Name</th>
                        <th>Tag Count</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr ng-repeat="(tag,count) in tags.tagCount" ng-click="onClick(tag)" ng-mouseover="onHover(tag)">
                        <td>"""),format.raw/*30.29*/("""{"""),format.raw/*30.30*/("""{"""),format.raw/*30.31*/("""tag"""),format.raw/*30.34*/("""}"""),format.raw/*30.35*/("""}"""),format.raw/*30.36*/("""</td>
                        <td>"""),format.raw/*31.29*/("""{"""),format.raw/*31.30*/("""{"""),format.raw/*31.31*/("""count"""),format.raw/*31.36*/("""}"""),format.raw/*31.37*/("""}"""),format.raw/*31.38*/("""</td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
        <div class="col-xs-6 content-container" style="width:500px;height:500px;overflow-x: scroll;overflow-y: scroll;">
            """),_display_(/*38.14*/Html(instrumentedHtml)),format.raw/*38.36*/("""
        """),format.raw/*39.9*/("""</div>
    </div>
</div>
""")))}),format.raw/*42.2*/("""
"""))
      }
    }
  }

  def render(instrumentedHtml:String,json:com.fasterxml.jackson.databind.JsonNode): play.twirl.api.HtmlFormat.Appendable = apply(instrumentedHtml)(json)

  def f:((String) => (com.fasterxml.jackson.databind.JsonNode) => play.twirl.api.HtmlFormat.Appendable) = (instrumentedHtml) => (json) => apply(instrumentedHtml)(json)

  def ref: this.type = this

}


}

/**/
object analyzer extends analyzer_Scope0.analyzer
              /*
                  -- GENERATED --
                  DATE: Thu Jan 21 17:53:08 PST 2016
                  SOURCE: /Users/saksham/workspace/web-analyzer/app/views/analyzer.scala.html
                  HASH: 1b095eb178160137f912e2597d88a42985329e0d
                  MATRIX: 791->1|959->74|987->77|1026->108|1065->110|1094->113|1162->155|1205->178|1284->230|1299->236|1364->280|2287->1175|2316->1176|2345->1177|2376->1180|2405->1181|2434->1182|2496->1216|2525->1217|2554->1218|2587->1223|2616->1224|2645->1225|2926->1479|2969->1501|3005->1510|3061->1536
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|38->7|38->7|41->10|41->10|41->10|61->30|61->30|61->30|61->30|61->30|61->30|62->31|62->31|62->31|62->31|62->31|62->31|69->38|69->38|70->39|73->42
                  -- GENERATED --
              */
          