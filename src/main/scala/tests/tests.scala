package tests

/** # AN IMPORTANT TEST CLASS
  *
  * Very important, in fact
  * -----------------------
  *
  * ### So important it gets three headers
  *
  * This is an *important* _test_ class.
  * Important enough to get multiple sentences in its summary.
  *
  * And `this` is inline code.
  *
  * And this is the **strong** __emphasis__ test.
  *
  * And this
  * ```scala
  * is.an("actual code block")
  * ```
  *
  * And this
  *
  *      is.an("indented code block")
  *
  * And this
  * > is
  * > > a
  * > blockquote
  *
  * And this is a link: [](method).
  *
  * And this is another link: [](AA).
  *
  * And this is another link: [](AA$).
  *
  * And this is yet another link: [](tests.Methods).
  *
  * Yet another: [](tests.Methods.simple).
  *
  * And yet another: [](example.level2.Documentation).
  *
  * This is my friend: [](tests.B).
  *
  * And this is his companion: [](tests.B$).
  *
  * @author Gal Anonim
  * @version 1.0.0
  * @result A class doesn't actually have a result.
  * @constructor A class has a constructor, and this one is important.
  */
class A {
  /** This is a method. */
  def method(s: String): String = s

  class AA

  object AA
}

/** Companion object to test linking */
object A

/** = An important Wiki test class =
  *
  * == Very important, in fact ==
  *
  * === So important it gets three headers ===
  *
  * This is an ''important'' '''test''' __class__. And `this` is inline code.
  *
  * While
  * {{{
  * this.is("a code block")
  * }}}
  *
  * And this is a link: [[otherMethod]].
  *
  * And this is another link: [[BB]].
  *
  * And this is yet another link: [[tests.Methods]].
  *
  * Yet another: [[tests.Methods.simple]].
  *
  * And yet another: [[example.level2.Documentation]].
  *
  * This is my friend: [[tests.A]].
  *
  * And this is his companion: [[tests.A$]].
  * @syntax wiki
  */
class B extends A {
  /** This is a method. */
  def otherMethod(s: String): String = s

  class BB
}

/** Companion object to test linking.
  *
  * This is my member: [](B$.Z)
  *
  * And this is my term member: [](B$.Z$)
  *
  * This is my member, addressed differently: [](this.Z)
  *
  * And this is my term member, addressed differently: [](this.Z$)
  */
object B {
  type Z = Int
  val Z: Int = 0
}

class C 
class D[T]
class E[T] extends D[T]

class Constructors(a: String):
    def this() = this("Ala")
    def this(a: A)(b: A) = this("Ala")

/** Some methods to tests */
class Methods:
 def nobraces: A = ???
 /** Class doc test.
   * @throws [[Error]] Throws errors.
   */
 def simple(): B = ???
 def oneParam(a: A): B = ???
 def multipleParams(a: A, b: B): C = ???
 def vararg(a: A*): C = ???
 def multipleList(a: A)(b: B): C = ???

 def generic[T](a: D[T]): D[T] = ???
 def generic2[T, V](a: D[T], b: E[V]): D[T] = ???

 def primitives(a: Int, b: Double, c: Short): Byte = 0
 def strings(a: String): String = ""
 def arrays(a: Array[String], b: Array[Int]): Array[Double] = ???
