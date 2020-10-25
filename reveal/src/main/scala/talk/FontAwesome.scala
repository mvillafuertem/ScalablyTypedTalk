package talk

import typings.fortawesomeFontawesomeSvgCore.mod.library
import typings.fortawesomeFreeSolidSvgIcons.mod.faBomb
import typings.fortawesomeReactFontawesome.components.FontAwesomeIcon

object FontAwesome {
  library.add(faBomb)
  val Bomb = FontAwesomeIcon(faBomb)
}
