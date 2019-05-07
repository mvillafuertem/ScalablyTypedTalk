package talk.sections

import japgolly.scalajs.react.vdom.html_<^._
import talk.PresentationUtil._

//noinspection TypeAnnotation
object ScalaJsInterop {

  val Initial = chapterSlide(
    "Scala.js interop with Javascipt",
    <.p("A quick look at our output target")
  )

  val TypeHierarchy = slide(
    """Parallel type hierarchy with "javascript semantics"""",
    code.scala("""
js.Any
 +- js.Object
 |   +- js.Date
 |   +- js.RegExp
 |   +- js.Array[A]
 |   +- js.Function
 |   |   +- js.Function0[+R]
 |   |   +- js.Function1[-T1, +R]
 |   |   +- ...
 |   |   +- js.Function22[-T1, ..., -T22, +R]
 |   |   +- js.ThisFunction
 |   |       +- js.ThisFunction0[-T0, +R]
 |   |       +- js.ThisFunction1[-T0, -T1, +R]
 |   |       +- ...
 |   |       +- js.ThisFunction21[-T0, ..., -T21, +R]
 |   +- js.Iterable[+A]
 |   +- js.Iterator[+A]
 |   +- js.Promise[+A]
 |   +- js.Thenable[+A]
 +- js.Dictionary[A]
 +- js.Symbol
      """),
  )

  def described(ann: String, desc: String) =
    item(<.span(codeFragment.scala(ann), desc))

  val Annotations = slide(
    "Descriptions driven by annotations",
    list(
      <.h5("""Describing what is wrapped"""),
      described("@JSImport", " used for describing a Javascript module"),
      described("@JSGlobal", " used for describing Javascript values in the global scope"),
      <.br,
      <.h5("""Tweaking descriptions"""),
      described("@JSName", " used when a Scala name differs from the Javascript name"),
      <.br,
      <.h5("""Types of descriptions"""),
      described("@ScalaJSDefined", " a simple Javascript structure which we can implement from Scala"),
      described("@js.native", " a complex Javascript structure"),
    )
  )

  val Example = slide(
    "Simple example",
    code.scala(
      """@js.native
@JSImport("jquery", JSImport.Namespace)
object JQuery extends js.Object {
  def apply(x: String): JQuery = js.native
}"""
    )
  )

  val Chapter = chapter(Initial, TypeHierarchy, Annotations, Example)
}
