// @SOURCE:C:/Users/mostafiz/workspace/RestaurantDatabaseSystem/conf/routes
// @HASH:bbd908d9622d7921543336d1191c731c3238d39b
// @DATE:Fri Mar 28 18:36:41 ALMT 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:5
private[this] lazy val controllers_VisitorEnd_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:8
private[this] lazy val controllers_Assets_at1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:9
private[this] lazy val controllers_WebJarAssets_at2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("webjars/"),DynamicPart("file", """.+""",false))))
        

// @LINE:14
private[this] lazy val controllers_VisitorEnd_signUp3 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signUp"))))
        

// @LINE:15
private[this] lazy val controllers_VisitorEnd_signIn4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signIn"))))
        

// @LINE:16
private[this] lazy val controllers_VisitorEnd_index5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("visitor"))))
        

// @LINE:17
private[this] lazy val controllers_VisitorEnd_index6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("showRestaurant"))))
        
def documentation = List(("""GET""", prefix,"""controllers.VisitorEnd.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """webjars/$file<.+>""","""controllers.WebJarAssets.at(file:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signUp""","""controllers.VisitorEnd.signUp()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signIn""","""controllers.VisitorEnd.signIn()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """visitor""","""controllers.VisitorEnd.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """showRestaurant""","""controllers.VisitorEnd.index()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:5
case controllers_VisitorEnd_index0(params) => {
   call { 
        invokeHandler(controllers.VisitorEnd.index(), HandlerDef(this, "controllers.VisitorEnd", "index", Nil,"GET", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:8
case controllers_Assets_at1(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:9
case controllers_WebJarAssets_at2(params) => {
   call(params.fromPath[String]("file", None)) { (file) =>
        invokeHandler(controllers.WebJarAssets.at(file), HandlerDef(this, "controllers.WebJarAssets", "at", Seq(classOf[String]),"GET", """""", Routes.prefix + """webjars/$file<.+>"""))
   }
}
        

// @LINE:14
case controllers_VisitorEnd_signUp3(params) => {
   call { 
        invokeHandler(controllers.VisitorEnd.signUp(), HandlerDef(this, "controllers.VisitorEnd", "signUp", Nil,"POST", """visitor """, Routes.prefix + """signUp"""))
   }
}
        

// @LINE:15
case controllers_VisitorEnd_signIn4(params) => {
   call { 
        invokeHandler(controllers.VisitorEnd.signIn(), HandlerDef(this, "controllers.VisitorEnd", "signIn", Nil,"POST", """""", Routes.prefix + """signIn"""))
   }
}
        

// @LINE:16
case controllers_VisitorEnd_index5(params) => {
   call { 
        invokeHandler(controllers.VisitorEnd.index(), HandlerDef(this, "controllers.VisitorEnd", "index", Nil,"GET", """""", Routes.prefix + """visitor"""))
   }
}
        

// @LINE:17
case controllers_VisitorEnd_index6(params) => {
   call { 
        invokeHandler(controllers.VisitorEnd.index(), HandlerDef(this, "controllers.VisitorEnd", "index", Nil,"GET", """""", Routes.prefix + """showRestaurant"""))
   }
}
        
}

}
     