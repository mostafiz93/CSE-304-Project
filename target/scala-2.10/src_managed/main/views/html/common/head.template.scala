
package views.html.common

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object head extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.17*/("""

<title>"""),_display_(Seq[Any](/*3.9*/title)),format.raw/*3.14*/("""</title>

<!-- <link rel='stylesheet' href='"""),_display_(Seq[Any](/*5.36*/routes/*5.42*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*5.81*/("""'>  -->
<link href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" rel="stylesheet">

<link rel='stylesheet' href='"""),_display_(Seq[Any](/*8.31*/routes/*8.37*/.Assets.at("stylesheets/index.css"))),format.raw/*8.72*/("""'>
<script type='text/javascript' src='"""),_display_(Seq[Any](/*9.38*/routes/*9.44*/.Assets.at("javascripts/jquery.min.js"))),format.raw/*9.83*/("""'></script>

<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
<!-- <link rel='text/javascript' href='"""),_display_(Seq[Any](/*12.41*/routes/*12.47*/.Assets.at("javascripts/bootstrap.js"))),format.raw/*12.85*/("""'> -->

<style type="text/css">
.glyphicon """),format.raw/*15.12*/("""{"""),format.raw/*15.13*/("""
  font-family: 'Glyphicons Halflings';
  src: url("""),_display_(Seq[Any](/*17.13*/routes/*17.19*/.Assets.at("fonts/glyphicons-halflings-regular.eot"))),format.raw/*17.71*/(""");
"""),format.raw/*18.1*/("""}"""),format.raw/*18.2*/("""
</style>"""))}
    }
    
    def render(title:String): play.api.templates.HtmlFormat.Appendable = apply(title)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (title) => apply(title)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Apr 01 19:34:48 ALMT 2014
                    SOURCE: G:/Play/Restaurant Database/app/views/common/head.scala.html
                    HASH: 524cacd176a250d9d99dccc7ddb1172a25c0d8fe
                    MATRIX: 780->1|889->16|935->28|961->33|1043->80|1057->86|1117->125|1289->262|1303->268|1359->303|1435->344|1449->350|1509->389|1687->531|1702->537|1762->575|1836->621|1865->622|1955->676|1970->682|2044->734|2075->738|2103->739
                    LINES: 26->1|29->1|31->3|31->3|33->5|33->5|33->5|36->8|36->8|36->8|37->9|37->9|37->9|40->12|40->12|40->12|43->15|43->15|45->17|45->17|45->17|46->18|46->18
                    -- GENERATED --
                */
            