package org.prmto.arrays_lists.majorityElement

import org.prmto.base.BaseQuestion

// Majority element is the element that appears more than [n/2] times
class MajorityElement : BaseQuestion<IntArray, Int>() {
    override val input: IntArray
        get() = intArrayOf(2, 2, 1, 1, 1, 2, 2) // Majority element is 2

    override fun solution(): Int {
        val hashMap: HashMap<Int, Int> = HashMap()
        for (num in input) {
            val current = hashMap[num] ?: 0
            hashMap[num] = current + 1
            if ((current + 1) > input.size / 2) return num
        }
        return 0
    }
}