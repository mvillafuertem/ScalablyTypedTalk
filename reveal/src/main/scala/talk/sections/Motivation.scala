package talk.sections

import japgolly.scalajs.react.vdom.html_<^._
import talk.PresentationUtil._

//noinspection TypeAnnotation
object Motivation {
  val Scalajs = slide(
    "Scala.js",
    list(
      item("Awesome, principled language and ecosystem, strong types, etc"),
      item("I believe Scala + Scala.js is a strong competitive advantage today"),
      item("However, this talk isn't about the virtues of Scala.js"),
    ),
  )

  val ScalajsBut = slide(
    "Scala.js - The flip side",
    list(
      // History repeats itself?
      item.fadeIn("Lacks enough contributors"),
      item.fadeIn("Lacks breadth in libraries"),
      item.fadeIn("Github is a graveyard of abandoned javascript wrapper libraries"),
      item.fadeIn("A history lesson..."),
    ),
  )

  val Scala2012 = slide(
    "Scala 2012 - An adopters story",
    list(
      // History repeats itself?
      item.fadeIn("- Ooh, look at this fancy language!"),
      item.fadeIn("- How can i make spring pleasant to use?"),
      item.fadeIn("- Hey people! Look at my newly released spring4s library!"),
      item.fadeIn("- Hey people! Look at my new, fancy scala library!"),
      item.fadeIn("- Hey people! Look at my even newer, even fancier scala library!"),
    ),
  )

  val Scalajs2019 = slide(
    "Scala.js 2019 - An adopters story",
    list(
      // History repeats itself?
      item.fadeIn("- Ooh, look at this fancy language!"),
      item.fadeIn("- How can i make jquery pleasant to use?"),
      item.fadeIn("- What do you mean \"write facades\"?"),
      item.fadeIn("(ugh)"),
      item.fadeIn("- Hey people! Look at my jquery4s project!"),
      item.fadeIn("- Ooh, look at this other fancy language!"),
    ),
  )

  val LetsTalkAboutJavascript = slide(
    "Let's talk about writing frontend apps",
    list(
      item.fadeIn("Javascript and CSS 😔"),
      item.fadeIn("This talk is also not about their respective (lack of) virtues"),
      item.fadeIn("The question is rather, what happens when your designer wants an image carousel?"),
    )
  )

  val JavascriptHasSolutions = slide(
    "Javascript for the win",
    list(
      item(
        withExamplesP(
          "Opens up platforms!",
          "aws-lambda",
          "cordova",
          "electron",
          "jupyter",
          "node",
          "raspi",
          "react-native"
        )
      ),
      item(
        withExamplesP(
          "UI component libraries",
          "antd",
          "bootstrap",
          "material-ui",
          "semantic-ui"
        )
      ),
      item("Graphical React components and libraries (thousands)"),
      item(
        withExamplesP(
          "Charting",
          "chart.js",
          "d3",
          "highcharts",
          "nivo",
          "nvd3"
        )
      ),
      item(
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
      item("Niche things like browser plugins, excel plugins, WiiU controller libraries"),
    )
  )

  val WeActuallyWantThis = slide(
    "Hmm",
    list(
      item("Scala doesn't currently serve any of these niches well."),
      item("But we need these things!"),
      <.br,
      item.fadeIn("How?"),
      item.fadeIn("Let's talk about Typescript!"),
    ),
  )

  val TypescriptOnASlide = slide(
    "Typescript",
    list(
      item("Gradual, static typing for Javascript"),
      item("Taking over the world, fast!"),
      item("Surprisingly rich type system to describe all the eccentricities of Javascript APIs"),
//      item("loose relationship between types and values, but has a very reasonable language subset"),
//      item("very specialized DSL for javascript"),
      item(<.span("the language ", <.em("is"), " the integration to javascript")),
      item("A lot of cool type-level stuff! including quite a bit which could transfer back to Scala."),
      item("We'll see a bit in a while"),
      <.br,
      item.fadeIn("And the coolest part?")
    )
  )
  val DTOnASlide = slide(
    "DefinitelyTyped",
    list(
      item("All relevant parts of Javascript ecosystem retrofitted with types"),
      item("Incredible community effort"),
      item("Millions of programmer hours invested"),
      item("Typescript as an IDL for ~all of Javascript"),
    )
  )

  val Goal = slide(
    "Goal",
    list(
      item("Relieve ourselves of the burden of maintaining typings"),
      item("Make ~all of Javascript available to us"),
    )
  )

  val Chapter = chapter(
    chapterSlide("Motivation"),
    Scalajs,
    ScalajsBut,
    Scala2012,
    Scalajs2019,
    LetsTalkAboutJavascript,
    JavascriptHasSolutions,
    WeActuallyWantThis,
    TypescriptOnASlide,
    DTOnASlide,
    Goal
  )
}
