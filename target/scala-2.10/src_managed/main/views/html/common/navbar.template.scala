
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
object navbar extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.17*/("""
<div class="navbar navbar-default navbar-fixed-top" role="navigation">
  <div class="container">
    <div class="navbar-header">
      
    </div>
    
    <div class="navbar-collapse collapse">
      


    </div><!--/.nav-collapse -->
  </div>
</div>"""))}
    }
    
    def render(title:String): play.api.templates.HtmlFormat.Appendable = apply(title)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (title) => apply(title)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Apr 01 19:34:48 ALMT 2014
                    SOURCE: G:/Play/Restaurant Database/app/views/common/navbar.scala.html
                    HASH: a2091ddb2c29b2584f9d0670a44c37e94e245ee2
                    MATRIX: 782->1|891->16
                    LINES: 26->1|29->1
                    -- GENERATED --
                */
            