
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
<link rel='shortcut icon' type='image/png' href='"""),_display_(Seq[Any](/*4.51*/routes/*4.57*/.Assets.at("images/favicon.png"))),format.raw/*4.89*/("""'>

<!-- <link rel='stylesheet' href='"""),_display_(Seq[Any](/*6.36*/routes/*6.42*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*6.81*/("""'>  -->
<link href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" rel="stylesheet">

<link rel='stylesheet' href='"""),_display_(Seq[Any](/*9.31*/routes/*9.37*/.Assets.at("stylesheets/index.css"))),format.raw/*9.72*/("""'>
<script type='text/javascript' src='"""),_display_(Seq[Any](/*10.38*/routes/*10.44*/.Assets.at("javascripts/jquery.min.js"))),format.raw/*10.83*/("""'></script>

<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
<!-- <link rel='text/javascript' href='"""),_display_(Seq[Any](/*13.41*/routes/*13.47*/.Assets.at("javascripts/bootstrap.js"))),format.raw/*13.85*/("""'> -->

<style type="text/css">
.glyphicon """),format.raw/*16.12*/("""{"""),format.raw/*16.13*/("""
  font-family: 'Glyphicons Halflings';
  src: url("""),_display_(Seq[Any](/*18.13*/routes/*18.19*/.Assets.at("fonts/glyphicons-halflings-regular.eot"))),format.raw/*18.71*/(""");
"""),format.raw/*19.1*/("""}"""),format.raw/*19.2*/("""
</style>"""))}
    }
    
    def render(title:String): play.api.templates.HtmlFormat.Appendable = apply(title)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (title) => apply(title)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Mar 28 14:21:34 ALMT 2014
                    SOURCE: C:/Users/mostafiz/workspace/RestaurantDatabaseSystem/app/views/common/head.scala.html
                    HASH: 4e51280a1064eaa271a42cd6fa911b60e9dbad60
                    MATRIX: 780->1|889->16|933->26|959->31|1053->90|1067->96|1120->128|1194->167|1208->173|1268->212|1437->346|1451->352|1507->387|1583->427|1598->433|1659->472|1834->611|1849->617|1909->655|1980->698|2009->699|2097->751|2112->757|2186->809|2216->812|2244->813
                    LINES: 26->1|29->1|31->3|31->3|32->4|32->4|32->4|34->6|34->6|34->6|37->9|37->9|37->9|38->10|38->10|38->10|41->13|41->13|41->13|44->16|44->16|46->18|46->18|46->18|47->19|47->19
                    -- GENERATED --
                */
            