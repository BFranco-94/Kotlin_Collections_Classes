package com.example.collections_classes.classes.kotlin_classes

class ListClass {

    companion object {
        private val list = mutableListOf<String>()
    }


    /** to show the size of the list */
    private fun showListSize() {
        println("List size: ${list.size}")
    }

    /** displaying elements in the list using forEach with a lambda expression */
    public fun displayElementsByForEach() {
        list.forEach { item ->
            println(item)
        }
    }


    /** to display elements in the list using a for loop */
    public fun displayElementsByForLoop() : String{
        var listString : String ? = ""
        for (item in list) {
            listString += "\n"+item
        }
        println("Size of the list: ${list.size}")
        printList()
        return listString.toString()
    }

    /** to display elements in the list using a while loop */
    public fun displayElementsByWhileLoop() {
        var index = 0
        while (index < list.size) {
            println(list[index])
            index++
        }
    }

    /** to display elements in the list using a do-while loop */
    public fun displayElementsByDoWhileLoop() {
        var index = 0
        do {
            println(list[index])
            index++
            } while (index < list.size)
        }

    /** to display elements in the list using an iterator */
    public fun displayElementsByIterator() {
        val iterator = list.iterator()
        while (iterator.hasNext()) {
            println(iterator.next())
        }
    }

    /** to add elements to the list */
    fun addToList(item: String) {
        //Manually adding items to the list
            list.add("Monday")
            list.add("Tuesday")
            list.add("Wednesday")
            list.add("Thursday")
            list.add("Friday")
            list.add("Saturday")
        //Using the function to add items to the list
            list.add(item)
    }

    /** to remove elements from the list */
    public fun removeFromList(item: String) {
        println("Removing '$item' from the list")
        list.remove(item)
    }

    /** to print the list */
    private fun printList() {
        println("List: $list")
    }

}