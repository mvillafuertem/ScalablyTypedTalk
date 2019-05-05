package demo

import demo.PresentationUtil.{chapter, chapterSlide}
import japgolly.scalajs.react.vdom.html_<^._

//noinspection TypeAnnotation
object Intro {
  val About = chapterSlide(
    <.h2("Introducing ScalablyTyped"),
    <.br,
    <.p("Øyvind Raddum Berg"),
    <.p("oyvind.berg@arktekk.no"),
  )
  val Chapter = chapter(Intro.About)
}
