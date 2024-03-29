package org.prmto.base

abstract class BaseQuestion<I, O> {

    abstract val questionUrl: String

    abstract val input: I

    abstract fun solution(): O
}