// @SOURCE:/home/crsip/datab/Rndexample/conf/routes
// @HASH:db7071e6c3cca9bfad5d6844c186cdf2a5dc7244
// @DATE:Wed Nov 05 11:44:02 IST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:5
package controllers {

// @LINE:14
class ReverseAssets {


// @LINE:14
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:5
class ReverseEmployeelist {


// @LINE:12
def testapp(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "test")
}
                        

// @LINE:10
def delete(id:Int): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "Delete/" + implicitly[PathBindable[Int]].unbind("id", id))
}
                        

// @LINE:11
def updates(id:Int): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "update/" + implicitly[PathBindable[Int]].unbind("id", id))
}
                        

// @LINE:7
def createemp(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "Employee")
}
                        

// @LINE:8
def save(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "Save")
}
                        

// @LINE:5
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:9
def updateEmp(id:Int): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "update/" + implicitly[PathBindable[Int]].unbind("id", id))
}
                        

}
                          
}
                  


// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:5
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:14
class ReverseAssets {


// @LINE:14
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:5
class ReverseEmployeelist {


// @LINE:12
def testapp : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Employeelist.testapp",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "test"})
      }
   """
)
                        

// @LINE:10
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Employeelist.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Delete/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:11
def updates : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Employeelist.updates",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "update/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:7
def createemp : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Employeelist.createemp",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Employee"})
      }
   """
)
                        

// @LINE:8
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Employeelist.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Save"})
      }
   """
)
                        

// @LINE:5
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Employeelist.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:9
def updateEmp : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Employeelist.updateEmp",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "update/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              
}
        


// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:5
package controllers.ref {


// @LINE:14
class ReverseAssets {


// @LINE:14
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path """, _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:5
class ReverseEmployeelist {


// @LINE:12
def testapp(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Employeelist.testapp(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Employeelist", "testapp", Seq(), "GET", """""", _prefix + """test""")
)
                      

// @LINE:10
def delete(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Employeelist.delete(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Employeelist", "delete", Seq(classOf[Int]), "GET", """""", _prefix + """Delete/$id<[^/]+>""")
)
                      

// @LINE:11
def updates(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Employeelist.updates(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Employeelist", "updates", Seq(classOf[Int]), "POST", """""", _prefix + """update/$id<[^/]+>""")
)
                      

// @LINE:7
def createemp(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Employeelist.createemp(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Employeelist", "createemp", Seq(), "GET", """GET  /jsroutes.js                                 controllers.Report.jsRoutes()""", _prefix + """Employee""")
)
                      

// @LINE:8
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Employeelist.save(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Employeelist", "save", Seq(), "POST", """""", _prefix + """Save""")
)
                      

// @LINE:5
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Employeelist.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Employeelist", "index", Seq(), "GET", """""", _prefix + """""")
)
                      

// @LINE:9
def updateEmp(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Employeelist.updateEmp(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Employeelist", "updateEmp", Seq(classOf[Int]), "GET", """""", _prefix + """update/$id<[^/]+>""")
)
                      

}
                          
}
        
    