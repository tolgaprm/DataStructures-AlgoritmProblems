package org.prmto.leet_code.arrays_lists.easy

import org.prmto.base.BaseQuestion

class ContainsDuplicate : BaseQuestion<IntArray, Boolean>() {

    override val questionUrl: String = "https://leetcode.com/problems/contains-duplicate/"

    override val input: IntArray = intArrayOf(2, 3, 1, 4, 5, 1, 24, 2)

    override fun solution(): Boolean {
        val numsSet = input.toSet()
        return numsSet.size < input.size
    }
}