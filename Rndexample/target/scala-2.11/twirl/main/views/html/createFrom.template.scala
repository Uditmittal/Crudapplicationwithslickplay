
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
object createFrom extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[EmployeeEntry],Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(coffeeForm: Form[EmployeeEntry],id:Int):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*6.2*/implicitFieldConstructor/*6.26*/ = {{ FieldConstructor(twitterBootstrapInput.f) }};
Seq[Any](format.raw/*1.42*/(""" 


"""),format.raw/*5.1*/("""
"""),format.raw/*6.75*/("""

"""),_display_(/*8.2*/main/*8.6*/ {_display_(Seq[Any](format.raw/*8.8*/("""
    """),format.raw/*9.5*/("""<div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
    <h2>Add a Employee</h2>
    <div>
    
    """),_display_(/*13.6*/form(routes.Employeelist.save())/*13.38*/{_display_(Seq[Any](format.raw/*13.39*/("""
     
        """),format.raw/*15.9*/("""<fieldset >
        
            """),_display_(/*17.14*/inputText(coffeeForm("eid"), '_label -> "Employye Id",'_class ->"col-xs-6 col-sm-6 col-md-6")),format.raw/*17.107*/("""
            """),_display_(/*18.14*/inputText(coffeeForm("ename"), '_label -> "Employee Name")),format.raw/*18.72*/("""
            """),_display_(/*19.14*/inputText(coffeeForm("eadd"), '_label -> "Employee Address")),format.raw/*19.74*/("""
            """),_display_(/*20.14*/inputText(coffeeForm("emob"), '_label -> "Employee Mobile")),format.raw/*20.73*/("""
         """),format.raw/*21.10*/("""</fieldset><br><br>
        
        <div class="actions">
            <input type="submit" value="Create Employee" class="btn btn-mini btn-primary" > 
            <a href=""""),_display_(/*25.23*/routes/*25.29*/.Employeelist.createemp()),format.raw/*25.54*/("""" class="btn btn-primary">Cancel</a> 
        </div>
        
    """)))}),format.raw/*28.6*/("""
    """),format.raw/*29.5*/("""</div>
    </div>
    
""")))}))}
  }

  def render(coffeeForm:Form[EmployeeEntry],id:Int): play.twirl.api.HtmlFormat.Appendable = apply(coffeeForm,id)

  def f:((Form[EmployeeEntry],Int) => play.twirl.api.HtmlFormat.Appendable) = (coffeeForm,id) => apply(coffeeForm,id)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Nov 03 17:48:19 IST 2014
                  SOURCE: /home/crsip/datab/Rndexample/app/views/createFrom.scala.html
                  HASH: 5d465eaae3c937f89fc51b0c6b94d31342e62673
                  MATRIX: 527->1|662->64|694->88|773->41|803->62|831->137|859->140|870->144|908->146|939->151|1087->273|1128->305|1167->306|1209->321|1270->355|1385->448|1426->462|1505->520|1546->534|1627->594|1668->608|1748->667|1786->677|1987->851|2002->857|2048->882|2145->949|2177->954
                  LINES: 19->1|21->6|21->6|22->1|25->5|26->6|28->8|28->8|28->8|29->9|33->13|33->13|33->13|35->15|37->17|37->17|38->18|38->18|39->19|39->19|40->20|40->20|41->21|45->25|45->25|45->25|48->28|49->29
                  -- GENERATED --
              */
          