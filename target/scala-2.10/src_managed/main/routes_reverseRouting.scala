// @SOURCE:G:/Play/Restaurant Database/conf/routes
// @HASH:e90b0ed418549f15f02cc988f9bc340570432a05
// @DATE:Tue Apr 01 23:08:05 ALMT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:9
// @LINE:8
// @LINE:5
package controllers {

// @LINE:9
class ReverseWebJarAssets {
    

// @LINE:9
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "webjars/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:8
class ReverseAssets {
    

// @LINE:8
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:5
class ReverseVisitorEnd {
    

// @LINE:27
def signUp(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "signUp")
}
                                                

// @LINE:28
def signIn(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "signIn")
}
                                                

// @LINE:30
// @LINE:29
// @LINE:5
def index(): Call = {
   () match {
// @LINE:5
case () if true => Call("GET", _prefix)
                                                        
// @LINE:29
case () if true => Call("GET", _prefix + { _defaultPrefix } + "visitor")
                                                        
// @LINE:30
case () if true => Call("GET", _prefix + { _defaultPrefix } + "showRestaurant")
                                                        
   }
}
                                                
    
}
                          
}
                  

// @LINE:22
// @LINE:21
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
package controllers.restaurant {

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
class ReverseRestaurantController {
    

// @LINE:13
def addRestaurant(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "newRestaurant")
}
                                                

// @LINE:15
def showAllRestaurant(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "viewRestaurants")
}
                                                

// @LINE:14
def showRestaurantProfile(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "showProfile/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:12
def createRestaurant(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "addnewRestaurant")
}
                                                
    
}
                          

// @LINE:22
// @LINE:21
class ReverseRestaurantFoodController {
    

// @LINE:21
def addFoodInMenu(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "addInMenu/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:22
def addFoodInRestaurant(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "addedInMenu/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                
    
}
                          
}
                  

// @LINE:24
// @LINE:23
package controllers.foods {

// @LINE:24
// @LINE:23
class ReverseFoodController {
    

// @LINE:24
def saveFood(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "addedFood")
}
                                                

// @LINE:23
def addNewFood(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "addNewItem")
}
                                                
    
}
                          
}
                  

// @LINE:17
// @LINE:16
package controllers.franchise {

// @LINE:17
// @LINE:16
class ReverseFranchiseController {
    

// @LINE:16
def createFranchise(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "createFranchise")
}
                                                

// @LINE:17
def addNewFranhcise(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "newFranchise")
}
                                                
    
}
                          
}
                  


// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:9
// @LINE:8
// @LINE:5
package controllers.javascript {

// @LINE:9
class ReverseWebJarAssets {
    

// @LINE:9
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WebJarAssets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:8
class ReverseAssets {
    

// @LINE:8
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:5
class ReverseVisitorEnd {
    

// @LINE:27
def signUp : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.VisitorEnd.signUp",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signUp"})
      }
   """
)
                        

// @LINE:28
def signIn : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.VisitorEnd.signIn",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signIn"})
      }
   """
)
                        

// @LINE:30
// @LINE:29
// @LINE:5
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.VisitorEnd.index",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "visitor"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showRestaurant"})
      }
      }
   """
)
                        
    
}
              
}
        

// @LINE:22
// @LINE:21
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
package controllers.restaurant.javascript {

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
class ReverseRestaurantController {
    

// @LINE:13
def addRestaurant : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.restaurant.RestaurantController.addRestaurant",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "newRestaurant"})
      }
   """
)
                        

// @LINE:15
def showAllRestaurant : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.restaurant.RestaurantController.showAllRestaurant",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewRestaurants"})
      }
   """
)
                        

// @LINE:14
def showRestaurantProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.restaurant.RestaurantController.showRestaurantProfile",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showProfile/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:12
def createRestaurant : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.restaurant.RestaurantController.createRestaurant",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addnewRestaurant"})
      }
   """
)
                        
    
}
              

// @LINE:22
// @LINE:21
class ReverseRestaurantFoodController {
    

// @LINE:21
def addFoodInMenu : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.restaurant.RestaurantFoodController.addFoodInMenu",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addInMenu/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:22
def addFoodInRestaurant : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.restaurant.RestaurantFoodController.addFoodInRestaurant",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addedInMenu/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              
}
        

// @LINE:24
// @LINE:23
package controllers.foods.javascript {

// @LINE:24
// @LINE:23
class ReverseFoodController {
    

// @LINE:24
def saveFood : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.foods.FoodController.saveFood",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addedFood"})
      }
   """
)
                        

// @LINE:23
def addNewFood : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.foods.FoodController.addNewFood",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addNewItem"})
      }
   """
)
                        
    
}
              
}
        

