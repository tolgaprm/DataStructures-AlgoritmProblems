package org.prmto.arrays_lists

import org.prmto.base.BaseQuestion

// Xor ->  [0,1] -> 1 - [1,1] -> 0 -

class SingleNumber : BaseQuestion<IntArray, Int>() {
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