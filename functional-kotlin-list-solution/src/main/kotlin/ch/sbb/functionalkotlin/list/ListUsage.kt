package ch.sbb.functionalkotlin.list

// 5.1 Write a function sum that sums all ints in a list
// Hint: use the functions defined in List instead of a loop
fun sum(input: List<Int>): Int = input.foldLeft(0, {a:Int -> {b: Int -> a + b}})

// 5.2 Write a function that takes a list of ints and returns a list of ints where each value in the original list is followed by its negative value
// E.g. List(1, 2, 3) -> List(1, -1, 2, -2, 3, -3)
fun withNegatives(original: List<Int>): List<Int> = original.flatMap { i:Int -> List(i, -1) }

