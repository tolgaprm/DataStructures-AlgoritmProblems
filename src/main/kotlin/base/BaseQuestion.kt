package org.prmto.base

abstract class BaseQuestion<I, O> {

    abstract val input: I

    abstract fun solution(): O
}