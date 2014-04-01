package controllers.franchise;


import java.util.Date;
import java.util.List;
import java.util.Map;

import models.*;
import play.data.Form;
import play.mvc.*;
import views.*;


public class FranchiseController extends Controller{
	
	static public Form<Franchise> franchiseForm = Form.form(Franchise.class);
	
	public static Result createFranchise() {
		
		return ok(
				views.html.franchise.crateFranchise.render(franchiseForm)
				);
		
	}
	
	
	public static Result addNewFranhcise(){
		
		Form<Franchise> filledFranchiseForm = franchiseForm.bindFromRequest();
		
		if(filledFranchiseForm.hasErrors()){
			return ok(filledFranchiseForm.errors().toString());
		}
		
		Franchise franchise=filledFranchiseForm.get();
		
		franchise.save();
		
		return ok("Franchise Added!");
	}
	
	
	
}
