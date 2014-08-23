
package views.html

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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.data.Form[models.Visitor],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(signUpForm: play.data.Form[models.Visitor]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.46*/("""

"""),_display_(Seq[Any](/*3.2*/common/*3.8*/.guest("Restaurant Database System")/*3.44*/ {_display_(Seq[Any](format.raw/*3.46*/("""
	<div class="container">
		<img id="main" src=""""),_display_(Seq[Any](/*5.24*/routes/*5.30*/.Assets.at("images/restaurant.jpg"))),format.raw/*5.65*/(""""></img>
		<div class="container" id="sign-up-in-container">
			<div class="heading-banner">
				<h4>If you are not registered please sign-up. Otherwise sign-in to rate your favorite restaurant or food item.</h4>
			</div>
			<hr/>
			<div class="row">
				<button type="button" id="sign-up" class="btn btn-primary btn-large btn-block btn-lg" 
					role="button" data-toggle="modal" data-target="#signUpModal">Sign Up</button>
				<p class="or">Or</p>
				<button type="button" id="sign-in" class="btn btn-default btn-large btn-block btn-lg"
					role="button" data-toggle="modal" data-target="#signInModal">Sign In</button>
			</div>
		</div>
	</div>
	"""),_display_(Seq[Any](/*20.3*/views/*20.8*/.html.signInModal())),format.raw/*20.27*/("""
	"""),_display_(Seq[Any](/*21.3*/views/*21.8*/.html.signUpModal(signUpForm))),format.raw/*21.37*/("""
""")))})))}
    }
    
    def render(signUpForm:play.data.Form[models.Visitor]): play.api.templates.HtmlFormat.Appendable = apply(signUpForm)
    
    def f:((play.data.Form[models.Visitor]) => play.api.templates.HtmlFormat.Appendable) = (signUpForm) => apply(signUpForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Aug 23 09:08:18 ALMT 2014
                    SOURCE: G:/Play/Restaurant Database/app/views/index.scala.html
                    HASH: cafc5cf89fc16f33eddae83d40189bd7aa0c612e
                    MATRIX: 798->1|936->45|975->50|988->56|1032->92|1071->94|1157->145|1171->151|1227->186|1931->855|1944->860|1985->879|2024->883|2037->888|2088->917
                    LINES: 26->1|29->1|31->3|31->3|31->3|31->3|33->5|33->5|33->5|48->20|48->20|48->20|49->21|49->21|49->21
                    -- GENERATED --
                */
            