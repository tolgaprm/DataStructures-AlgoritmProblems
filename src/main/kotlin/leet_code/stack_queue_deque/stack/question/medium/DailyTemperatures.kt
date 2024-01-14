package org.prmto.leet_code.stack_queue_deque.stack.question.medium

import org.prmto.base.BaseQuestion
import java.util.*

class DailyTemperatures : BaseQuestion<IntArray, IntArray>() {

    override val questionUrl: String
        get() = "https://leetcode.com/problems/daily-temperatures/"

    override val input: IntArray = intArrayOf(73, 74, 75, 71, 69, 72, 76, 73)

    private val stack = Stack<List<Int>>()
    private val result = MutableList(input.size) { 0 }

    override fun solution(): IntArray {
        input.forEachIndexed { index, temperature ->
            while (stack.isNotEmpty() && temperature > stack.peek()[0]) {
                val (stackTemp, stackIndex) = stack.pop()
                result[stackIndex] = index - stackIndex
            }
            stack.push(listOf(temperature, index))
        }
        return result.toIntArray()
    }
}