package org.prmto.hacker_rank.easy

import org.prmto.base.BaseQuestion

class TimeConversion : BaseQuestion<String, String>() {
    override val questionUrl: String
        get() = "https://www.hackerrank.com/challenges/time-conversion/submissions/code/242241938"

    override val input: String
        get() = "01:05:45PM"

    override fun solution(): String {
        val hour24List = arrayListOf(
            "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11",
            "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"
        )
        val withoutFormat = input.dropLast(2)
        val splittedHour = withoutFormat.split(":")

        return if (input.endsWith("AM")) {
            if (splittedHour.first() == "12") {
                "00:${splittedHour[1]}:${splittedHour[2]}"
            } else {
                withoutFormat
            }
        } else {
            val hour = splittedHour.first().toIntOrNull() ?: return ""
            val hour24 = if (hour == 12) {
                "12"
            } else {
                hour24List[hour + 12]
            }
            "$hour24:${splittedHour[1]}:${splittedHour[2]}"
        }
    }
}