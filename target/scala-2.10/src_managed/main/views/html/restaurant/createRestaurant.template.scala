
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
object createRestaurant extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[play.data.Form[models.Restaurant],Seq[models.Franchise],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(restaurantForm: play.data.Form[models.Restaurant], franchises : Seq[models.Franchise]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.89*/("""

"""),format.raw/*4.1*/("""
<div class="modal fade" id="createRestaurant" tabindex="-1" role="dialog"
	aria-labelledby="createRestaurantLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">&times;</button>
				<h4 class="modal-title" id="createRestaurantLabel">Sign Up</h4>
			</div>
			"""),_display_(Seq[Any](/*14.5*/helper/*14.11*/.form(action = controllers.restaurant.routes.RestaurantController.addRestaurant())/*14.93*/ {_display_(Seq[Any](format.raw/*14.95*/("""
				<div class="modal-body">

					"""),_display_(Seq[Any](/*17.7*/helper/*17.13*/.input(restaurantForm("name"),
						 '_showConstraints -> false, 
						 '_class -> "no-dt")/*19.27*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*19.56*/("""
							<input type="text" class="form-control" name=""""),_display_(Seq[Any](/*20.55*/name)),format.raw/*20.59*/("""" id=""""),_display_(Seq[Any](/*20.66*/id)),format.raw/*20.68*/(""""
							placeholder="Name">
					""")))})),format.raw/*22.7*/("""
					
					"""),_display_(Seq[Any](/*24.7*/helper/*24.13*/.input(restaurantForm("email"),
						 '_showConstraints -> false,
						 '_class -> "no-dt")/*26.27*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*26.56*/("""
							<input type="email" class="form-control" name=""""),_display_(Seq[Any](/*27.56*/name)),format.raw/*27.60*/("""" id=""""),_display_(Seq[Any](/*27.67*/id)),format.raw/*27.69*/(""""
							placeholder="Email">
					""")))})),format.raw/*29.7*/("""
					
					"""),_display_(Seq[Any](/*31.7*/helper/*31.13*/.input(restaurantForm("phone"),
						 '_showConstraints -> false,
						 '_class -> "no-dt")/*33.27*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*33.56*/("""
							<input type="tel" class="form-control" name=""""),_display_(Seq[Any](/*34.54*/name)),format.raw/*34.58*/("""" id=""""),_display_(Seq[Any](/*34.65*/id)),format.raw/*34.67*/(""""
							placeholder="Phone">
					""")))})),format.raw/*36.7*/("""
					
					"""),_display_(Seq[Any](/*38.7*/helper/*38.13*/.input(restaurantForm("Address"),
						 '_showConstraints -> false,
						 '_class -> "no-dt")/*40.27*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*40.56*/("""
							<input type="text" class="form-control" name=""""),_display_(Seq[Any](/*41.55*/name)),format.raw/*41.59*/("""" id=""""),_display_(Seq[Any](/*41.66*/id)),format.raw/*41.68*/(""""
							placeholder="Phone">
					""")))})),format.raw/*43.7*/("""
					
					"""),_display_(Seq[Any](/*45.7*/helper/*45.13*/.select(field = restaurantForm("franchise"), franchises.map {a => a.id.toString -> a.franchiseTitle}, '_label -> "Choose Franchise"))),format.raw/*45.145*/("""
					
					
				</div>
				<div class="modal-footer">
					<button type="submit" class="btn btn-success">Sign Up</button>
				</div>
			""")))})),format.raw/*52.5*/("""
		</div>
	</div>
</div>"""))}
    }
    
    def render(restaurantForm:play.data.Form[models.Restaurant],franchises:Seq[models.Franchise]): play.api.templates.HtmlFormat.Appendable = apply(restaurantForm,franchises)
    
    def f:((play.data.Form[models.Restaurant],Seq[models.Franchise]) => play.api.templates.HtmlFormat.Appendable) = (restaurantForm,franchises) => apply(restaurantForm,franchises)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Apr 01 04:57:56 ALMT 2014
                    SOURCE: C:/Users/User/Documents/GitHub/CSE-304-Project/app/views/restaurant/createRestaurant.scala.html
                    HASH: 0572cbf2b0baf69656a8b6086cce5aed5714a9a8
                    MATRIX: 845->1|1042->88|1070->107|1513->515|1528->521|1619->603|1659->605|1731->642|1746->648|1848->741|1915->770|2006->825|2032->829|2075->836|2099->838|2165->873|2213->886|2228->892|2330->985|2397->1014|2489->1070|2515->1074|2558->1081|2582->1083|2649->1119|2697->1132|2712->1138|2814->1231|2881->1260|2971->1314|2997->1318|3040->1325|3064->1327|3131->1363|3179->1376|3194->1382|3298->1477|3365->1506|3456->1561|3482->1565|3525->1572|3549->1574|3616->1610|3664->1623|3679->1629|3834->1761|4003->1899
                    LINES: 26->1|30->1|32->4|42->14|42->14|42->14|42->14|45->17|45->17|47->19|47->19|48->20|48->20|48->20|48->20|50->22|52->24|52->24|54->26|54->26|55->27|55->27|55->27|55->27|57->29|59->31|59->31|61->33|61->33|62->34|62->34|62->34|62->34|64->36|66->38|66->38|68->40|68->40|69->41|69->41|69->41|69->41|71->43|73->45|73->45|73->45|80->52
                    -- GENERATED --
                */
            