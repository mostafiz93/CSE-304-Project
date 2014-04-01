// @SOURCE:C:/Users/User/Documents/GitHub/CSE-304-Project/conf/routes
// @HASH:bc7eec3f9c70aba8092e917df00f732a79397f35
// @DATE:Tue Apr 01 12:02:36 ALMT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
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
                          

// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:5
class ReverseVisitorEnd {
    

// @LINE:21
def signUp(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "signUp")
}
                                                

// @LINE:22
def signIn(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "signIn")
}
                                                

// @LINE:24
// @LINE:23
// @LINE:5
def index(): Call = {
   () match {
// @LINE:5
case () if true => Call("GET", _prefix)
                                                        
// @LINE:23
case () if true => Call("GET", _prefix + { _defaultPrefix } + "visitor")
                                                        
// @LINE:24
case () if true => Call("GET", _prefix + { _defaultPrefix } + "showRestaurant")
                                                        
   }
}
                                                
    
}
                          
}
                  

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
   Call("POST", _prefix + { _defaultPrefix } + "viewRestaurants")
}
                                                

// @LINE:14
def showRestaurantProfile(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "showProfile/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:12
def createRestaurant(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "addnewRestaurant")
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
   Call("POST", _prefix + { _defaultPrefix } + "createFranchise")
}
                                                

// @LINE:17
def addNewFranhcise(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "newFranchise")
}
                                                
    
}
                          
}
                  


// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
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
              

// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:5
class ReverseVisitorEnd {
    

// @LINE:21
def signUp : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.VisitorEnd.signUp",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signUp"})
      }
   """
)
                        

// @LINE:22
def signIn : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.VisitorEnd.signIn",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signIn"})
      }
   """
)
                        

// @LINE:24
// @LINE:23
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
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "viewRestaurants"})
      }
   """
)
                        

// @LINE:14
def showRestaurantProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.restaurant.RestaurantController.showRestaurantProfile",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "showProfile/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
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
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createFranchise"})
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
        


// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
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
                          

// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:5
class ReverseVisitorEnd {
    

// @LINE:21
def signUp(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.VisitorEnd.signUp(), HandlerDef(this, "controllers.VisitorEnd", "signUp", Seq(), "POST", """visitor """, _prefix + """signUp""")
)
                      

// @LINE:22
def signIn(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.VisitorEnd.signIn(), HandlerDef(this, "controllers.VisitorEnd", "signIn", Seq(), "POST", """""", _prefix + """signIn""")
)
                      

// @LINE:5
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.VisitorEnd.index(), HandlerDef(this, "controllers.VisitorEnd", "index", Seq(), "GET", """""", _prefix + """""")
)
                      
    
}
                          
}
        

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
   controllers.restaurant.RestaurantController.showAllRestaurant(), HandlerDef(this, "controllers.restaurant.RestaurantController", "showAllRestaurant", Seq(), "POST", """""", _prefix + """viewRestaurants""")
)
                      

// @LINE:14
def showRestaurantProfile(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.restaurant.RestaurantController.showRestaurantProfile(id), HandlerDef(this, "controllers.restaurant.RestaurantController", "showRestaurantProfile", Seq(classOf[Long]), "POST", """""", _prefix + """showProfile/$id<[^/]+>""")
)
                      

// @LINE:12
def createRestaurant(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.restaurant.RestaurantController.createRestaurant(), HandlerDef(this, "controllers.restaurant.RestaurantController", "createRestaurant", Seq(), "GET", """restaurants""", _prefix + """addnewRestaurant""")
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
   controllers.franchise.FranchiseController.createFranchise(), HandlerDef(this, "controllers.franchise.FranchiseController", "createFranchise", Seq(), "POST", """""", _prefix + """createFranchise""")
)
                      

// @LINE:17
def addNewFranhcise(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.franchise.FranchiseController.addNewFranhcise(), HandlerDef(this, "controllers.franchise.FranchiseController", "addNewFranhcise", Seq(), "POST", """""", _prefix + """newFranchise""")
)
                      
    
}
                          
}
        
    