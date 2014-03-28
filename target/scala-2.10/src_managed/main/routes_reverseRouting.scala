// @SOURCE:C:/Users/mostafiz/workspace/RestaurantDatabaseSystem/conf/routes
// @HASH:7e347569c20df59831221569e6361a5761d8b56e
// @DATE:Fri Mar 28 13:31:10 ALMT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:16
// @LINE:15
// @LINE:14
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
                          

// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:5
class ReverseVisitorEnd {
    

// @LINE:14
def signUp(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "signUp")
}
                                                

// @LINE:15
def signIn(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "signIn")
}
                                                

// @LINE:16
// @LINE:5
def index(): Call = {
   () match {
// @LINE:5
case () if true => Call("GET", _prefix)
                                                        
// @LINE:16
case () if true => Call("GET", _prefix + { _defaultPrefix } + "visitor")
                                                        
   }
}
                                                
    
}
                          
}
                  


// @LINE:16
// @LINE:15
// @LINE:14
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
              

// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:5
class ReverseVisitorEnd {
    

// @LINE:14
def signUp : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.VisitorEnd.signUp",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signUp"})
      }
   """
)
                        

// @LINE:15
def signIn : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.VisitorEnd.signIn",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signIn"})
      }
   """
)
                        

// @LINE:16
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
      }
   """
)
                        
    
}
              
}
        


// @LINE:16
// @LINE:15
// @LINE:14
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
                          

// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:5
class ReverseVisitorEnd {
    

// @LINE:14
def signUp(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.VisitorEnd.signUp(), HandlerDef(this, "controllers.VisitorEnd", "signUp", Seq(), "POST", """visitor """, _prefix + """signUp""")
)
                      

// @LINE:15
def signIn(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.VisitorEnd.signIn(), HandlerDef(this, "controllers.VisitorEnd", "signIn", Seq(), "POST", """""", _prefix + """signIn""")
)
                      

// @LINE:5
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.VisitorEnd.index(), HandlerDef(this, "controllers.VisitorEnd", "index", Seq(), "GET", """""", _prefix + """""")
)
                      
    
}
                          
}
        
    