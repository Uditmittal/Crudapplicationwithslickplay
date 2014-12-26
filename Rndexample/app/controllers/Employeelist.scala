package controllers
import play.api.mvc.Result 
import play.api.Routes
import play.api.mvc._
import play.api.mvc.Action._
import play.api.libs.json._
import models.EmployeeEntry
import models.PersonEntry
import models.database.Employee
import models.database.Person
import play.api.data.Forms._
import play.api.data.Form
import play.api.i18n.Messages
import play.api.db.DB
import play.api.Play.current
import play.api.db.slick.Config.driver.simple._
import play.api.db.slick._
import play.api.Play.current
import slick.lifted._
import models._
import views._


object Employeelist extends Controller {
    //For LIst all the Employee In The Databases 
    def index = Action {
        val application= Employee.getPersonList// Get All the Employee From the Employee Model
        Ok(views.html.showdata(application))//Print All the Employee List
}

// For Form Validation or Mapping Using Helper Class 
val empForm = Form(
    mapping(
      "eid" -> number,
      "ename" -> nonEmptyText,
      "eadd" ->nonEmptyText,
      "emob" ->nonEmptyText
    )(EmployeeEntry.apply)(EmployeeEntry.unapply)
  )

   val personForm = Form(
    mapping(
      "Pid" -> number,
      "Pname" -> nonEmptyText,
      "Padd" ->nonEmptyText,
      "Pmob" ->nonEmptyText
    )(PersonEntry.apply)(PersonEntry.unapply)
  )

//For Create A Employeee in The Data Base
def createemp=  Action(Ok(views.html.createFrom(empForm,0)))
	
//Update The Person List 
def updateEmp(id: Int)=Action{
        implicit request => 
        Employee.findByPK(id).headOption match {
            case Some(e) => Ok(views.html.editForm(empForm.fill(e), id))
            case None => NotFound
      }
    }

//Delete the Person List 
def delete(id :Int)=Action {
       implicit request =>Employee.delet(id)
        Redirect(routes.Employeelist.index)
   }
    
// Save all The Detail From The Form 
def save()= Action { implicit request =>
  empForm.bindFromRequest.fold(
  formWithErrors => {BadRequest(views.html.createFrom(empForm,0))},
  value =>{
     val id=Employee.savedat(value)
     Redirect(routes.Employeelist.index)
     }
   )
  }
  
//Save All the Deltial from The Update Form 
def updates(id :Int)=Action {implicit request =>
    empForm.bindFromRequest.fold(
    formWithErrors => {BadRequest(views.html.createFrom(empForm,0))},
    value =>{val idsss=Employee.updateData(value,id)
             Redirect(routes.Employeelist.index)
            }
        )
}

 /*def personSave()=Action {
  implicit request =>
    
  DB.withTransaction {
    implicit session =>
    
      //val valueE = Json.toJson("eid" -> 4,"ename" ->"udit","eadd" -> "noida" ,"emob" -> "9810546474")
        // val Jsond=Json.writes[valueE]
   //  val id=Employee.savedatdd()
   //  val id2=Person.personSave(value.Pid=33,value.Pname="udit",value.Padd="Noida",value.Pmob="88888888")

  if (id>=0 && id2>=0){
    DB.rollback // signals Slick to rollback later
  }

} // <- rollback happens here, if an exception was thrown or session.rollback was called

 }*/

  // Test Multiple Transaction
  def testapp() =Action{
     implicit request =>
     Ok(Employee.testTranc.toString)
    }

    





}