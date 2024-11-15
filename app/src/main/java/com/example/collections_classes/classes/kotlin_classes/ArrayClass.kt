package com.example.collections_classes.classes.kotlin_classes

class ArrayClass {

    /**
     * Companion object that holds an array of days of the week.
     * This array includes Monday to Saturday.
     */
    companion object ArrayObject {
        val array = arrayOf(
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday"
        )
        var arrayBuilt : String? = null
    }

    /**
     * Retrieves the array of days of the week.
     * This method provides access to the companion object array containing days of the week.
     *
     * @return An Array of Strings representing the days of the week from Monday to Saturday.
     */
    private fun arrayScreenImplementation(): Array<String> {
        return array
    }

    /**
     * Prints the array of days and a custom-built string representation of the array to the console.
     * Displays the original array using Kotlin's `contentToString()` for a single-line format,
     * followed by a custom-built format showing each array element on a new line.
     */
    private fun printArray() {
        println("Array Declaration: ${array.contentToString()}")
        println("Array Built: \n${arrayBuilt}")
    }

    /**
     * Builds and prints a formatted string representation of the array of days.
     * For each day in the array, it prepends the index and formats the text in uppercase.
     *
     * @return A String representation of the array with each element prefixed by its index and formatted in uppercase.
     */
    fun printArrayImplementation(): String? {
        val arrayScreen = arrayScreenImplementation()
        var itemBuilder: String? = ""

        arrayScreen.forEachIndexed { index, item ->
            itemBuilder += "Array[$index]:".uppercase() + " $item\n"
        }
        arrayBuilt = itemBuilder
        printArray()
        return itemBuilder
    }

}