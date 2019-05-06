package talk.sections

import japgolly.scalajs.react.vdom.html_<^._
import japgolly.scalajs.react.{Children, JsComponent}
import org.scalablytyped.runtime.TopLevel
import talk.PresentationUtil._
import typings.atFortawesomeFontawesomeDashSvgDashCoreLib.atFortawesomeFontawesomeDashSvgDashCoreMod.^.library
import typings.atFortawesomeFreeDashSolidDashSvgDashIconsLib.atFortawesomeFreeDashSolidDashSvgDashIconsMod.faStroopwafel
import typings.atFortawesomeReactDashFontawesomeLib.atFortawesomeReactDashFontawesomeLibComponents.{
  FontAwesomeIcon,
  Props => FontAwesomeProps
}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

//noinspection TypeAnnotation
object MotivationCommunity {
  val FontAwesome = JsComponent[FontAwesomeProps, Children.None, js.Object](FontAwesomeIcon.asInstanceOf[js.Object])
  library.add(faStroopwafel)

  @JSImport("../../../../src/main/resources/happy_sad_meme.jpg", JSImport.Namespace)
  @js.native
  object MemeHappySadImg extends TopLevel[String]

  @JSImport("../../../../src/main/resources/meme_wrappers.jpg.jpg", JSImport.Namespace)
  @js.native
  object MemeWrappersImg extends TopLevel[String]

  val ContributorAttrition2 = slide(
    "Phases of contributor attrition",
    list(
      item(FontAwesome(FontAwesomeProps(faStroopwafel))),
      item.fadeIn(<.span("Yey! Scala.js!")),
      item.fadeIn("Soo, how can I use ...?"),
      item.fadeIn("Oh, I'm writing a wrapper"),
      item.fadeIn("Look, "),
    )
  )

  val ContributorAttrition = slide("Phases of contributor attrition", <.img(^.src := (MemeHappySadImg: String)))

  val Chapter = chapter(
    chapterSlide("Motivation (community)"),
    ContributorAttrition,
    ContributorAttrition2,
  )
}
