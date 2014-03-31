package controllers.restaurant;

import java.util.Date;
import java.util.List;
import java.util.Map;

import models.*;
import play.data.Form;
import play.mvc.*;
import views.*;
import static scala.collection.JavaConversions.*;

public class RestaurantController extends Controller{
	
	static public Form<Restaurant> restaurantForm=Form.form(Restaurant.class);
	
	public static Result createRestaurant() {
		
		Visitor creator = Visitor.find.byId(Long.parseLong(session("userId")));
		
		
		
		return ok(views.html.restaurant.createRestaurant.render(restaurantForm));
		//return ok(views.html.bill.createBill.render(billForm, asScalaBuffer(Apartment.find.all())));
	}
	
	public static Result addRestaurant(){
		
		Form<Restaurant> filledRestaurantForm = restaurantForm.bindFromRequest();
		
		if(filledRestaurantForm.hasErrors()){
			return ok(filledRestaurantForm.errors().toString());
		}
		
		Restaurant restaurant = filledRestaurantForm.get();
		
		restaurant.save();
		
		return ok("Registered");
	}
	
	
}
