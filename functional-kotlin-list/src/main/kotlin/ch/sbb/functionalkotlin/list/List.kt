package ch.sbb.functionalkotlin.list

sealed class List<out A> {

    abstract fun isEmpty(): Boolean

    // Exercise 4.1: Implement the function cons, adding an element at the beginning of a list. (cons stands for construct.)
    fun cons(a: @UnsafeVariance A): List<A> = TODO("implement")

    // Exercise 4.2: Implement a function that drops (at most) n elements
    // Hint: consider recursion vs. co-recursion, polymorphic vs. single implementation in companion object
    fun drop(n: Int): List<A> = TODO("implement")

    fun <B> foldRight(identity: B, f: (A) -> (B) -> B): B = foldRight(this, identity, f)

    // Exercise 4.3: Implement a function foldLeft
    // Hint: see foldRight for inspiration...
    fun <B> foldLeft(identity: B, f: (B) -> (A) -> B): B = TODO("implement")

    fun length(): Int = foldLeft(0) { { _ -> it + 1} }

    // Exercise: 4.4: Implement a co-recursive function of foldRight
    // Hint: Use functions already provided here
    fun <B> coFoldRight(identity: B, f: (A) -> (B) -> B): B = TODO("implement")

    fun concat(list: List<@UnsafeVariance A>): List<A> = concat(this, list)

    fun reverse(): List<A> = foldLeft(Nil as List<A>) { acc -> { acc.cons(it) } }

    fun <B> map(f: (A) -> B): List<B> = foldLeft(Nil) { acc: List<B> -> { h: A -> Cons(f(h), acc) } }.reverse()

    fun <B> flatMap(f: (A) -> List<B>): List<B> = flatten(map(f))

    fun filter(p: (A) -> Boolean): List<A> = flatMap { a -> if (p(a)) List(a) else Nil }

    private object Nil: List<Nothing>() {

        override fun isEmpty() = true

        override fun toString(): String = "[NIL]"
    }

    private class Cons<out A>(internal val head: A, internal val tail: List<out A>) : List<A>() {

        override fun isEmpty() = false

        override fun toString(): String = "[${toString("", this)}NIL]"

        private tailrec fun toString(acc: String, list: List<A>): String = when (list) {
            Nil -> acc
            is Cons -> toString("$acc${list.head}, ", list.tail)
        }
    }

    companion object {

        operator fun <A> invoke(vararg az: A): List<A> =
                az.foldRight(Nil as List<A>) { a: A, list: List<A> -> Cons(a, list) }

        fun <A, B> foldRight(list: List<A>, identity: B, f: (A) -> (B) -> B): B =
                when (list) {
                    Nil -> identity
                    is Cons -> f(list.head)(foldRight(list.tail, identity, f))
                }

        fun <A> concat(list1: List<A>, list2: List<A>): List<A> = list1.reverse().foldLeft(list2) { x -> x::cons }

        fun <A> flatten(list: List<List<A>>): List<A> = list.coFoldRight(Nil) { x -> x::concat }
    }
}


