package org.prmto

import org.prmto.stack_queue_deque.stack.question.BaseballGame

fun main() {
    val question = BaseballGame()
    println("Question ${question::class.simpleName}")
    println("Solution: ${question.solution()}")
}