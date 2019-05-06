package talk.sections

import japgolly.scalajs.react.vdom.html_<^._
import talk.PresentationUtil._

//noinspection TypeAnnotation
object ScalablyTypedEncoding {
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

  val Encoding = chapterSlide("ScalablyTyped encoding")

  val Features = slide("Converter features",
    list(
      item("Parser for ~all of Typescript"),
      item("Keeps ~all comments"),
      item("Full handling of dependencies between libraries, including those outside of `DefinitelyTyped`"),
      item("Full implementation of the module system, which all useful javascript libraries rely on"),
      item("~All types and values are fully resolved, across library boundaries"),
      item("A naming scheme to avoid name collisions"),
      item("Scala.js must abide by JVM rules, so we handle erasure, overloads, overrides, default parameters, var conflicts, inheritance conflicts, etc."),
      item("Better user convenience by converting to @ScalaJSDefined traits"),
      item("Bridges gap between structural and nominal typing somewhat by a strong bias towards type aliases instead of traits"),
      item(<.span("Answers typeof queries and type lookups (", codeFragment.scala("React.Props['children']"), ")")),
      item("Fills in defaulted type parameters"),
    ))

  val Anatomy = slide(
    "Anatomy of a typing",
    list(
      item("basic structure"),
      item("avoiding name collisions"),
      item("top level members in `^`"),
    ),
    codeSplit(
      """
// library foo

declare namespace foo {
    export const foo: string
}

declare function foo(foo: number): number;

declare module "foo" {
  export = foo;
}
""",
      """
package typings
package fooLib

@JSGlobal("foo")
@js.native
object fooNs extends js.Object { // or package fooNs
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
"""
    ),
  )

  val Methods = slide(
    "Methods",
    list(
      item("Huge challenge for conversion"),
      item("Typescript is basically a big DSL for perfectly describing javascript interfaces"),
      item("Scala.js bound by JVM constraints, like erasure"),
      item.fadeIn("")
    )
  )

  val LiteralTypes = slide(
    "literal types",
    codeSplit(
      """
export class Readable
  extends Stream
  implements NodeJS.ReadableStream {
    on(event: "close", listener: () => void): this;
}""",
      """
@JSImport("stream", "Readable")
@js.native
class Readable ()
  extends Stream
     with nodeLib.NodeJSNs.ReadableStream {
  @JSName("on")
  def on_close(
    event: nodeLib.nodeLibStrings.close,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
}

object nodeLibStrings {
  @js.native
  sealed trait close extends js.Object

  @scala.inline
  def close: close = "close".asInstanceOf[close]
}"""
    )
  )

  val UnionTypes = slide("union types", code.scala("""

      """))

  val AnonymousTypes = slide("anonymous types")

  val Chapter =
    chapter(
      Encoding,
      Anatomy,
      LiteralTypes,
      UnionTypes,
      AnonymousTypes
    )
}
