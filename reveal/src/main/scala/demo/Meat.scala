package demo

import demo.PresentationUtil._
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js

//noinspection TypeAnnotation
object Meat {
  // ## Accidentally writing a compiler
  // - show typescript code from 2017 and today
  // - was just going to upgrade already almost working code
  // - just extend the parser a bit, just remove some mutability, just lookup some names, just rewrite some trees, just make it compile...
  // - *boom*
  //
  //### Introducing typings
  //- nice sounding word, diminutive of `type`
  //- difference typing/facade
  //
  //### Anatomy of a ScalablyTyped library
  //
  //## Compiler
  //
  //walk through:
  //- AST
  //- transformations
  //- how we implement typescript features
  // * defaulted type arguments
  // * union types => inheritance
  // * literal types
  // * module system
  // * type lookups
  // * type queries
  //
  //How we avoid problems / wrestle `scalac` into accepting our code:
  //- fully qualified names
  //- methods? divide and conquer! ExpandTypeParams, SplitMethodsOnOptionalParams, SplitMethodsOnUnionTypes
  //- phases
  //- exports
  //
  //## Build phase
  //- publishing 7000 libraries - where do you start?
  //`sbt clean` *
  //
  //
  //## Design decisions
  //
  //
  //Matryoshka doll analogy. There's another hill after reaching each new top. There's progress but you never know when you'll be done until you're done.

  val Encoding = chapterSlide("Encoding")

  val Interop = slide(
    "Scala.js interop",
    <.h5("""parallel type hierarchy with "javascript semantics""""),
    code.scala(
      """
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
//    list(
//      item(<.span("types extending from ", codeFragment.scala("Any"), """ has "scala semantics"""")),
//      item(<.span("types extending from ", codeFragment.scala("js.Any"), """ has "javascript semantics"""")),
//    ),
  )

  val Anatomy = slide(
    "Anatomy of a typing",
    list(
      item("basic structure"),
      item("avoiding name collisions"),
      item("top level members in `^`"),
    ),
    <.div(
      ^.style := js.Dynamic.literal(display = "flex"),
      code.ts("""
// library foo

declare namespace foo {
    export const foo: string
}

declare function foo(foo: number): number;

declare module "foo" {
  export = foo;
}
"""),
      code.scala("""
package typings
package fooLib

@JSGlobal("foo")
@js.native
object fooNs extends js.Object {
  val foo: scala.String = js.native
}

@JSGlobalScope
@js.native
object ^ extends js.Object {
  def foo(foo: scala.Double): scala.Double = js.native
}

@JSImport("foo", JSImport.Namespace)
@js.native
object fooMod extends js.Object {
  val foo: scala.String = js.native
  def apply(foo: scala.Double): scala.Double = js.native
}
""")
    ),
  )

  val Chapter = chapter(Encoding, Interop, Anatomy)
}
