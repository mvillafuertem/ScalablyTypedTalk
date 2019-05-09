package talk

import japgolly.scalajs.react.{Children, JsComponent}
import typings.atFortawesomeFontawesomeDashSvgDashCoreLib.atFortawesomeFontawesomeDashSvgDashCoreMod.^.library
import typings.atFortawesomeFreeDashSolidDashSvgDashIconsLib.atFortawesomeFreeDashSolidDashSvgDashIconsMod.faBomb
import typings.atFortawesomeReactDashFontawesomeLib.atFortawesomeReactDashFontawesomeLibComponents.{
  FontAwesomeIcon,
  Props => FontAwesomeProps
}

import scala.scalajs.js

object FontAwesome {
  val Component = JsComponent[FontAwesomeProps, Children.None, js.Object](FontAwesomeIcon.asInstanceOf[js.Object])
  library.add(faBomb)

  val Bomb = Component(FontAwesomeProps(faBomb))
}
