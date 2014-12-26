package models

import models.database.Employee
import models.database.Person
import play.api.db.slick.Config.driver.simple._
import play.api.db.slick._
import play.api.Play.current
import models.PersonEntry
import models.Person

//For Defining the Structure of Table 
case class EmployeeEntry(eid :Int, ename: String, eadd: String, emob: String)

object Employee {

  val Dperson= TableQuery[Person]

    // Create a object using Lifted Embedding 
    // The name Lifted Embedding refers to the fact that you are not working with standard Scala types 
    //(as in the direct embedding) but with types that are lifted into a Rep type constructor. 
    //This becomes clear when you compare the types of a simple Scala collections example
  val DBemp= TableQuery[Employee]
    
    // Update The Data 
  def updateData(value: EmployeeEntry,id: Int):Long = {
		DB.withSession { implicit session =>
		    (DBemp filter (_.eid === id) map (s => (s.ename,s.eadd,s.emob))) update (value.ename,value.eadd,value.emob)
		}}
  // Save A new Employee List In Database
       
  def savedat(value: EmployeeEntry):Long = {
		DB.withTransaction { implicit session =>
		   DBemp.insert(value)
		}}

  // Get A Employee threw A Given Id
	def findByPK(id :Int): List[EmployeeEntry] = DB.withSession { implicit session => DBemp.filter (_.eid === id).list}
  
  // Get All the Person In the Data Base
	def getPersonList: List[EmployeeEntry] = DB.withSession { implicit session => DBemp.list }
  
  // Delete rows From The Database
  def delet(id: Int) :Int =DB.withSession {
      implicit session => (DBemp filter (_.eid === id)).delete
  }
 // Check Mulipletranction state
  def testTranc ={ 
  //val session : Session = DB.create Session
  DB.withTransaction { implicit session =>
     //session.conn.setAutoCommit(false)
     val id2=Dperson+=PersonEntry(2,"testbye","teyye","89899989")  //If Error Ocuurs in than next rows can't Execute
     val id=DBemp+=EmployeeEntry(1,"test","testdcl","982000000")
     
     //println id;
    
   
   
}
} 
   





}