// @LINE:17
// @LINE:16
package controllers.franchise.javascript {

// @LINE:17
// @LINE:16
class ReverseFranchiseController {
    

// @LINE:16
def createFranchise : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.franchise.FranchiseController.createFranchise",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createFranchise"})
      }
   """
)
                        

// @LINE:17
def addNewFranhcise : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.franchise.FranchiseController.addNewFranhcise",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "newFranchise"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:9
// @LINE:8
// @LINE:5
package controllers.ref {


// @LINE:9
class ReverseWebJarAssets {
    

// @LINE:9
def at(file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WebJarAssets.at(file), HandlerDef(this, "controllers.WebJarAssets", "at", Seq(classOf[String]), "GET", """""", _prefix + """webjars/$file<.+>""")
)
                      
    
}
                          

// @LINE:8
class ReverseAssets {
    

// @LINE:8
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:5
class ReverseVisitorEnd {
    

// @LINE:27
def signUp(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.VisitorEnd.signUp(), HandlerDef(this, "controllers.VisitorEnd", "signUp", Seq(), "POST", """visitor """, _prefix + """signUp""")
)
                      

// @LINE:28
def signIn(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.VisitorEnd.signIn(), HandlerDef(this, "controllers.VisitorEnd", "signIn", Seq(), "POST", """""", _prefix + """signIn""")
)
                      

// @LINE:5
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.VisitorEnd.index(), HandlerDef(this, "controllers.VisitorEnd", "index", Seq(), "GET", """""", _prefix + """""")
)
                      
    
}
                          
}
        

// @LINE:22
// @LINE:21
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
package controllers.restaurant.ref {


// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
class ReverseRestaurantController {
    

// @LINE:13
def addRestaurant(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.restaurant.RestaurantController.addRestaurant(), HandlerDef(this, "controllers.restaurant.RestaurantController", "addRestaurant", Seq(), "POST", """""", _prefix + """newRestaurant""")
)
                      

// @LINE:15
def showAllRestaurant(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.restaurant.RestaurantController.showAllRestaurant(), HandlerDef(this, "controllers.restaurant.RestaurantController", "showAllRestaurant", Seq(), "GET", """""", _prefix + """viewRestaurants""")
)
                      

// @LINE:14
def showRestaurantProfile(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.restaurant.RestaurantController.showRestaurantProfile(id), HandlerDef(this, "controllers.restaurant.RestaurantController", "showRestaurantProfile", Seq(classOf[Long]), "GET", """""", _prefix + """showProfile/$id<[^/]+>""")
)
                      

// @LINE:12
def createRestaurant(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.restaurant.RestaurantController.createRestaurant(), HandlerDef(this, "controllers.restaurant.RestaurantController", "createRestaurant", Seq(), "GET", """restaurants""", _prefix + """addnewRestaurant""")
)
                      
    
}
                          

// @LINE:22
// @LINE:21
class ReverseRestaurantFoodController {
    

// @LINE:21
def addFoodInMenu(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.restaurant.RestaurantFoodController.addFoodInMenu(id), HandlerDef(this, "controllers.restaurant.RestaurantFoodController", "addFoodInMenu", Seq(classOf[Long]), "GET", """food""", _prefix + """addInMenu/$id<[^/]+>""")
)
                      

// @LINE:22
def addFoodInRestaurant(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.restaurant.RestaurantFoodController.addFoodInRestaurant(id), HandlerDef(this, "controllers.restaurant.RestaurantFoodController", "addFoodInRestaurant", Seq(classOf[Long]), "POST", """""", _prefix + """addedInMenu/$id<[^/]+>""")
)
                      
    
}
                          
}
        

// @LINE:24
// @LINE:23
package controllers.foods.ref {


// @LINE:24
// @LINE:23
class ReverseFoodController {
    

// @LINE:24
def saveFood(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.foods.FoodController.saveFood(), HandlerDef(this, "controllers.foods.FoodController", "saveFood", Seq(), "POST", """""", _prefix + """addedFood""")
)
                      

// @LINE:23
def addNewFood(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.foods.FoodController.addNewFood(), HandlerDef(this, "controllers.foods.FoodController", "addNewFood", Seq(), "GET", """""", _prefix + """addNewItem""")
)
                      
    
}
                          
}
        

// @LINE:17
// @LINE:16
package controllers.franchise.ref {


// @LINE:17
// @LINE:16
class ReverseFranchiseController {
    

// @LINE:16
def createFranchise(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.franchise.FranchiseController.createFranchise(), HandlerDef(this, "controllers.franchise.FranchiseController", "createFranchise", Seq(), "GET", """""", _prefix + """createFranchise""")
)
                      

// @LINE:17
def addNewFranhcise(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.franchise.FranchiseController.addNewFranhcise(), HandlerDef(this, "controllers.franchise.FranchiseController", "addNewFranhcise", Seq(), "POST", """""", _prefix + """newFranchise""")
)
                      
    
}
                          
}
        
    