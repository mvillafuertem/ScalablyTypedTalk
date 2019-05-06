package talk.sections

import japgolly.scalajs.react.vdom.html_<^._
import talk.PresentationUtil.{chapter, chapterSlide}

//noinspection TypeAnnotation
object Intro {
  val About   = chapterSlide(
    "Introducing ScalablyTyped",
    <.br,
    <.p("Øyvind Raddum Berg"),
    <.p("oyvind.berg@arktekk.no"),
    <.p("flatMap(Oslo) 2019"),
  )
  val Chapter = chapter(Intro.About)
}
