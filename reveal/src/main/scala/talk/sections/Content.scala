package talk.sections

import japgolly.scalajs.react.vdom.html_<^._
import talk.PresentationUtil._

//noinspection TypeAnnotation
object Content {

  val Initial = chapterSlide("Enter ScalablyTyped")

  val ScalablyTyped = slide(
    "Goals",
    list(
      item("Typescript type definitions automatically translated to Scala.js"),
      item("Stop spending time maintaining typings"),
      item("Make most of the Javascript ecosystem usable")
    )
  )

  val HaventPeopleTriedThis = slide(
    "Loads of prior art",
    list(
      item("DefinitelyScala"),
      item("scala-js-ts-importer"),
      item("Retyped for C#"),
      item("ts2k and dukat for Kotlin"),
      item("ReasonablyTyped for Reason ML"),
      item("typescript2java")
    )
  )

  val Status = slide(
    "Status",
    list(
      item("Translates close to everything"),
      item("Not always in an awesome way"),
      item("Encoding has been quite stable for a while")
    )
  )

  val HowItWorks = slide(
    "Sbt plugin",
    list(
      item(<.span("See ", link("scalablytyped.org/docs/plugin"))),
      item("Downloads Typescript definitions"),
      item(<.span("Generates Scala jar files and adds them to ", codeFragment.scala("libraryDependencies"))),
      item("Can share built jars through S3"),
      item(<.span("Configurable ", link("scalablytyped.org/docs/conversion-options")))
    )
  )

  val Flavours = slide(
    "Awesome react support",
    codeSplit(
      """<Input
           |  addonBefore={<AntdIcon icon={UserOutlinedIcon}/>}
           |  placeholder="Basic usage"
           |  onChange={event => console.log(event.target.value)}
           |/>
           |""".stripMargin,
      """Input
           |  .addonBefore(AntdIcon(icon = UserOutlinedIcon))
           |  .placeholder("Basic usage")
           |  .onChange(event => console.log(event.target.value))
           |""".stripMargin
    )
  )

  val RunDemo = slide(
    "(Demo)",
    link("github.com/oyvindberg/scalajs-fullstack")
  )

  val Demos = slide(
    "Heaps of demos at available",
    list(
      item(link("github.com/ScalablyTyped/Demos")),
      item(link("github.com/ScalablyTyped/ScalaJsReactDemos")),
      item(link("github.com/ScalablyTyped/SlinkyDemos")),
      <.br,
      item(
        withExamples(
          "For instance",
          "react",
          "react-native",
          "electron",
          "storybook",
          "node/express",
          "d3",
          "angular"
        )
      ),
      <.br,
      item("Pull requests welcome!")
    )
  )

  val Chapter = chapter(
    Initial,
    ScalablyTyped,
//    Numbers,
//    Unstable,
    HaventPeopleTriedThis,
    Status,
    HowItWorks,
    Flavours,
    RunDemo,
    Demos
  )
}
