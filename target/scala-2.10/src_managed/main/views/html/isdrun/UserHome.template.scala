
package views.html.isdrun

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
object UserHome extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title : String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.18*/("""

<!DOCTYPE html>
<html>
<head>
    """),_display_(Seq[Any](/*6.6*/common/*6.12*/.head(title))),format.raw/*6.24*/("""
</head>
<body>
"""),_display_(Seq[Any](/*9.2*/common/*9.8*/.navbar(title))),format.raw/*9.22*/("""

<p> Hello</p>

"""),_display_(Seq[Any](/*13.2*/common/*13.8*/.footer())),format.raw/*13.17*/("""

</body>

</html>"""))}
    }
    
    def render(title:String): play.api.templates.HtmlFormat.Appendable = apply(title)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (title) => apply(title)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Aug 23 10:56:35 ALMT 2014
                    SOURCE: G:/Play/Restaurant Database/app/views/isdrun/UserHome.scala.html
                    HASH: 2070fe3665c0354649edecfa8c221753736234af
                    MATRIX: 784->1|894->17|965->54|979->60|1012->72|1063->89|1076->95|1111->109|1164->127|1178->133|1209->142
                    LINES: 26->1|29->1|34->6|34->6|34->6|37->9|37->9|37->9|41->13|41->13|41->13
                    -- GENERATED --
                */
            