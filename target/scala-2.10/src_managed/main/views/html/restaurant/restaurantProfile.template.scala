
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
object restaurantProfile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Restaurant,List[RestaurantFood],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(restaurant : Restaurant, foods : List[RestaurantFood]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.57*/("""

"""),_display_(Seq[Any](/*3.2*/common/*3.8*/.main("Restaurant")/*3.27*/ {_display_(Seq[Any](format.raw/*3.29*/("""
	
	<h2>"""),_display_(Seq[Any](/*5.7*/restaurant/*5.17*/.name)),format.raw/*5.22*/("""</h2>

	<div class="panel panel-default">
		  <!-- Default panel contents -->
		  <div class="panel-heading"><h3> Bill Records </h3></div>
		  <div class="panel-body">	   
		 </div>
	
	<table class="table table-bordered table-striped table-hover">
		
		<tr>
			<th> <h4> Food Item </h4> </th>
			<th> <h4> Item Price </h4> </th>
			<th> <h4> Date of IssuinRating </h4> </th>
		</tr>
								
		"""),_display_(Seq[Any](/*21.4*/for(food <- foods) yield /*21.22*/{_display_(Seq[Any](format.raw/*21.23*/("""
			<tr>		    
		        <th> <h5>"""),_display_(Seq[Any](/*23.21*/food/*23.25*/.foodItem.itemTitle)),format.raw/*23.44*/("""</h5> </th>
		        <th> <h5>"""),_display_(Seq[Any](/*24.21*/food/*24.25*/.price)),format.raw/*24.31*/("""</h5> </th>
		        <th> <h5>"""),_display_(Seq[Any](/*25.21*/food/*25.25*/.rating)),format.raw/*25.32*/("""</h5> </th>
		    </tr>		    		    
		    """)))})),format.raw/*27.8*/("""
		    
	</table>

""")))})),format.raw/*31.2*/("""

"""))}
    }
    
    def render(restaurant:Restaurant,foods:List[RestaurantFood]): play.api.templates.HtmlFormat.Appendable = apply(restaurant,foods)
    
    def f:((Restaurant,List[RestaurantFood]) => play.api.templates.HtmlFormat.Appendable) = (restaurant,foods) => apply(restaurant,foods)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Apr 01 12:02:38 ALMT 2014
                    SOURCE: C:/Users/User/Documents/GitHub/CSE-304-Project/app/views/restaurant/restaurantProfile.scala.html
                    HASH: 9088fa129e1d966377df10481a6bab050a9caf98
                    MATRIX: 822->1|971->56|1008->59|1021->65|1048->84|1087->86|1130->95|1148->105|1174->110|1604->505|1638->523|1677->524|1748->559|1761->563|1802->582|1870->614|1883->618|1911->624|1979->656|1992->660|2021->667|2095->710|2146->730
                    LINES: 26->1|29->1|31->3|31->3|31->3|31->3|33->5|33->5|33->5|49->21|49->21|49->21|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|55->27|59->31
                    -- GENERATED --
                */
            