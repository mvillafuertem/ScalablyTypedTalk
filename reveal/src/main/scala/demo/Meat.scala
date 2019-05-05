package demo

import demo.PresentationUtil.{chapter, chapterSlide, slide}
import japgolly.scalajs.react.vdom.html_<^._

//noinspection TypeAnnotation
object Meat {
  val Chapter = chapter(
    chapterSlide(
      <.h2("Where can I find more information?"),
    ),
    slide(
      "about ScalaJS",
      <.a(
        ^.href := "https://www.scala-js.org",
        "ScalaJS"
      )
    )
  )
}
