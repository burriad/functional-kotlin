package ch.sbb.functionalkotlin.basics

// 2.1 Given the function prepend, write a recursive function concat that concatenates a list of chars to a string
fun prepend(c: Char, s: String): String = "$c$s"
fun concat(chars: List<Char>): String = TODO("implement")

// 2.2 Write a binary search function which takes a sorted list of ints and checks whether an element is present
fun binarySearch(value: Int, list: List<Int>): Boolean = TODO("implement")

// 2.3 (HARD) Create a tail-recursive version of the Fibonacci function
// Hint: the Fibonacci series is 1, 1, 2, 3, 5, 8, 13, 21; hence the number n is the sum of the numbers n-2 and n-1
fun fib(n: Int): Int = TODO("implement")
