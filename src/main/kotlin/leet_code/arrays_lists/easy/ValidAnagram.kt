package org.prmto.leet_code.arrays_lists.easy

import org.prmto.base.BaseQuestion

class ValidAnagram : BaseQuestion<ValidAnagramInput, Boolean>() {
    override val questionUrl: String
        get() = "https://leetcode.com/problems/valid-anagram/description/"

    override val input: ValidAnagramInput
        get() = sampleInputOutputYES

    override fun solution(): Boolean {
      return input.s.groupBy { it } == input.t.groupBy { it }
    }
}

data class ValidAnagramInput(
    val s: String,
    val t: String
)

private val sampleInputOutputYES = ValidAnagramInput(
    s = "anagram",
    t = "nagaram"
)

private val sampleInputOutputNO = ValidAnagramInput(
    s = "rat",
    t = "car"
)