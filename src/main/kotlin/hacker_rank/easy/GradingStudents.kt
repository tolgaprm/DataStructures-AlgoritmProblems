package org.prmto.hacker_rank.easy

import org.prmto.base.BaseQuestion

class GradingStudents : BaseQuestion<Array<Int>, Array<Int>>() {
    override val questionUrl: String = "https://www.hackerrank.com/challenges/grading/problem?isFullScreen=true"

    override val input: Array<Int> = arrayOf(4, 73, 67, 38, 33)

    override fun solution(): Array<Int> {
        val output = mutableListOf<Int>()

        for (i in input) {
            val mod = 5 - (i % 5)
            if (i < 38 || mod >= 3) {
                output.add(i)
            } else {
                output.add(i + mod)
            }
        }

        return output.toTypedArray()
    }
}