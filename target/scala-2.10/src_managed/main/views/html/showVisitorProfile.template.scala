
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
object showVisitorProfile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Visitor,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(visitor: Visitor):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.20*/("""



"""),_display_(Seq[Any](/*5.2*/common/*5.8*/.head("Profile"))),format.raw/*5.24*/("""

"""),_display_(Seq[Any](/*7.2*/main("Profile")/*7.17*/ {_display_(Seq[Any](format.raw/*7.19*/("""

<div class="col-md-12 col-md-offset-1">
<div class="heading-banner">
	<h3>Welcome! """),_display_(Seq[Any](/*11.16*/visitor/*11.23*/.firstName)),format.raw/*11.33*/(""" """),_display_(Seq[Any](/*11.35*/visitor/*11.42*/.lastName)),format.raw/*11.51*/("""</h3>
</div>
<hr/>
<hr/>
<div class="col-md-3">
	<div><strong>Gender :</strong></div>
	<div><strong>Occupation :</strong></div>
	<div><strong>Address:</strong></div>
	<p></p>
</div>

<div class="col-md-3">
	<div><strong>"""),_display_(Seq[Any](/*23.16*/visitor/*23.23*/.gender)),format.raw/*23.30*/("""</strong></div>
	<div><strong>"""),_display_(Seq[Any](/*24.16*/visitor/*24.23*/.occupation)),format.raw/*24.34*/("""</strong></div>
	<div><strong>"""),_display_(Seq[Any](/*25.16*/visitor/*25.23*/.address)),format.raw/*25.31*/("""</strong></div>
	<p></p>
</div>

<div class="col-md-3" id="add-options">
			<div class="row">
				<a class="btn" href=""""),_display_(Seq[Any](/*31.27*/controllers/*31.38*/.restaurant.routes.RestaurantController.createRestaurant())),format.raw/*31.96*/("""" >Add a restaurant
  				</a>
  				<a class="btn" href=""""),_display_(Seq[Any](/*33.29*/controllers/*33.40*/.franchise.routes.FranchiseController.createFranchise())),format.raw/*33.95*/("""" >Add a Franchise
  				</a>
  				<a class="btn" href=""""),_display_(Seq[Any](/*35.29*/controllers/*35.40*/.restaurant.routes.RestaurantController.showAllRestaurant())),format.raw/*35.99*/("""" >All Restaurants
  				</a>
			</div>
		</div>

""")))})),format.raw/*40.2*/("""

<div class="col-md-12">
<hr/>
<br/>
<br/>
<br/>
</div> 


"""),_display_(Seq[Any](/*50.2*/common/*50.8*/.footer())),format.raw/*50.17*/("""


"""),_display_(Seq[Any](/*53.2*/views/*53.7*/.html.signInModal())),format.raw/*53.26*/("""




"""))}
    }
    
    def render(visitor:Visitor): play.api.templates.HtmlFormat.Appendable = apply(visitor)
    
    def f:((Visitor) => play.api.templates.HtmlFormat.Appendable) = (visitor) => apply(visitor)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Apr 01 19:34:48 ALMT 2014
                    SOURCE: G:/Play/Restaurant Database/app/views/showVisitorProfile.scala.html
                    HASH: 8484bc8fd5a42ac2862d4f4dffe838be5bf2d9d2
                    MATRIX: 788->1|900->19|943->28|956->34|993->50|1032->55|1055->70|1094->72|1220->162|1236->169|1268->179|1306->181|1322->188|1353->197|1622->430|1638->437|1667->444|1735->476|1751->483|1784->494|1852->526|1868->533|1898->541|2060->667|2080->678|2160->736|2257->797|2277->808|2354->863|2450->923|2470->934|2551->993|2638->1049|2744->1120|2758->1126|2789->1135|2831->1142|2844->1147|2885->1166
                    LINES: 26->1|29->1|33->5|33->5|33->5|35->7|35->7|35->7|39->11|39->11|39->11|39->11|39->11|39->11|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|59->31|59->31|59->31|61->33|61->33|61->33|63->35|63->35|63->35|68->40|78->50|78->50|78->50|81->53|81->53|81->53
                    -- GENERATED --
                */
            