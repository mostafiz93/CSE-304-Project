
package views.html.restaurant

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
object createRestaurant extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[models.Visitor,play.data.Form[models.Restaurant],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(creator:models.Visitor, restaurantForm: play.data.Form[models.Restaurant]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.77*/("""

<div class="modal fade" id="createRestaurant" tabindex="-1" role="dialog"
	aria-labelledby="createRestaurantLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">&times;</button>
				<h4 class="modal-title" id="createRestaurantLabel">Sign Up</h4>
			</div>
			"""),_display_(Seq[Any](/*12.5*/helper/*12.11*/.form(action = controllers.restaurant.routes.RestaurantController.addRestaurant())/*12.93*/ {_display_(Seq[Any](format.raw/*12.95*/("""
				<div class="modal-body">

					"""),_display_(Seq[Any](/*15.7*/helper/*15.13*/.input(restaurantForm("name"),
						 '_showConstraints -> false, 
						 '_class -> "no-dt")/*17.27*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*17.56*/("""
							<input type="text" class="form-control" name=""""),_display_(Seq[Any](/*18.55*/name)),format.raw/*18.59*/("""" id=""""),_display_(Seq[Any](/*18.66*/id)),format.raw/*18.68*/(""""
							placeholder="Name">
					""")))})),format.raw/*20.7*/("""
					
					"""),_display_(Seq[Any](/*22.7*/helper/*22.13*/.input(restaurantForm("email"),
						 '_showConstraints -> false,
						 '_class -> "no-dt")/*24.27*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*24.56*/("""
							<input type="email" class="form-control" name=""""),_display_(Seq[Any](/*25.56*/name)),format.raw/*25.60*/("""" id=""""),_display_(Seq[Any](/*25.67*/id)),format.raw/*25.69*/(""""
							placeholder="Email">
					""")))})),format.raw/*27.7*/("""
					
					"""),_display_(Seq[Any](/*29.7*/helper/*29.13*/.input(restaurantForm("phone"),
						 '_showConstraints -> false,
						 '_class -> "no-dt")/*31.27*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*31.56*/("""
							<input type="tel" class="form-control" name=""""),_display_(Seq[Any](/*32.54*/name)),format.raw/*32.58*/("""" id=""""),_display_(Seq[Any](/*32.65*/id)),format.raw/*32.67*/(""""
							placeholder="Phone">
					""")))})),format.raw/*34.7*/("""
					
					"""),_display_(Seq[Any](/*36.7*/helper/*36.13*/.input(restaurantForm("Address"),
						 '_showConstraints -> false,
						 '_class -> "no-dt")/*38.27*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*38.56*/("""
							<input type="text" class="form-control" name=""""),_display_(Seq[Any](/*39.55*/name)),format.raw/*39.59*/("""" id=""""),_display_(Seq[Any](/*39.66*/id)),format.raw/*39.68*/(""""
							placeholder="Phone">
					""")))})),format.raw/*41.7*/("""
					
					
				</div>
				<div class="modal-footer">
					<button type="submit" class="btn btn-success">Sign Up</button>
				</div>
			""")))})),format.raw/*48.5*/("""
		</div>
	</div>
</div>"""))}
    }
    
    def render(creator:models.Visitor,restaurantForm:play.data.Form[models.Restaurant]): play.api.templates.HtmlFormat.Appendable = apply(creator,restaurantForm)
    
    def f:((models.Visitor,play.data.Form[models.Restaurant]) => play.api.templates.HtmlFormat.Appendable) = (creator,restaurantForm) => apply(creator,restaurantForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Mar 31 21:05:07 ALMT 2014
                    SOURCE: C:/Users/User/Documents/GitHub/CSE-304-Project/app/views/restaurant/createRestaurant.scala.html
                    HASH: 18febc1d726c0e4f0e8365131e704124329ff5dd
                    MATRIX: 838->1|1007->76|1451->485|1466->491|1557->573|1597->575|1669->612|1684->618|1786->711|1853->740|1944->795|1970->799|2013->806|2037->808|2103->843|2151->856|2166->862|2268->955|2335->984|2427->1040|2453->1044|2496->1051|2520->1053|2587->1089|2635->1102|2650->1108|2752->1201|2819->1230|2909->1284|2935->1288|2978->1295|3002->1297|3069->1333|3117->1346|3132->1352|3236->1447|3303->1476|3394->1531|3420->1535|3463->1542|3487->1544|3554->1580|3723->1718
                    LINES: 26->1|29->1|40->12|40->12|40->12|40->12|43->15|43->15|45->17|45->17|46->18|46->18|46->18|46->18|48->20|50->22|50->22|52->24|52->24|53->25|53->25|53->25|53->25|55->27|57->29|57->29|59->31|59->31|60->32|60->32|60->32|60->32|62->34|64->36|64->36|66->38|66->38|67->39|67->39|67->39|67->39|69->41|76->48
                    -- GENERATED --
                */
            