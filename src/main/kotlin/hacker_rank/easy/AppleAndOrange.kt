package org.prmto.hacker_rank.easy

import org.prmto.base.BaseQuestion

class AppleAndOrange : BaseQuestion<AppleOrangeInput, Unit>() {

    override val questionUrl: String = "https://www.hackerrank.com/challenges/apple-and-orange/problem?isFullScreen=true"

    override val input: AppleOrangeInput = sampleInput

    override fun solution() {
        val house = sampleInput.s..sampleInput.t
        val locationAppleTree = sampleInput.a
        val locationOrangeTree = sampleInput.b
        var appleCount = 0
        var orangeCount = 0

        sampleInput.apples.filter { it > 0 }.forEach { appleLocate ->
            if (appleLocate + locationAppleTree in house) {
                appleCount++
            }
        }

        sampleInput.oranges.filter { it < 0 }.forEach { orangeLocate ->
            if (locationOrangeTree + orangeLocate in house) {
                orangeCount++
            }
        }

        println(appleCount)
        println(orangeCount)
    }
}

data class AppleOrangeInput(
    val s: Int,
    val t: Int,
    val a: Int,
    val b: Int,
    val apples: Array<Int>,
    val oranges: Array<Int>
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as AppleOrangeInput

        if (s != other.s) return false
        if (t != other.t) return false
        if (a != other.a) return false
        if (b != other.b) return false
        if (!apples.contentEquals(other.apples)) return false
        if (!oranges.contentEquals(other.oranges)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = s
        result = 31 * result + t
        result = 31 * result + a
        result = 31 * result + b
        result = 31 * result + apples.contentHashCode()
        result = 31 * result + oranges.contentHashCode()
        return result
    }
}

/*
* The s value is start point of the house. The t value is end point of the house
* Apple tree is point at a. Orange tree is point at b.
* 
* */
private val sampleInput = AppleOrangeInput(
    s = 7,
    t = 11,
    a = 5,
    b = 15,
    apples = arrayOf(-2, 2, 1),
    oranges = arrayOf(5, -6)
)