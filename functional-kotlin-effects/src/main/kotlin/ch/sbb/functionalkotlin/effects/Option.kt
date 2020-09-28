package ch.sbb.functionalkotlin.effects

sealed class Option<out A> {

    abstract fun isEmpty(): Boolean

    // Exercise 3.1: Implement a getOrElse function that returns either the contained value, if it exists, or a provided default one
    fun getOrElse(default: @UnsafeVariance A): A = TODO("Implement this function")

    // Exercise 3.2: Create a map function to change an Option<A> into an Option<B> by applying a function from A to B
    // Hint: the function can be either implemented in the subclasses or once for both subtypes in the parent class
    fun <B> map(f: (A) -> B): Option<B> = TODO("map")

    // Exercise 3.3: Create a flatMap instance function taking as an argument a function from A to Option<B> and returning an Option<B>.
    // Hint: Try defining the function in terms of map and getOrElse
    fun <B> flatMap(f: (A) -> Option<B>): Option<B> = TODO("flatMap")

    // Exercise 3.4: Implement a filter function that keeps an option's value only when a condition is fulfilled
    fun filter(p: (A) -> Boolean): Option<A> = TODO("filter")


    internal object None: Option<Nothing>() {

        override fun isEmpty() = true

        override fun toString(): String = "None"

        override fun equals(other: Any?): Boolean = other is None

        override fun hashCode(): Int = 0
    }

    internal data class Some<out A>(internal val value: A) : Option<A>() {

        override fun isEmpty() = false
    }

    companion object {

        operator fun <A> invoke(a: A? = null): Option<A> = when (a) {
            null -> None
            else -> Some(a)
        }
    }
}