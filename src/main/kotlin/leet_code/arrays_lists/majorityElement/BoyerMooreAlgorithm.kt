package org.prmto.leet_code.arrays_lists.majorityElement

import org.prmto.base.BaseQuestion

class BoyerMooreAlgorithm : BaseQuestion<IntArray, Int>() {

    override val questionUrl: String = "https://leetcode.com/problems/majority-element/description/"
    override val input: IntArray
        get() = intArrayOf(2, 2, 1, 1, 1, 2, 2)

    override fun solution(): Int {
        var count = 0
        var candidate: Int? = null
        for (num in input) {
            if (count == 0) {
                candidate = num
            }
            count += if (num == candidate) 1 else -1
        }
        return candidate!!
    }
}