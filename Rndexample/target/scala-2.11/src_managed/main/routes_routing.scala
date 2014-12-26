// @SOURCE:/home/crsip/datab/Rndexample/conf/routes
// @HASH:db7071e6c3cca9bfad5d6844c186cdf2a5dc7244
// @DATE:Wed Nov 05 11:44:02 IST 2014


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

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
private[this] lazy val controllers_Employeelist_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Employeelist_index0_invoker = createInvoker(
controllers.Employeelist.index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Employeelist", "index", Nil,"GET", """""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_Employeelist_createemp1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Employee"))))
private[this] lazy val controllers_Employeelist_createemp1_invoker = createInvoker(
controllers.Employeelist.createemp,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Employeelist", "createemp", Nil,"GET", """GET  /jsroutes.js                                 controllers.Report.jsRoutes()""", Routes.prefix + """Employee"""))
        

// @LINE:8
private[this] lazy val controllers_Employeelist_save2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Save"))))
private[this] lazy val controllers_Employeelist_save2_invoker = createInvoker(
controllers.Employeelist.save,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Employeelist", "save", Nil,"POST", """""", Routes.prefix + """Save"""))
        

// @LINE:9
private[this] lazy val controllers_Employeelist_updateEmp3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("update/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Employeelist_updateEmp3_invoker = createInvoker(
controllers.Employeelist.updateEmp(fakeValue[Int]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Employeelist", "updateEmp", Seq(classOf[Int]),"GET", """""", Routes.prefix + """update/$id<[^/]+>"""))
        

// @LINE:10
private[this] lazy val controllers_Employeelist_delete4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Delete/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Employeelist_delete4_invoker = createInvoker(
controllers.Employeelist.delete(fakeValue[Int]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Employeelist", "delete", Seq(classOf[Int]),"GET", """""", Routes.prefix + """Delete/$id<[^/]+>"""))
        

// @LINE:11
private[this] lazy val controllers_Employeelist_updates5_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("update/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Employeelist_updates5_invoker = createInvoker(
controllers.Employeelist.updates(fakeValue[Int]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Employeelist", "updates", Seq(classOf[Int]),"POST", """""", Routes.prefix + """update/$id<[^/]+>"""))
        

// @LINE:12
private[this] lazy val controllers_Employeelist_testapp6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("test"))))
private[this] lazy val controllers_Employeelist_testapp6_invoker = createInvoker(
controllers.Employeelist.testapp,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Employeelist", "testapp", Nil,"GET", """""", Routes.prefix + """test"""))
        

// @LINE:14
private[this] lazy val controllers_Assets_at7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at7_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path """, Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Employeelist.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Employee""","""controllers.Employeelist.createemp"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Save""","""controllers.Employeelist.save"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """update/$id<[^/]+>""","""controllers.Employeelist.updateEmp(id:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Delete/$id<[^/]+>""","""controllers.Employeelist.delete(id:Int)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """update/$id<[^/]+>""","""controllers.Employeelist.updates(id:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """test""","""controllers.Employeelist.testapp"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:5
case controllers_Employeelist_index0_route(params) => {
   call { 
        controllers_Employeelist_index0_invoker.call(controllers.Employeelist.index)
   }
}
        

// @LINE:7
case controllers_Employeelist_createemp1_route(params) => {
   call { 
        controllers_Employeelist_createemp1_invoker.call(controllers.Employeelist.createemp)
   }
}
        

// @LINE:8
case controllers_Employeelist_save2_route(params) => {
   call { 
        controllers_Employeelist_save2_invoker.call(controllers.Employeelist.save)
   }
}
        

// @LINE:9
case controllers_Employeelist_updateEmp3_route(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_Employeelist_updateEmp3_invoker.call(controllers.Employeelist.updateEmp(id))
   }
}
        

// @LINE:10
case controllers_Employeelist_delete4_route(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_Employeelist_delete4_invoker.call(controllers.Employeelist.delete(id))
   }
}
        

// @LINE:11
case controllers_Employeelist_updates5_route(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_Employeelist_updates5_invoker.call(controllers.Employeelist.updates(id))
   }
}
        

// @LINE:12
case controllers_Employeelist_testapp6_route(params) => {
   call { 
        controllers_Employeelist_testapp6_invoker.call(controllers.Employeelist.testapp)
   }
}
        

// @LINE:14
case controllers_Assets_at7_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at7_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     