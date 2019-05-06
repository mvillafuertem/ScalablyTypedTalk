package demo

import japgolly.scalajs.react.vdom.html_<^._
import japgolly.scalajs.react.vdom.{TagMod, TagOf}
import japgolly.scalajs.react.{Children, JsComponent}
import org.scalajs.dom.raw.HTMLElement
import typings.atFortawesomeFontawesomeDashSvgDashCoreLib.atFortawesomeFontawesomeDashSvgDashCoreMod.^.library
import typings.atFortawesomeFreeDashSolidDashSvgDashIconsLib.atFortawesomeFreeDashSolidDashSvgDashIconsMod.faStroopwafel
import typings.atFortawesomeReactDashFontawesomeLib.atFortawesomeReactDashFontawesomeLibComponents.FontAwesomeIcon
import typings.atFortawesomeReactDashFontawesomeLib.atFortawesomeReactDashFontawesomeMod.Props

import scala.scalajs.js

//noinspection TypeAnnotation
object PresentationUtil {
  val FontAwesome      = JsComponent[Props, Children.None, js.Object](FontAwesomeIcon.asInstanceOf[js.Object])
  def FontAwesomeProps = Props

  library.add(faStroopwafel)
  def chapter(slides: TagMod*) = <.section(slides: _*)

  def chapterSlide(title: TagMod, content: TagMod*) =
    <.section(
      <.h2(title),
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
          ^.cls := "slide-header no-title-case",
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
        ^.cls := "fragment no-box-shadow",
        <.code(
          ^.cls := s"$language full-height",
          VdomAttr("data-trim") := "",
          VdomAttr("data-noescape") := "",
          codeStr
        )
      )

    val scala = code("Scala") _
    val ts    = code("Typescript") _
  }

  object codeFragment {
    def apply(language: String)(codeStr: String) =
      <.code(
        ^.cls := s"$language",
        VdomAttr("data-trim") := "",
        VdomAttr("data-noescape") := "",
        codeStr
      )

    val scala = codeFragment("Scala") _
    val ts    = codeFragment("Typescript") _
  }

  def note(s: String) = <.aside(^.className := "notes", s)

  def list(head: TagOf[HTMLElement], tail: TagOf[HTMLElement]*) = <.ul(head +: tail: _*)

  object item {
    def apply(content:  TagMod) = <.li(content)
    def apply(content:  String) = <.li(<.p(content))
    def fadeIn(content: TagMod) = <.li(^.cls := "fragment fade-in", content)
    def fadeIn(content: String) = <.li(^.cls := "fragment fade-in", <.p(content))
  }
}
