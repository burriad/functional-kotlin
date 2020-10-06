package ch.sbb.functionalkotlin.basics

// 2.1 Given the function prepend, write a recursive function concat that concatenates a list of chars to a string
fun prepend(c: Char, s: String): String = "$c$s"

fun concat(chars: List<Char>): String =
        if (chars.isEmpty()) "" else prepend(chars.first(), concat(chars.takeLast(chars.size - 1)))

// 2.2 Write a binary search function which takes a sorted list (ASC) of ints and checks whether an element is present
fun binarySearch(value: Int, list: List<Int>): Boolean =
        when {
            list.isEmpty() -> false
            list[middle(list)] < value -> binarySearch(value, list.subList(middle(list) + 1, list.size))
            list[middle(list)] > value -> binarySearch(value, list.subList(0, middle(list)))
            else -> true
        }

fun middle(list: List<Int>) = list.size / 2

// 2.3 (HARD) Create a tail-recursive version of the Fibonacci function
// Hint: the Fibonacci series is 1, 1, 2, 3, 5, 8, 13, 21; hence the number n is the sum of the numbers n-2 and n-1
fun fibRec(n: Int): Int =
        when {
            n == 0 -> 1
            n == 1 -> 1
            else -> fibRec(n - 1) + fibRec(n - 2)
        }

tailrec fun fibCorec(n: Int, a: Int = 0, b: Int = 1): Int =
        when (n) {
            0 -> a
            1 -> b
            else -> fibCorec(n - 1, b, a + b)
        }