package talk

import org.scalajs.dom
import typings.highlightDotJsLib.highlightDotJsMod
import typings.revealLib.{RevealOptions, RevealStatic}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react.ScalaComponent
import japgolly.scalajs.react.vdom.html_<^._
import org.scalablytyped.runtime.TopLevel

object Main {
  val Talk = ScalaComponent
    .builder[Unit]("Presentation")
    .renderStatic(
      <.div(
        ^.cls := "reveal",
        <.div(
          ^.cls := "slides",
          sections.Intro.Chapter,
//          sections.MotivationCommunity.Chapter,
          sections.Motivation.Chapter,
          sections.About.Chapter,
          sections.ScalaJsInterop.Chapter,
          sections.Encoding.Chapter,
        )
      )
    )
    .build

  def main(args: Array[String]): Unit = {
    // Touch to load
    Includes.HighlightingTheme
    Includes.RevealTheme
    Includes.RevealCss
    Includes.Reveal
    Includes.ZoomJs

    /* initialize highlight.js */
    highlightDotJsMod.^.initHighlightingOnLoad()

    /* render talk before we initialize Reveal */
    Talk().renderIntoDOM(dom.document.body)

    Includes.Reveal.initialize(
      RevealOptions(
        width      = "80%",
        height     = "90%",
        controls   = false,
        progress   = false,
        history    = true,
        center     = true,
        transition = "none",
        // Parallax background image
        parallaxBackgroundImage = Includes.Background,
        // CSS syntax, e.g.  - currently only pixels are supported (don't use % or auto)
        parallaxBackgroundSize = "4608px 3072px",
        // Number of pixels to move the parallax background per slide
        // - Calculated automatically unless specified
        // - Set to 0 to disable movement along an axis
//        parallaxBackgroundHorizontal = 200,
//        parallaxBackgroundVertical   = 100,
      )
    )
  }

  object Includes {
    /* customize import and use as module, even though the typings originally were global */
    @JSImport("reveal.js/js/reveal.js", JSImport.Namespace)
    @js.native
    object Reveal extends RevealStatic

    @JSImport("reveal.js/plugin/zoom-js/zoom.js", JSImport.Namespace)
    @js.native
    object ZoomJs extends js.Object

    @JSImport("reveal.js/css/reveal.css", JSImport.Namespace)
    @js.native
    object RevealCss extends js.Object

    @JSImport("highlight.js/styles/darcula.css", JSImport.Namespace)
    @js.native
    object HighlightingTheme extends js.Object

    @JSImport("../../../../src/main/resources/revealtheme.css", JSImport.Namespace)
    @js.native
    object RevealTheme extends js.Object

    @JSImport("../../../../src/main/resources/background.jpg", JSImport.Namespace)
    @js.native
    object Background extends TopLevel[String]
  }
}
