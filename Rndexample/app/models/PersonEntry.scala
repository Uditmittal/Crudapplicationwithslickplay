package models

import models.database.Person
import play.api.db.slick.Config.driver.simple._
import play.api.db.slick._
import play.api.Play.current

case class PersonEntry(Pid :Int, Pname :String, Padd :String, Pmob:String)

object Person{

  val Dperson= TableQuery[Person]


  def personSave():Long = {
		DB.withTransaction { implicit session =>
		   Dperson+=PersonEntry(Pid=4,Pname="No test",Padd="Noida",Pmob="928902202")
		}}
  }  
	
