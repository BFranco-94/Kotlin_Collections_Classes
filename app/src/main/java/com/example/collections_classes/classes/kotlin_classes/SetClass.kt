package com.example.collections_classes.classes.kotlin_classes

class SetClass {

    companion object Set{
        val set = mutableSetOf<String>()
    }

    /** to add elements to the set */
    fun addSet(item: String) {
        //Manually adding items to the set
            set.add("Monday")
            set.add("Tuesday")
            set.add("Wednesday")
            set.add("Thursday")
            set.add("Friday")
            set.add("Saturday")
        // Using the function to add items to the set
            set.add(item)

        println("Adding '$item' to the set")
    }

    /** to remove elements from the set */
    fun removeSet(item: String) {
        println("Removing '$item' from the set")
        set.remove(item)
    }

    /** to show the size of the set */
    fun showSetSize() {
        println("Set size: ${set.size}")
    }

    /** to check if an element is in the set */
    fun setContains(item: String) : Boolean {
        return set.contains(item)
    }

    /** to print the set */
    fun printSet() {
        println("Set: $set")
    }

    /** to display elements in the list using an iterator */
    fun printByIterator() {
        val iterator = set.iterator()
        while (iterator.hasNext()) {
            println(iterator.next())
        }
    }

    /** to display elements in the list using a for loop by expression lambda */
    fun printByForEach(): String{
        val setClass = SetClass()
        set.forEach { item ->
            setClass.let {
                "\n"+item
            }
            println("\n"+item)
        }

        return set.toString()
    }

    /** to display elements in the list using a while loop */
    fun printByWhileLoop() {
        var index = 0
        while (index < set.size) {
            println(set.elementAt(index))
            index++
        }
    }

    /** to display elements in the list using forLoop loop */
    fun printByForLoop(): String{
        var stringFormated : String ? = ""
        for (item in set) {
            stringFormated += "\n"+item
            println(item)
        }
        return stringFormated.toString()
    }


}