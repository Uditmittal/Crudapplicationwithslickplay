
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.17*/("""


"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html>
    <head>
        <title>Employee database</title>
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*8.70*/routes/*8.76*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*8.119*/(""""> 
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*9.70*/routes/*9.76*/.Assets.at("stylesheets/main.css")),format.raw/*9.110*/(""""> 
    </head>
    <body>
        
        <header class="topbar col-md-offset-5" >
            <h1 class="fill">
                Employee List
            </h1>
        </header>
        
        <section id="main">
            """),_display_(/*20.14*/content),format.raw/*20.21*/("""
        """),format.raw/*21.9*/("""</section>
        
    </body>
</html>"""))}
  }

  def render(content:Html): play.twirl.api.HtmlFormat.Appendable = apply(content)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (content) => apply(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Nov 03 17:47:06 IST 2014
                  SOURCE: /home/crsip/datab/Rndexample/app/views/main.scala.html
                  HASH: 6d31c8f5b88be500ae9fadc3d7ede5545d6809f8
                  MATRIX: 502->1|605->16|634->19|804->163|818->169|882->212|981->285|995->291|1050->325|1308->556|1336->563|1372->572
                  LINES: 19->1|22->1|25->4|29->8|29->8|29->8|30->9|30->9|30->9|41->20|41->20|42->21
                  -- GENERATED --
              */
          