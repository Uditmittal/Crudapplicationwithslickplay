
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
object editForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[EmployeeEntry],Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(coffeeForm: Form[EmployeeEntry],id:Int):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.f) }};
Seq[Any](format.raw/*1.42*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.75*/("""

"""),_display_(/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""
    """),format.raw/*8.5*/("""<div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
    <h2>Edit Employee</h2>
    <div>
    """),_display_(/*11.6*/form(routes.Employeelist.updates(id))/*11.43*/ {_display_(Seq[Any](format.raw/*11.45*/("""  
        
        """),format.raw/*13.9*/("""<fieldset >
            
            """),_display_(/*15.14*/inputText(coffeeForm("eid"), '_label -> "Employye Id",'_class ->"col-xs-6 col-sm-6 col-md-6")),format.raw/*15.107*/("""
            """),_display_(/*16.14*/inputText(coffeeForm("ename"), '_label -> "Employee Name")),format.raw/*16.72*/("""
            """),_display_(/*17.14*/inputText(coffeeForm("eadd"), '_label -> "Employee Address")),format.raw/*17.74*/("""
            """),_display_(/*18.14*/inputText(coffeeForm("emob"), '_label -> "Employee Mobile")),format.raw/*18.73*/("""

            
            

        """),format.raw/*23.9*/("""</fieldset><br><br>
        
        <div class="actions">
            <input type="submit" value="Edit Employee" class="btn btn-mini btn-primary" > 
            <a href=""""),_display_(/*27.23*/routes/*27.29*/.Employeelist.index()),format.raw/*27.50*/("""" class="btn btn-primary">Cancel</a> 
        </div>
        
    """)))}),format.raw/*30.6*/("""
    """),format.raw/*31.5*/("""</div>
    </div>
    
""")))}))}
  }

  def render(coffeeForm:Form[EmployeeEntry],id:Int): play.twirl.api.HtmlFormat.Appendable = apply(coffeeForm,id)

  def f:((Form[EmployeeEntry],Int) => play.twirl.api.HtmlFormat.Appendable) = (coffeeForm,id) => apply(coffeeForm,id)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Nov 04 11:40:06 IST 2014
                  SOURCE: /home/crsip/datab/Rndexample/app/views/editForm.scala.html
                  HASH: d39a95c998ca24d35266fb9eedfa8d869b2ee8b2
                  MATRIX: 525->1|660->62|692->86|771->41|799->60|827->135|855->138|866->142|904->144|935->149|1077->265|1123->302|1163->304|1210->324|1275->362|1390->455|1431->469|1510->527|1551->541|1632->601|1673->615|1753->674|1817->711|2016->883|2031->889|2073->910|2170->977|2202->982
                  LINES: 19->1|21->5|21->5|22->1|24->4|25->5|27->7|27->7|27->7|28->8|31->11|31->11|31->11|33->13|35->15|35->15|36->16|36->16|37->17|37->17|38->18|38->18|43->23|47->27|47->27|47->27|50->30|51->31
                  -- GENERATED --
              */
          