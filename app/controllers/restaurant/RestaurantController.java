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
		
		List<Franchise> franchises= Franchise.find.all();
		
		return ok(
				views.html.restaurant.createRestaurant.render(restaurantForm, asScalaBuffer(franchises))
				);
		
	}
	
	public static Result addRestaurant(){
		
		Form<Restaurant> filledRestaurantForm = restaurantForm.bindFromRequest();
		
		if(filledRestaurantForm.hasErrors()){
			return ok(filledRestaurantForm.errors().toString());
		}
		
		Restaurant restaurant = filledRestaurantForm.get();
		
		Visitor creator=Visitor.find.byId(Long.parseLong(session("userID")));
		restaurant.creator=creator;
		restaurant.save();
		
		return ok("Registered");
	}
	
	
	
	
}
