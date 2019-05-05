package demo

import org.scalajs.dom
import typings.highlightDotJsLib.highlightDotJsMod
import typings.revealLib.{RevealOptions, RevealStatic}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import japgolly.scalajs.react.ScalaComponent
import japgolly.scalajs.react.vdom.html_<^._

object Main {
  val Talk = ScalaComponent
    .builder[Unit]("Presentation")
    .renderStatic(
      <.div(
        ^.cls := "reveal",
        <.div(
          ^.cls := "slides",
          Meat.Chapter,
          Intro.Chapter,
          Motivation.Chapter,
        )
      )
    )
    .build

  def main(args: Array[String]): Unit = {
    // Touch to load
    Includes.HighlightingCss
    Includes.WhiteThemeCss
    Includes.RevealCss
    Includes.CustomStyling
    Includes.Reveal
    Includes.ZoomJs

    /* initialize highlight.js */
    highlightDotJsMod.^.initHighlightingOnLoad()

    /* render talk before we initialize Reveal */
    Talk().renderIntoDOM(dom.document.body)

    Includes.Reveal.initialize(
      RevealOptions(
        width      = "80%",
        height     = "100%",
        controls   = false,
        progress   = false,
        history    = true,
        center     = true,
        transition = "none",
      )
    )
  }
}

object Includes {

  /* customize import and use as module, even though the typings originally were global */
  @JSImport("reveal.js/js/reveal.js", JSImport.Namespace)
  @js.native
  object Reveal extends RevealStatic

  @JSImport("reveal.js/plugin/zoom-js/zoom.js", JSImport.Namespace)
  @js.native
  object ZoomJs extends RevealStatic

  @JSImport("reveal.js/lib/css/zenburn.css", JSImport.Namespace)
  @js.native
  object HighlightingCss extends js.Object

  @JSImport("reveal.js/css/theme/white.css", JSImport.Namespace)
  @js.native
  object WhiteThemeCss extends js.Object

  @JSImport("reveal.js/css/reveal.css", JSImport.Namespace)
  @js.native
  object RevealCss extends js.Object

  @JSImport("../../../../src/main/resources/custom.css", JSImport.Namespace)
  @js.native
  object CustomStyling extends js.Object
}
