
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
object signUpModal extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.data.Form[models.Visitor],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(signUpForm: play.data.Form[models.Visitor]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.46*/("""

<div class="modal fade" id="signUpModal" tabindex="-1" role="dialog"
	aria-labelledby="signUpModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">&times;</button>
				<h4 class="modal-title" id="signUpModalLabel">Sign Up</h4>
			</div>
			"""),_display_(Seq[Any](/*12.5*/helper/*12.11*/.form(action = controllers.routes.VisitorEnd.signUp())/*12.65*/ {_display_(Seq[Any](format.raw/*12.67*/("""
				<div class="modal-body">

					"""),_display_(Seq[Any](/*15.7*/helper/*15.13*/.input(signUpForm("visitorID"),
						 '_showConstraints -> false, 
						 '_class -> "no-dt")/*17.27*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*17.56*/("""
							<input type="text" class="form-control" name=""""),_display_(Seq[Any](/*18.55*/name)),format.raw/*18.59*/("""" id=""""),_display_(Seq[Any](/*18.66*/id)),format.raw/*18.68*/(""""
							placeholder="visitorID">
					""")))})),format.raw/*20.7*/("""
					
					<!-- """),_display_(Seq[Any](/*22.12*/helper/*22.18*/.input(signUpForm("password"),
						 '_showConstraints -> false, 
						 '_class -> "no-dt")/*24.27*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*24.56*/("""
							<input type="text" class="form-control" name=""""),_display_(Seq[Any](/*25.55*/name)),format.raw/*25.59*/("""" id=""""),_display_(Seq[Any](/*25.66*/id)),format.raw/*25.68*/(""""
							placeholder="password"> -->
					""")))})),format.raw/*27.7*/("""
					
					
					"""),_display_(Seq[Any](/*30.7*/helper/*30.13*/.input(signUpForm("firstName"),
						 '_showConstraints -> false, 
						 '_class -> "no-dt")/*32.27*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*32.56*/("""
							<input type="text" class="form-control" name=""""),_display_(Seq[Any](/*33.55*/name)),format.raw/*33.59*/("""" id=""""),_display_(Seq[Any](/*33.66*/id)),format.raw/*33.68*/(""""
							placeholder="firstName">
					""")))})),format.raw/*35.7*/("""
					
					"""),_display_(Seq[Any](/*37.7*/helper/*37.13*/.input(signUpForm("lastName"),
						 '_showConstraints -> false, 
						 '_class -> "no-dt")/*39.27*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*39.56*/("""
							<input type="text" class="form-control" name=""""),_display_(Seq[Any](/*40.55*/name)),format.raw/*40.59*/("""" id=""""),_display_(Seq[Any](/*40.66*/id)),format.raw/*40.68*/(""""
							placeholder="lastName">
					""")))})),format.raw/*42.7*/("""
					
					
					<!-- """),_display_(Seq[Any](/*45.12*/helper/*45.18*/.input(signUpForm("email"),
						 '_showConstraints -> false,
						 '_class -> "no-dt")/*47.27*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*47.56*/("""
							<input type="email" class="form-control" name=""""),_display_(Seq[Any](/*48.56*/name)),format.raw/*48.60*/("""" id=""""),_display_(Seq[Any](/*48.67*/id)),format.raw/*48.69*/(""""
							placeholder="Email">
					""")))})),format.raw/*50.7*/(""" -->

					
					<p><input type="password" class="form-control" placeholder="Password"
						id="password" name="password" required></p>
					<!-- <p><button type="button" class="btn btn-default">Select Image</button>
						<b>1005003.jpg</b></p>  --> 

				</div>
				<div class="modal-footer">
					<button type="submit" class="btn btn-success">Sign Up</button>
				</div>
			""")))})),format.raw/*62.5*/("""
		</div>
	</div>
</div>"""))}
    }
    
    def render(signUpForm:play.data.Form[models.Visitor]): play.api.templates.HtmlFormat.Appendable = apply(signUpForm)
    
    def f:((play.data.Form[models.Visitor]) => play.api.templates.HtmlFormat.Appendable) = (signUpForm) => apply(signUpForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Mar 28 16:47:34 ALMT 2014
                    SOURCE: C:/Users/mostafiz/workspace/RestaurantDatabaseSystem/app/views/signUpModal.scala.html
                    HASH: 8187044c8f79dfaaf8c873f449ab4a889fc1af78
                    MATRIX: 804->1|942->45|1382->450|1397->456|1460->510|1500->512|1575->552|1590->558|1695->654|1762->683|1854->739|1880->743|1923->750|1947->752|2020->794|2076->814|2091->820|2195->915|2262->944|2354->1000|2380->1004|2423->1011|2447->1013|2523->1058|2580->1080|2595->1086|2700->1182|2767->1211|2859->1267|2885->1271|2928->1278|2952->1280|3025->1322|3075->1337|3090->1343|3194->1438|3261->1467|3353->1523|3379->1527|3422->1534|3446->1536|3518->1577|3581->1604|3596->1610|3696->1701|3763->1730|3856->1787|3882->1791|3925->1798|3949->1800|4018->1838|4440->2229
                    LINES: 26->1|29->1|40->12|40->12|40->12|40->12|43->15|43->15|45->17|45->17|46->18|46->18|46->18|46->18|48->20|50->22|50->22|52->24|52->24|53->25|53->25|53->25|53->25|55->27|58->30|58->30|60->32|60->32|61->33|61->33|61->33|61->33|63->35|65->37|65->37|67->39|67->39|68->40|68->40|68->40|68->40|70->42|73->45|73->45|75->47|75->47|76->48|76->48|76->48|76->48|78->50|90->62
                    -- GENERATED --
                */
            