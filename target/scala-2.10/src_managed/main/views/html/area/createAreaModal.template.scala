
package views.html.area

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
/* createAreaModal Template File */
object createAreaModal extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.data.Form[models.Area],play.api.templates.HtmlFormat.Appendable] {

    /* createAreaModal Template File */
    def apply/*2.2*/(areaForm: play.data.Form[models.Area]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*2.41*/("""

"""),format.raw/*5.1*/("""
<div class="modal fade" id="createArea" tabindex="-1" role="dialog"
	aria-labelledby="createAreaLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">&times;</button>
				<h4 class="modal-title" id="createAreatLabel">Add Area</h4>
			</div>
			"""),_display_(Seq[Any](/*15.5*/helper/*15.11*/.form(action = controllers.area.routes.AreaController.addArea())/*15.75*/ {_display_(Seq[Any](format.raw/*15.77*/("""
				<div class="modal-body">

					"""),_display_(Seq[Any](/*18.7*/helper/*18.13*/.input(areaForm("areaName"),
						 '_showConstraints -> false, 
						 '_class -> "no-dt")/*20.27*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*20.56*/("""
							<input type="text" class="form-control" name=""""),_display_(Seq[Any](/*21.55*/name)),format.raw/*21.59*/("""" id=""""),_display_(Seq[Any](/*21.66*/id)),format.raw/*21.68*/(""""
							placeholder="Area Name">
					""")))})),format.raw/*23.7*/("""
					
				</div>
				<div class="modal-footer">
					<button type="submit" class="btn btn-success">Sign Up</button>
				</div>
			""")))})),format.raw/*29.5*/("""
		</div>
	</div>
</div>
"""))}
    }
    
    def render(areaForm:play.data.Form[models.Area]): play.api.templates.HtmlFormat.Appendable = apply(areaForm)
    
    def f:((play.data.Form[models.Area]) => play.api.templates.HtmlFormat.Appendable) = (areaForm) => apply(areaForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Apr 01 04:57:56 ALMT 2014
                    SOURCE: C:/Users/User/Documents/GitHub/CSE-304-Project/app/views/area/createAreaModal.scala.html
                    HASH: 06b268153120e001edef498fdeed365b54fd9b17
                    MATRIX: 872->37|1021->76|1049->95|1476->487|1491->493|1564->557|1604->559|1676->596|1691->602|1791->693|1858->722|1949->777|1975->781|2018->788|2042->790|2113->830|2276->962
                    LINES: 26->2|30->2|32->5|42->15|42->15|42->15|42->15|45->18|45->18|47->20|47->20|48->21|48->21|48->21|48->21|50->23|56->29
                    -- GENERATED --
                */
            