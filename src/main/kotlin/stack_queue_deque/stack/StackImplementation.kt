package org.prmto.stack_queue_deque.stack

fun main() {
    println("Stack Implementation")
    val stack = MyStack<Int>()
    stack.push(1)
    stack.push(4)
    stack.showItems()
    println(stack.peek())
    stack.pop()
    stack.showItems()
}

class MyStack<T> {

    private val mutableList = mutableListOf<T>()

    fun push(item: T) {
        mutableList.add(index = 0, element = item)
    }

    fun pop(): T {
        return mutableList.removeFirst()
    }

    fun peek(): T {
        return mutableList.first()
    }

    fun showItems() {
        println(mutableList)
    }
}