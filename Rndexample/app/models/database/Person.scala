package models.database


import models._
import models.PersonEntry
import play.api.db.slick.Config.driver.simple._
import scala.slick.lifted._

class Person (tag: Tag) extends Table[PersonEntry] (tag, "person")
{
 	def Pid=column[Int]("pid",O.PrimaryKey)
 	def Pname=column[String]("pname")
    def Padd = column[String]("padd")
    def Pmob = column[String]("pmob")
    def * = (Pid, Pname, Padd, Pmob) <> (PersonEntry.tupled, PersonEntry.unapply) 
}