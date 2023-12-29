package org.prmto

import org.prmto.arrays_lists.SingleNumber

fun main() {
    val question = SingleNumber()
    println("Question ${question::class.simpleName}")
    println("Solution: ${question.solution()}")
}