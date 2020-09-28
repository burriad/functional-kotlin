package ch.sbb.functionalkotlin.basics

// Exercise 1.1: Convert the following function into a curried function.
// Hint: Write it in block syntax
val func =
        { a: String ->
            { b: String ->
                { c: String ->
                    { d: String -> "$a, $b, $c, $d" }
                }
            }
        }

// Exercise 1.2: Write a function to curry a function of (A, B) to C
fun <A, B, C> curry(f: (A, B) -> C): (A) -> (B) -> C = { a: A -> { b: B -> f(a, b) } }

// Exercise 1.3: Write a function to partially apply a curried function of two arguments to its second argument
fun <A, B, C> partialB(b: B, f: (A) -> (B) -> C): (A) -> C = { a: A -> f(a)(b) }

// Exercise 1.4: Write a function which swaps the arguments of a curried function
fun <A, B, C> swapArgs(f: (A) -> (B) -> C): (B) -> (A) -> C = { b: B -> { a: A -> f(a)(b) } }

