package models.database

import models._
import models.EmployeeEntry
import play.api.db.slick.Config.driver.simple._
import scala.slick.lifted._


// Create Table using Class
class Employee(tag: Tag) extends Table[EmployeeEntry](tag, "employee") 
{
 
  def eid = column[Int]("eid", O.PrimaryKey)  // eid , int Primary Key
  def ename = column[String]("name", O.DBType("VARCHAR(50)")) // ename varchar(50)
  def eadd = column[String]("eadd",O.DBType("VARCHAR(100)"))//eadd varchar(100)
  def emob =column[String]("emob",O.DBType("VARCHAR(100)")) // emob varchar(100)
  
  def * = (eid, ename, eadd, emob) <> (EmployeeEntry.tupled, EmployeeEntry.unapply)  
  //Projection in Table like Select * from employee
}
