
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.versioned("images/favicon.png")),format.raw/*9.104*/("""">
        <script src=""""),_display_(/*10.23*/routes/*10.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*10.70*/("""" type="text/javascript"></script>

        <script src="//code.jquery.com/jquery-1.12.0.min.js"></script>

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>

        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular-route.js"></script>

        <link rel="stylesheet" type="text/css" href=""""),_display_(/*21.55*/routes/*21.61*/.Assets.versioned("stylesheets/analyzer.css")),format.raw/*21.106*/("""">
    </head>
    <body>
    <a href="/" style="text-decoration:none;color:black;">
    <div class="container page-header">
        <h2>Webpage Analyzer</h2>
    </div>
    </a>
        """),_display_(/*29.10*/content),format.raw/*29.17*/("""
    """),format.raw/*30.5*/("""<div class="container page-header" style="padding-top:10px;padding-bottom:15px;">
        <h4>This site is powered by</h4>
        <a href="http://jsoup.org/">JSOUP</a><br />
        <a href="https://angularjs.org/">AngularJS</a><br />
        <a href="http://getbootstrap.com/">Bootstrap</a>
    </div>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Fri Jan 22 11:20:58 PST 2016
                  SOURCE: /Users/saksham/workspace/web-analyzer/app/views/main.scala.html
                  HASH: ac74023d923c594c18eaaa3fabbead77897ea36d
                  MATRIX: 748->1|873->31|901->33|988->94|1013->99|1101->161|1115->167|1177->208|1264->269|1278->275|1338->314|1390->339|1405->345|1467->386|2512->1404|2527->1410|2594->1455|2809->1643|2837->1650|2869->1655
                  LINES: 27->1|32->1|34->3|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|52->21|52->21|52->21|60->29|60->29|61->30
                  -- GENERATED --
              */
          