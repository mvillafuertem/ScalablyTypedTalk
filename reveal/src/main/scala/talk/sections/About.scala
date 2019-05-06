package talk.sections

import japgolly.scalajs.react.vdom.html_<^._
import talk.PresentationUtil._

//noinspection TypeAnnotation
object About {

  val Initial = chapterSlide("About")

  val Numbers = slide("Key facts",
    list(
      item("Almost 7000 typings on GitHub and published to Bintray"),
      item("Almost 7000000 lines of Scala source code"),
      item("Covers ~all important parts of the Javascript ecosystem"),
      <.br,
      item("(Anything missing? Request it on Gitter)"),
    )
  )

  val Demos = slide("Demos",
    list(
      item(<.span("22 Demos at ", link("github.com/oyvindberg/ScalablyTypedDemos"))),
      item("Covers (simple) usage of almost 50 libraries"),
      item("for instance react-native (android), electron, storybook, node/express, d3, angular"),
      <.br,
      item("Most demos adapted from elsewhere"),
      item("Pull requests welcome!"),
    )
  )

  val Chapter = chapter(Initial, Numbers, Demos)
}
