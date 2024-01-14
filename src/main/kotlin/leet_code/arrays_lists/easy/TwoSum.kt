package org.prmto.leet_code.arrays_lists.easy

import org.prmto.base.BaseQuestion

class TwoSum : BaseQuestion<TwoSumInput, IntArray>() {
    override val questionUrl: String
        get() = "https://leetcode.com/problems/two-sum/description/"
    override val input: TwoSumInput
        get() = sampleInput4

    override fun solution(): IntArray {
        val numToIndex = HashMap<Int, Int>()
        val nums = input.nums
        val target = input.target
        nums.forEachIndexed { index, num ->
            if (numToIndex.containsKey(target - num)) {
                return intArrayOf(numToIndex[target - num]!!, index)
            }

            numToIndex[num] = index
        }

        return arrayOf(0, 0).toIntArray()
    }
}

data class TwoSumInput(
    val nums: Array<Int>,
    val target: Int
)

private val sampleInput = TwoSumInput(
    nums = arrayOf(11, 15, 2, 7),
    target = 9
)

private val sampleInput2 = TwoSumInput(
    nums = arrayOf(3, 2, 4),
    target = 6
)

private val sampleInput3 = TwoSumInput(
    nums = arrayOf(3, 3),
    target = 6
)

private val sampleInput4 = TwoSumInput(
    nums = arrayOf(3, 2, 3),
    target = 6
)