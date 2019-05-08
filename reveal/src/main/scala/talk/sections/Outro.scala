package talk.sections

import japgolly.scalajs.react.vdom.html_<^._
import talk.PresentationUtil._

//noinspection TypeAnnotation
object Outro {
  val Questions = chapterSlide(
    "Questions?",
  )
  val Thanks = chapterSlide(
    "Thanks!",
    <.br,
    list(
      item(link("github.com/oyvindberg/ScalablyTyped")),
      item(link("github.com/oyvindberg/ScalablyTypedDemos")),
      item(link("gitter.im/ScalablyTyped/Community")),
    )
  )

  val Chapter = chapter(Questions, Thanks)
}
