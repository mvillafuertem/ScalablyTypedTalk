package talk.sections

import japgolly.scalajs.react.vdom.html_<^._
import talk.PresentationUtil._
import typings.fortawesomeFontawesomeSvgCore.mod.library
import typings.fortawesomeFreeSolidSvgIcons.mod.faStroopwafel
import typings.fortawesomeReactFontawesome.components.FontAwesomeIcon

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

//noinspection TypeAnnotation
object MotivationCommunity {
  library.add(faStroopwafel)

  @JSImport("../../../../src/main/resources/happy_sad_meme.jpg", JSImport.Namespace)
  @js.native
  val MemeHappySadImg: String = js.native

  @JSImport("../../../../src/main/resources/meme_wrappers.jpg.jpg", JSImport.Namespace)
  @js.native
  val MemeWrappersImg: String = js.native

  val ContributorAttrition2 = slide(
    "Phases of contributor attrition",
    list(
      item(FontAwesomeIcon(faStroopwafel)),
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
