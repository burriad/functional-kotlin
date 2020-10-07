package ch.sbb.functionalkotlin.basics

// 2.1 Given the function prepend, write a recursive function concat that concatenates a list of chars to a string
fun prepend(c: Char, s: String): String = "$c$s"

fun concat(chars: List<Char>): String =
        if (chars.isEmpty()) "" else prepend(chars.first(), concat(chars.takeLast(chars.size - 1)))

// 2.2 Create a recursive version of a function that computes the n-th number in the Fibonacci sequence
// Hint: the Fibonacci series is 0, 1, 1, 2, 3, 5, 8, 13, 21; hence the n-th number in the sequence is the sum of the (n-2)th and (n-1)th numbers
fun fibRec(n: Int): Int =
        when (n) {
            0 -> 0
            1 -> 1
            else -> fibRec(n - 1) + fibRec(n - 2)
        }

// 2.3 (HARD) Create a tail-recursive version of the function in 2.2
fun fibCorec(n: Int): Int {
    tailrec fun _fib(n: Int, prev2: Int, prev1: Int): Int =
            when (n) {
                0 -> prev2
                1 -> prev1
                else -> _fib(n - 1, prev1, prev2 + prev1)
            }
    return _fib(n, 0, 1)
}

// 2.4 (Extra) Write a binary search function which takes a sorted list of ints and checks whether an element is present
fun binarySearch(value: Int, list: List<Int>): Boolean =
        when {
            list.isEmpty() -> false
            list[middle(list)] < value -> binarySearch(value, list.subList(0, middle(list)))
            list[middle(list)] > value -> binarySearch(value, list.subList(middle(list) + 1, list.size))
            else -> true // list[middle(list)] == value
        }

fun middle(list: List<Int>) = list.size / 2
