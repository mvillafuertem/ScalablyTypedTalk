package demo

import japgolly.scalajs.react.vdom.TagOf
import japgolly.scalajs.react.vdom.html_<^._
import org.scalajs.dom.raw.HTMLElement

//noinspection TypeAnnotation
object PresentationUtil {
  def chapter(slides: TagMod*) = <.section(slides: _*)

  def chapterSlide(content: TagMod*) =
    <.section(
      TagMod.fromTraversableOnce(
        Seq(
          VdomAttr("data-background-color") := "#363633",
          VdomAttr("data-background-size") := "30%"
        ) ++ content
      )
    )

  object slide {
    def apply(headerStr: String, content: TagOf[HTMLElement]*) =
      <.section(
        <.div(
          ^.cls := "slide-header",
          <.h3(headerStr)
        ),
        TagMod.fromTraversableOnce(content)
      )

    def noHeader(content: TagOf[HTMLElement]*) =
      <.section(content: _*)
  }

  object code {
    def apply(language: String)(codeStr: String) =
      <.pre(
        ^.cls := "fragment fade-in",
        <.code(
          ^.cls := language,
          VdomAttr("data-trim") := "",
          VdomAttr("data-noescape") := "",
          codeStr
        )
      )

    val scala = code("Scala") _
    val ts    = code("Typescript") _
  }

  def note(s: String) = <.aside(^.className := "notes", s)

  def list(head: TagOf[HTMLElement], tail: TagOf[HTMLElement]*) = <.ul(head +: tail: _*)

  object item {
    def apply(content:  TagOf[HTMLElement]) = <.li(content)
    def apply(content:  String)             = <.li(<.p(content))
    def fadeIn(content: TagOf[HTMLElement]) = <.li(^.cls := "fragment fade-in", content)
    def fadeIn(content: String)             = <.li(^.cls := "fragment fade-in", <.p(content))
  }
}
