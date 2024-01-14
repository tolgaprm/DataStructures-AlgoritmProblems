package org.prmto.stack_queue_deque.stack.question

import org.prmto.base.BaseQuestion
import java.util.*

class BaseballGame : BaseQuestion<Array<String>, Int>() {
    override val questionUrl: String
        get() = "https://leetcode.com/problems/baseball-game/description/"

    override val input: Array<String> = arrayOf(
        "5", "2", "C", "D", "+"
    )

    private val stack = Stack<Int>()

    override fun solution(): Int {
        var totalSum = 0
        input.forEach { operation ->
            when (operation) {
                "C" -> stack.pop()

                "D" -> stack.push(stack.peek() * 2)

                "+" -> stack.push(stack.peek() + stack[stack.size - 2])

                else -> stack.push(operation.toInt())
            }
        }


        for (i in stack) {
            totalSum += i
        }

        return totalSum
    }
}