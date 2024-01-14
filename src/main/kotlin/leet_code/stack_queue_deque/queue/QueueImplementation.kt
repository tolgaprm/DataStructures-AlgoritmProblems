package org.prmto.leet_code.stack_queue_deque.queue

fun main() {
    println("Queue Implementation")
    val queue = QueueImplementation<Int>()
    queue.enqueue(3)
    queue.enqueue(5)
    queue.showItems()
    queue.dequeue()
    queue.enqueue(6)
    queue.showItems()
}

class QueueImplementation<T> {

    private val mutableList = mutableListOf<T>()

    fun enqueue(item: T) {
        mutableList.add(item)
    }

    fun dequeue(): T {
        val dequeItem = mutableList.removeFirst()
        println("Dequeue $dequeItem")
        return dequeItem
    }

    fun showItems() {
        println(mutableList)
    }
}