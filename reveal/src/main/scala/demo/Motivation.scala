package demo

import demo.PresentationUtil._
import japgolly.scalajs.react.vdom.html_<^._
import org.scalablytyped.runtime.TopLevel
import typings.atFortawesomeFreeDashSolidDashSvgDashIconsLib.atFortawesomeFreeDashSolidDashSvgDashIconsMod.faStroopwafel

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

//noinspection TypeAnnotation
object Motivation {
  @JSImport("../../../../src/main/resources/happy_sad_meme.jpg", JSImport.Namespace)
  @js.native
  object MemeHappySadImg extends TopLevel[String]

  @JSImport("../../../../src/main/resources/meme_wrappers.jpg.jpg", JSImport.Namespace)
  @js.native
  object MemeWrappersImg extends TopLevel[String]

  val ContributorAttrition2 = slide("Phases of contributor attrition",
    list(
      item(FontAwesome(FontAwesomeProps(faStroopwafel))),
      item.fadeIn(<.span("Yey! Scala.js!")),
      item.fadeIn("Soo, how can I use ...?"),
      item.fadeIn("Oh, I'm writing a wrapper"),
      item.fadeIn("Look, "),
    )
  )

  val ContributorAttrition = slide("Phases of contributor attrition",
    <.img(^.src := (MemeHappySadImg: String))
  )

  val Frontpage = chapterSlide("Motivation")

  val Scalajs = slide(
    "Scala.js",
    list(
      item("This talk won't be about the virtues of Scala.js"),
      item("Awesome, principled language and ecosystem, strong types, "),
      item.fadeIn("but lacks hype, uptake, and amazing ui component libraries"),
      item.fadeIn("But..."),
    ),
  )

  val ScalajsBut = slide(
    "Scala.js - The flip side",
    list(
      // History repeats itself?
      item("An awesome programming language"),
      item.fadeIn("but lacks hype, uptake, and amazing ui component libraries"),
      item.fadeIn("History repeats itself?"),
    ),
  )
  val TerribleTechnologies = slide(
    "Motivation",
    list(
      item.fadeIn("Javascript and CSS 😔"),
      item.fadeIn("Let's not dwell on this, but the only way to win is not to play"),
      item.fadeIn(
        "For our purposes the former is a competent compilation target, and the latter others can write for us"
      ),
    )
  )
  val ButSomePositives = slide(
    "But javascript also has solutions!",
    list(
      item("Opens up platforms! (aws-lambda, cordova, electron, jupyter, node, raspi, react-native)"),
      item("UI component libraries (antd, bootstrap, material-ui, semantic-ui, etc)"),
      item("Graphical React components and libraries (thousands)"),
      item("Charting (chart.js, d3, highcharts, nivo, nvd3)"),
      item(
        "Integrations (aws, azure, auth0, braintree, firebase, most google services, stripe, twilio)"
      ),
      item("Niche things like browser plugins, excel plugins"),
    )
  )
  val WeActuallyWantThis = slide(
    "Hmm, that sounds useful! Scala doesn't serve all of those niches well",
    <.p("But how? "),
    list(
      item.fadeIn("We already talked about the burning platform"),
      item.fadeIn("Turns out there is a helicopter off it"),
      item.fadeIn("Let's talk about Typescript"),
    )
  )
  val TypescriptOnASlide = slide(
    "Typescript",
    list(
      item("Gradual, static typing for Javascript"),
      item("Taking over the world, fast!"),
      item("Surprisingly rich type system to richly describe how Javascript libraries work"),
//        Item.stable("loose relationship between types and values, but has a very reasonable language subset"),
//        Item.stable("the language *is* the integration to javascript"),
//        Item.stable("very specialized DSL for javascript"),
      item("A lot of cool type-level stuff! including quite a bit which could transfer back to Scala."),
      item("We'll see a bit in a while"),
      <.br,
      item.fadeIn("And the coolest part?")
    )
  )
  val DTOnASlide = slide(
    "DefinitelyTyped",
    list(
      item("Incredible community effort, has typed up all the relevant parts of javascript"),
      item("Millions of programmer hours invested"),
      item("Typescript as an IDL for ~all of javascript"),
    )
  )

  val Chapter = chapter(
    Frontpage,
    ContributorAttrition,
    ContributorAttrition2,
    Scalajs,
    ScalajsBut,
    TerribleTechnologies,
    ButSomePositives,
    WeActuallyWantThis,
    TypescriptOnASlide,
    DTOnASlide,
  )
}
