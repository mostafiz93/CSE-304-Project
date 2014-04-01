// @SOURCE:C:/Users/User/Documents/GitHub/CSE-304-Project/conf/routes
// @HASH:f63dc93f0e21f7de9a51e2f9a84b9c74616f2985
// @DATE:Tue Apr 01 04:56:18 ALMT 2014


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
        

// @LINE:12
private[this] lazy val controllers_restaurant_RestaurantController_addRestaurant3 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createRestaurant"))))
        

// @LINE:13
private[this] lazy val controllers_area_AreaController_addArea4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createArea"))))
        

// @LINE:17
private[this] lazy val controllers_VisitorEnd_signUp5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signUp"))))
        

// @LINE:18
private[this] lazy val controllers_VisitorEnd_signIn6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signIn"))))
        

// @LINE:19
private[this] lazy val controllers_VisitorEnd_index7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("visitor"))))
        

// @LINE:20
private[this] lazy val controllers_VisitorEnd_index8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("showRestaurant"))))
        
def documentation = List(("""GET""", prefix,"""controllers.VisitorEnd.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """webjars/$file<.+>""","""controllers.WebJarAssets.at(file:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createRestaurant""","""controllers.restaurant.RestaurantController.addRestaurant()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createArea""","""controllers.area.AreaController.addArea()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signUp""","""controllers.VisitorEnd.signUp()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signIn""","""controllers.VisitorEnd.signIn()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """visitor""","""controllers.VisitorEnd.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """showRestaurant""","""controllers.VisitorEnd.index()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
        

// @LINE:12
case controllers_restaurant_RestaurantController_addRestaurant3(params) => {
   call { 
        invokeHandler(controllers.restaurant.RestaurantController.addRestaurant(), HandlerDef(this, "controllers.restaurant.RestaurantController", "addRestaurant", Nil,"POST", """restaurants""", Routes.prefix + """createRestaurant"""))
   }
}
        

// @LINE:13
case controllers_area_AreaController_addArea4(params) => {
   call { 
        invokeHandler(controllers.area.AreaController.addArea(), HandlerDef(this, "controllers.area.AreaController", "addArea", Nil,"POST", """""", Routes.prefix + """createArea"""))
   }
}
        

// @LINE:17
case controllers_VisitorEnd_signUp5(params) => {
   call { 
        invokeHandler(controllers.VisitorEnd.signUp(), HandlerDef(this, "controllers.VisitorEnd", "signUp", Nil,"POST", """visitor """, Routes.prefix + """signUp"""))
   }
}
        

// @LINE:18
case controllers_VisitorEnd_signIn6(params) => {
   call { 
        invokeHandler(controllers.VisitorEnd.signIn(), HandlerDef(this, "controllers.VisitorEnd", "signIn", Nil,"POST", """""", Routes.prefix + """signIn"""))
   }
}
        

// @LINE:19
case controllers_VisitorEnd_index7(params) => {
   call { 
        invokeHandler(controllers.VisitorEnd.index(), HandlerDef(this, "controllers.VisitorEnd", "index", Nil,"GET", """""", Routes.prefix + """visitor"""))
   }
}
        

// @LINE:20
case controllers_VisitorEnd_index8(params) => {
   call { 
        invokeHandler(controllers.VisitorEnd.index(), HandlerDef(this, "controllers.VisitorEnd", "index", Nil,"GET", """""", Routes.prefix + """showRestaurant"""))
   }
}
        
}

}
     