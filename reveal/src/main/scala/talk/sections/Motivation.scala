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
      item.fadeIn("However, this talk isn't about the virtues of Scala.js"),
    ),
  )

  val ScalajsBut = slide(
    "Scala.js - challenges",
    <.p("(my perspective)"),
    list(
      // History repeats itself?
      item.fadeIn("Lacks contributors"),
      item.fadeIn("Lacks variety in libraries"),
      item.fadeIn("Github feels like graveyard of seemingly abandoned javascript wrappers"),
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
      item.fadeIn(
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
      item("All relevant parts of Javascript ecosystem retrofitted with types"),
      item("Incredible community effort"),
      item("Millions of programmer hours invested"),
      item("Typescript as an IDL for ~all of Javascript"),
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
  )
}
