
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
object guest extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>
<html>
<head>
    """),_display_(Seq[Any](/*6.6*/common/*6.12*/.head(title))),format.raw/*6.24*/(""" 
</head>
<body>
    
   <div class="navbar navbar-default navbar-fixed-top" role="navigation">
  <div class="container">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Restaurant Database System</a>
    </div>
  </div>
</div>
	
	"""),_display_(Seq[Any](/*18.3*/content)),format.raw/*18.10*/("""
	

	"""),_display_(Seq[Any](/*21.3*/common/*21.9*/.footer())),format.raw/*21.18*/("""
    
    
    
</body>


</html>"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Apr 01 04:56:19 ALMT 2014
                    SOURCE: C:/Users/User/Documents/GitHub/CSE-304-Project/app/views/common/guest.scala.html
                    HASH: b786d786f9e5bbe7cef1909fbbdc9c3abe3fd348
                    MATRIX: 786->1|910->31|986->73|1000->79|1033->91|1335->358|1364->365|1408->374|1422->380|1453->389
                    LINES: 26->1|29->1|34->6|34->6|34->6|46->18|46->18|49->21|49->21|49->21
                    -- GENERATED --
                */
            