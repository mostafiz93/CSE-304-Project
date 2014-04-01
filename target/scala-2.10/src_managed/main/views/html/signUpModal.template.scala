
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
							placeholder="Visitor ID">
					""")))})),format.raw/*20.7*/("""
					
					
					"""),_display_(Seq[Any](/*23.7*/helper/*23.13*/.input(signUpForm("firstName"),
						 '_showConstraints -> false, 
						 '_class -> "no-dt")/*25.27*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*25.56*/("""
							<input type="text" class="form-control" name=""""),_display_(Seq[Any](/*26.55*/name)),format.raw/*26.59*/("""" id=""""),_display_(Seq[Any](/*26.66*/id)),format.raw/*26.68*/(""""
							placeholder="First Name">
					""")))})),format.raw/*28.7*/("""
					
					"""),_display_(Seq[Any](/*30.7*/helper/*30.13*/.input(signUpForm("lastName"),
						 '_showConstraints -> false, 
						 '_class -> "no-dt")/*32.27*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*32.56*/("""
							<input type="text" class="form-control" name=""""),_display_(Seq[Any](/*33.55*/name)),format.raw/*33.59*/("""" id=""""),_display_(Seq[Any](/*33.66*/id)),format.raw/*33.68*/(""""
							placeholder="Last Name">
					""")))})),format.raw/*35.7*/("""
					
					
					<!-- """),_display_(Seq[Any](/*38.12*/helper/*38.18*/.input(signUpForm("email"),
						 '_showConstraints -> false,
						 '_class -> "no-dt")/*40.27*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*40.56*/("""
							<input type="email" class="form-control" name=""""),_display_(Seq[Any](/*41.56*/name)),format.raw/*41.60*/("""" id=""""),_display_(Seq[Any](/*41.67*/id)),format.raw/*41.69*/(""""
							placeholder="Email">
					""")))})),format.raw/*43.7*/(""" -->

					
					<p><input type="password" class="form-control" placeholder="Password"
						id="password" name="password" required></p>
					<!-- <p><button type="button" class="btn btn-default">Select Image</button>
						<b>1005003.jpg</b></p>  --> 

				</div>
				<div class="modal-footer">
					<button type="submit" class="btn btn-success">Sign Up</button>
				</div>
			""")))})),format.raw/*55.5*/("""
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
                    DATE: Tue Apr 01 09:50:10 ALMT 2014
                    SOURCE: C:/Users/User/Documents/GitHub/CSE-304-Project/app/views/signUpModal.scala.html
                    HASH: 645f54cdd4599589f5ee25d35b93c0d7d5cd6a38
                    MATRIX: 804->1|942->45|1382->450|1397->456|1460->510|1500->512|1575->552|1590->558|1695->654|1762->683|1854->739|1880->743|1923->750|1947->752|2021->795|2078->817|2093->823|2198->919|2265->948|2357->1004|2383->1008|2426->1015|2450->1017|2524->1060|2574->1075|2589->1081|2693->1176|2760->1205|2852->1261|2878->1265|2921->1272|2945->1274|3018->1316|3081->1343|3096->1349|3196->1440|3263->1469|3356->1526|3382->1530|3425->1537|3449->1539|3518->1577|3940->1968
                    LINES: 26->1|29->1|40->12|40->12|40->12|40->12|43->15|43->15|45->17|45->17|46->18|46->18|46->18|46->18|48->20|51->23|51->23|53->25|53->25|54->26|54->26|54->26|54->26|56->28|58->30|58->30|60->32|60->32|61->33|61->33|61->33|61->33|63->35|66->38|66->38|68->40|68->40|69->41|69->41|69->41|69->41|71->43|83->55
                    -- GENERATED --
                */
            