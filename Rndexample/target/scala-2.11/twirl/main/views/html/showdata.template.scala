
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object showdata extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[EmployeeEntry],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(emplist: List[EmployeeEntry]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import java.math.BigInteger ; var i = 0;
implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.f) }};
Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*5.75*/("""

"""),_display_(/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""
     """),format.raw/*8.6*/("""<div class="col-xs-12">
         <div class="col-md-offset-9"><a href=""""),_display_(/*9.49*/controllers/*9.60*/.routes.Employeelist.createemp),format.raw/*9.90*/("""" class="btn btn-primary">Create Employee</a></div>
    </div>
   <div class="col-xs-12 col-sm-8  col-md-offset-2">
    
    <table class="table table-bordered table-striped table-hover">
    <thead>
      <tr><th>Employee Id</th>&nbsp;&nbsp; 
       <th>Employee name</th>&nbsp;&nbsp; 
       <th>Employee Address</th>&nbsp;&nbsp; 
       <th>Employee Mobile</th>&nbsp;&nbsp; 
       <th>Edit</th>&nbsp;&nbsp; 
       <th>Delete</th>&nbsp;&nbsp; 
    </tr>
    </thead>
    <tbody>
    
     """),_display_(/*25.7*/for(e <- emplist) yield /*25.24*/{_display_(Seq[Any](format.raw/*25.25*/("""
          """),format.raw/*26.11*/("""<tr>"""),_display_(/*26.16*/(i=i+1)),format.raw/*26.23*/("""
            """),format.raw/*27.13*/("""<td>"""),_display_(/*27.18*/(i)),format.raw/*27.21*/("""</td>&nbsp;
    <td>"""),_display_(/*28.10*/e/*28.11*/.ename),format.raw/*28.17*/("""</td>&nbsp;
    <td>"""),_display_(/*29.10*/e/*29.11*/.eadd),format.raw/*29.16*/("""</td>&nbsp;
    <td>"""),_display_(/*30.10*/e/*30.11*/.emob),format.raw/*30.16*/("""</td>&nbsp;
    <td><a href=""""),_display_(/*31.19*/controllers/*31.30*/.routes.Employeelist.updateEmp(e.eid)),format.raw/*31.67*/("""" class="btn btn-primary">Edit</a></td>
        <td><a href=""""),_display_(/*32.23*/controllers/*32.34*/.routes.Employeelist.delete(e.eid)),format.raw/*32.68*/("""" class="btn btn-danger">Delete</a></td>
        </tr>
    """)))}),format.raw/*34.6*/("""
     """),format.raw/*35.6*/("""</tbody>
  </table>
    
    
    </div>
    
    """)))}),format.raw/*41.6*/("""
   """))}
  }

  def render(emplist:List[EmployeeEntry]): play.twirl.api.HtmlFormat.Appendable = apply(emplist)

  def f:((List[EmployeeEntry]) => play.twirl.api.HtmlFormat.Appendable) = (emplist) => apply(emplist)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Nov 03 16:57:09 IST 2014
                  SOURCE: /home/crsip/datab/Rndexample/app/views/showdata.scala.html
                  HASH: 276b27309a779378c6a7cfeaca6c1c30f420c7b5
                  MATRIX: 521->1|687->93|719->117|798->31|827->166|855->169|866->173|904->175|936->181|1034->253|1053->264|1103->294|1623->788|1656->805|1695->806|1734->817|1766->822|1794->829|1835->842|1867->847|1891->850|1939->871|1949->872|1976->878|2024->899|2034->900|2060->905|2108->926|2118->927|2144->932|2201->962|2221->973|2279->1010|2368->1072|2388->1083|2443->1117|2533->1177|2566->1183|2647->1234
                  LINES: 19->1|22->5|22->5|23->1|25->5|27->7|27->7|27->7|28->8|29->9|29->9|29->9|45->25|45->25|45->25|46->26|46->26|46->26|47->27|47->27|47->27|48->28|48->28|48->28|49->29|49->29|49->29|50->30|50->30|50->30|51->31|51->31|51->31|52->32|52->32|52->32|54->34|55->35|61->41
                  -- GENERATED --
              */
          