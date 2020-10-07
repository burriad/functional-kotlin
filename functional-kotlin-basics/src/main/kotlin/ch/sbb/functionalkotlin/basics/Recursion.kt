package ch.sbb.functionalkotlin.basics

// 2.1 Given the function prepend, write a recursive function concat that concatenates a list of chars to a string
fun prepend(c: Char, s: String): String = "$c$s"
fun concat(chars: List<Char>): String = TODO("implement")

// 2.2 Create a recursive version of a function that computes the n-th number in the Fibonacci sequence
// Hint: the Fibonacci series is 0, 1, 1, 2, 3, 5, 8, 13, 21; hence the n-th number in the sequence is the sum of the (n-2)th and (n-1)th numbers
fun fib_rec(n: Int): Int = TODO("implement")

// 2.3 (HARD) Create a tail-recursive version of the function in 2.2
fun fib_corec(n: Int): Int = TODO("implement")

// 2.4 (Extra) Write a binary search function which takes a sorted list of ints and checks whether an element is present
fun binarySearch(value: Int, list: List<Int>): Boolean = TODO("implement")
