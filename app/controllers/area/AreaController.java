package controllers.area;


import java.util.Date;
import java.util.List;
import java.util.Map;

import models.*;
import play.data.Form;
import play.mvc.*;
import views.*;
import static scala.collection.JavaConversions.*;


public class AreaController extends Controller{
	
	static public Form<Area> areaForm = Form.form(Area.class);
	
	public static Result createArea() {
		
		return ok(
				views.html.area.createAreaModal.render(areaForm)
				);
		
	}
	
	public static Result addArea(){
		
		Form<Area> filledAreaForm = areaForm.bindFromRequest();
		
		if(filledAreaForm.hasErrors()){
			return ok(filledAreaForm.errors().toString());
		}
		
		Area area = filledAreaForm.get();
		
		area.save();
		
		return ok("Registered");
	}
	
	
	
}
