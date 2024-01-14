package org.prmto.leet_code.arrays_lists.easy

import org.prmto.base.BaseQuestion

// Xor ->  [0,1] -> 1 - [1,1] -> 0 -

class SingleNumber : BaseQuestion<IntArray, Int>() {
    override val questionUrl: String
        get() = "https://leetcode.com/problems/single-number/description/"
    override val input: IntArray
        get() = intArrayOf(4, 1, 2, 1, 2)

    override fun solution(): Int {
        var result = 0
        for (i in input) {
            result = result xor i
        }
        return result
    }
}