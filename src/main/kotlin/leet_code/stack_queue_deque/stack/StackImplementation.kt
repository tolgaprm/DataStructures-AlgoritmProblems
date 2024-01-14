package org.prmto.leet_code.stack_queue_deque.stack

fun main() {
    println("Stack Implementation")
    val stack = MyStack<Int>()
    stack.push(1)
    stack.push(4)
    stack.push(7)
    stack.showItems()
    stack.peek()
    stack.pop()
    stack.pop()
    stack.showItems()
}

class MyStack<T> {

    private val mutableList = mutableListOf<T>()

    fun push(item: T) {
        mutableList.add(index = 0, element = item)
    }

    fun pop(): T {
        val popItem = mutableList.removeFirst()
        println("PopItem: $popItem")
        return popItem
    }

    fun peek(): T {
        val peek = mutableList.first()
        println("Peek: $peek")
        return peek
    }

    fun showItems() {
        println(mutableList)
    }
}