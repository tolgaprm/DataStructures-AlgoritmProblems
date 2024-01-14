package org.prmto.leet_code.stack_queue_deque.deque

fun main() {
    println("Deque Implementation")
    val deque = DequeImplementation<Int>()
    deque.addLeft(5)
    deque.addLeft(4)
    deque.addRight(6)
    // Expected 4,5,6
    deque.showItems()
    deque.removeLeft()
    // Expected 5,6
    deque.showItems()
}

class DequeImplementation<T> {

    private val mutableList = mutableListOf<T>()

    fun addLeft(item: T) {
        mutableList.add(index = 0, element = item)
    }

    fun addRight(item: T) {
        mutableList.add(element = item)
    }

    fun removeRight(): T {
        val removedItem = mutableList.removeFirst()
        println("Remove Right $removedItem")
        return removedItem
    }

    fun removeLeft(): T {
        val removedItem = mutableList.removeLast()
        println("Remove Left $removedItem")
        return removedItem
    }

    fun showItems() {
        println(mutableList)
    }
}