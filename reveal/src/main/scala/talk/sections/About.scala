package talk.sections

import japgolly.scalajs.react.vdom.html_<^._
import talk.PresentationUtil._

//noinspection TypeAnnotation
object About {

  val Initial = chapterSlide("About")

  val Numbers = slide(
    "Key facts",
    list(
      item("Almost 7000 typings on GitHub and published to Bintray"),
      item("Almost 7000000 lines of Scala source code"),
      item("Covers ~all important parts of the Javascript ecosystem"),
      <.br,
      item("(Anything missing? Request it on Gitter)"),
    )
  )

  val Facades = slide(
    "Facades",
    list(
      item("Many typings come out sort of correct, but hard to use."),
      item(
        "The typings are 100% generated, Facades are hand written sugar on top, typically some implicits and some casts"
      ),
      item(<.span("4 facades at ", link("github.com/oyvindberg/ScalablyTyped/tree/master/facades"))),
      <.br,
      item("Pull requests welcome!"),
    )
  )

  val Demos = slide(
    "Demos",
    list(
      item(<.span("22 demos at ", link("github.com/oyvindberg/ScalablyTypedDemos"))),
      item("Covers (simple) usage of more than 40 libraries and all facades"),
      item(
        withExamples(
          "for instance",
          "react",
          "react-native (android)",
          "electron",
          "storybook",
          "node/express",
          "d3",
          "angular"
        )
      ),
      <.br,
      item("Most demos adapted from elsewhere"),
      item("Pull requests welcome!"),
    )
  )

  val Chapter = chapter(Initial, Numbers, Facades, Demos)
}
