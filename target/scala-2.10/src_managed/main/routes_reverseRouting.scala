// @SOURCE:C:/Users/User/Documents/GitHub/CSE-304-Project/conf/routes
// @HASH:7a6cb9f7dfab195572e9fe2b572f3fcc87de628b
// @DATE:Tue Apr 01 09:53:50 ALMT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
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
                          

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:5
class ReverseVisitorEnd {
    

// @LINE:17
def signUp(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "signUp")
}
                                                

// @LINE:18
def signIn(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "signIn")
}
                                                

// @LINE:20
// @LINE:19
// @LINE:5
def index(): Call = {
   () match {
// @LINE:5
case () if true => Call("GET", _prefix)
                                                        
// @LINE:19
case () if true => Call("GET", _prefix + { _defaultPrefix } + "visitor")
                                                        
// @LINE:20
case () if true => Call("GET", _prefix + { _defaultPrefix } + "showRestaurant")
                                                        
   }
}
                                                
    
}
                          
}
                  

// @LINE:13
// @LINE:12
package controllers.restaurant {

// @LINE:13
// @LINE:12
class ReverseRestaurantController {
    

// @LINE:13
def addRestaurant(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "createRestaurant")
}
                                                

// @LINE:12
def createRestaurant(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "addnewRestaurant")
}
                                                
    
}
                          
}
                  

// @LINE:14
package controllers.area {

// @LINE:14
class ReverseAreaController {
    

// @LINE:14
def addArea(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "createArea")
}
                                                
    
}
                          
}
                  


// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
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
              

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:5
class ReverseVisitorEnd {
    

// @LINE:17
def signUp : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.VisitorEnd.signUp",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signUp"})
      }
   """
)
                        

// @LINE:18
def signIn : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.VisitorEnd.signIn",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signIn"})
      }
   """
)
                        

// @LINE:20
// @LINE:19
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
        

// @LINE:13
// @LINE:12
package controllers.restaurant.javascript {

// @LINE:13
// @LINE:12
class ReverseRestaurantController {
    

// @LINE:13
def addRestaurant : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.restaurant.RestaurantController.addRestaurant",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createRestaurant"})
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
        

// @LINE:14
package controllers.area.javascript {

// @LINE:14
class ReverseAreaController {
    

// @LINE:14
def addArea : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.area.AreaController.addArea",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createArea"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
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
                          

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:5
class ReverseVisitorEnd {
    

// @LINE:17
def signUp(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.VisitorEnd.signUp(), HandlerDef(this, "controllers.VisitorEnd", "signUp", Seq(), "POST", """visitor """, _prefix + """signUp""")
)
                      

// @LINE:18
def signIn(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.VisitorEnd.signIn(), HandlerDef(this, "controllers.VisitorEnd", "signIn", Seq(), "POST", """""", _prefix + """signIn""")
)
                      

// @LINE:5
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.VisitorEnd.index(), HandlerDef(this, "controllers.VisitorEnd", "index", Seq(), "GET", """""", _prefix + """""")
)
                      
    
}
                          
}
        

// @LINE:13
// @LINE:12
package controllers.restaurant.ref {


// @LINE:13
// @LINE:12
class ReverseRestaurantController {
    

// @LINE:13
def addRestaurant(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.restaurant.RestaurantController.addRestaurant(), HandlerDef(this, "controllers.restaurant.RestaurantController", "addRestaurant", Seq(), "POST", """""", _prefix + """createRestaurant""")
)
                      

// @LINE:12
def createRestaurant(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.restaurant.RestaurantController.createRestaurant(), HandlerDef(this, "controllers.restaurant.RestaurantController", "createRestaurant", Seq(), "GET", """restaurants""", _prefix + """addnewRestaurant""")
)
                      
    
}
                          
}
        

// @LINE:14
package controllers.area.ref {


// @LINE:14
class ReverseAreaController {
    

// @LINE:14
def addArea(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.area.AreaController.addArea(), HandlerDef(this, "controllers.area.AreaController", "addArea", Seq(), "POST", """""", _prefix + """createArea""")
)
                      
    
}
                          
}
        
    