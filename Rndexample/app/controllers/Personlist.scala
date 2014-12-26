/*package controllers
import play.api.mvc.Result 
import play.api.Routes
import play.api.mvc._
import play.api.mvc.Action._
import play.api.libs.json._
import models.EmployeeEntry
import models.database.Employee
import play.api.data.Forms._
import play.api.data.Form
import play.api.i18n.Messages
import play.api.db.DB
import play.api.Play.current
import slick.lifted._
import models._
import views._

object Personlist extends Controller {
     
      val personForm = Form(
    mapping(
      "Pid" -> number,
      "Pname" -> nonEmptyText,
      "Padd" ->nonEmptyText,
      "Pmob" ->nonEmptyText
    )(PersonEntry.apply)(PersonEntry.unapply)
  )


  def Perosonsave()
  {
   	
  }
    
}*/