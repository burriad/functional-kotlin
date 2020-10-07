package ch.sbb.functionalkotlin.basics

// Exercise 1.1: Write a higher order function that returns a function adding 1 to an input
fun addOneProvider(): (Int) -> Int = TODO("implement")

// Exercise 1.2: Write a higher order function that takes a float and a function f converting a float to an int and
// checks whether the result of applying the function f to the input value is even
fun isEven(value: Float, f: (Float) -> Int): Boolean = TODO("implement")

// Exercise 1.3: Write a higher order function that takes a map of strings and returns a function that returns the
// length of the value for a specific key, or zero when the key is not present
fun valueLength(map: Map<String, String>): (String) -> Int = TODO("implement")

// Exercise 1.4: Partially apply the countOccurrence function so that you get a function counting the number
// of a given character in the string "The quick brown fox jumps over the hedge"
fun countOccurrence(string: String, char: Char): Int = string.filter { c -> c.equals(char, true) }.length
val countOccurrence: (Char) -> Int = TODO("implement")

// Exercise 1.5: Write a higher order function that adapts a predicate to a function that returns the value when the predicate is true and null otherwise
fun predicateToPassthrough(f: (Int) -> Boolean): (Int) -> Int? = TODO("implement")

// Exercise 1.6: Convert the following function into a curried function
// Hint: Write it in block syntax
fun func(a: String, b: String, c: String, d: String): String = "$a, $b, $c, $d"

// Exercise 1.7: Write a function to curry a function of (A, B) to C
fun <A, B, C> curry(f: (A, B) -> C) : Unit = TODO("implement and adjust return type")

// Exercise 1.8: Write a function to partially apply a curried function of two arguments to its second argument
fun <A, B, C> partialB(b: B, f: (A) -> (B) -> C): Unit = TODO("implement and adjust return type")

// Exercise 1.9: Write a function which swaps the arguments of a curried function
fun <A, B, C> swapArgs(f: (A) -> (B) -> C): Unit = TODO("implement and adjust return type")

