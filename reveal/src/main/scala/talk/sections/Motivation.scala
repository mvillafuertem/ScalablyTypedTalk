package talk.sections

import japgolly.scalajs.react.vdom.html_<^._
import talk.PresentationUtil._

//noinspection TypeAnnotation
object Motivation {
  val Scalajs = slide(
    "Scala.js",
    list(
      item.fadeIn("Awesome language and ecosystem, strong types, principled, etc"),
      item.fadeIn("I believe Scala + Scala.js is a strong competitive advantage today"),
      item.fadeIn("Not really here to talk about the virtues of Scala.js"),
    ),
  )

  val LetsTalkAboutJavascript = slide(
    "Let's talk about writing frontend apps",
    list(
      item.fadeIn("Javascript and CSS 😔"),
      item.fadeIn("Also not really here to talk about their respective (lack of) virtues"),
      item.fadeIn("The question is rather, what happens when your designer wants an image carousel?"),
    )
  )

  val JavascriptHasSolutions = slide(
    "Javascript for the win",
    list(
      item.fadeIn(
        withExamplesP(
          "Opens up platforms!",
//          "aws-lambda",
          "cordova",
          "electron",
          "ionic",
//          "jupyter",
          "node",
          "raspi",
          "react-native"
        )
      ),
      item.fadeIn(
        withExamplesP(
          "UI component libraries",
          "antd",
          "bootstrap",
          "material-ui",
          "semantic-ui"
        )
      ),
      item.fadeIn(withExamplesP("Graphical React components and libraries", "...")),
      item.fadeIn(
        withExamplesP(
          "Charting",
          "chart.js",
          "d3",
          "highcharts",
          "nivo",
          "nvd3"
        )
      ),
      item.fadeIn(
        withExamplesP(
          "Integrations",
          "aws",
          "azure",
          "auth0",
          "braintree",
          "firebase",
          "google-*",
          "stripe",
          "twilio"
        )
      ),
      item.fadeIn(withExamples("Niche things like", "browser plugins", "excel plugins", "almost anything")),
    )
  )

  val WeActuallyWantThis = slide(
    "Hmm",
    list(
      item("Scala doesn't currently serve most of these niches well."),
      item("And we need these things!"),
      <.br,
      item.fadeIn("How?"),
      item.fadeIn("Let's talk about Typescript!"),
    ),
  )

  val TypescriptOnASlide = slide(
    "Typescript",
    list(
      item("Gradual, structural, static typing for Javascript"),
      item("Taking over the world, fast!"),
      item("Surprisingly rich type system to describe all the peculiarities of Javascript APIs"),
//      item("Loose relationship between types and values, but has a very reasonable language subset"),
//      item("Very specialized DSL for javascript"),
      item(<.span("The language ", <.em("is"), " javascript, just with types")),
//      item("A lot of cool type-level stuff! including quite a bit which could transfer back to Scala."),
//      item("We'll see a bit in a while"),
      <.br,
      item.fadeIn("And the coolest part?")
    )
  )
  val DTOnASlide = slide(
    "DefinitelyTyped",
    list(
      item("Huge parts of Javascript ecosystem retrofitted with types"),
      item("Incredible community effort"),
      item("Millions of programmer hours invested"),
      item("Typescript as an IDL for ~all of Javascript"),
    )
  )

  val Chapter = chapter(
    chapterSlide("Motivation"),
    Scalajs,
    LetsTalkAboutJavascript,
    JavascriptHasSolutions,
    WeActuallyWantThis,
    TypescriptOnASlide,
    DTOnASlide,
  )
}
