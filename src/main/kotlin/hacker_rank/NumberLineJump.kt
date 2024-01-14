package org.prmto.hacker_rank

import org.prmto.base.BaseQuestion

class NumberLineJump : BaseQuestion<NumberLineJumpInput, String>() {

    override val questionUrl: String
        get() = "https://www.hackerrank.com/challenges/kangaroo/problem?isFullScreen=true"

    override val input: NumberLineJumpInput
        get() = kangarooSampleInput


    override fun solution(): String {
        return if (input.x2 > input.x1 && input.v2 >= input.v1) {
            "NO"
        } else if ((input.x2 - input.x1) % (input.v2 - input.v1) == 0) {
            "YES"
        }else{
            "NO"
        }
    }
}

//int x1, int v1: starting position and jump distance for kangaroo 1
//int x2, int v2: starting position and jump distance for kangaroo 2
data class NumberLineJumpInput(
    val x1: Int,
    val v1: Int,
    val x2: Int,
    val v2: Int
)

private val kangarooSampleInput = NumberLineJumpInput(
    x1 = 0,
    v1 = 3,
    x2 = 4,
    v2 = 2
)