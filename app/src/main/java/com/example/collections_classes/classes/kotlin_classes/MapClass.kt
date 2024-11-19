package com.example.collections_classes.classes.kotlin_classes

class MapClass {

    /** to create a map and companion object to add elements to the map */
    companion object Map{
        val map = mutableMapOf<Int, String>()
    }

    /** to add elements to the map */
    fun mapItemCreator() {
        //Manually adding items to the map
            map[1] = "Monday"
            map[2] = "Tuesday"
            map[3] = "Wednesday"
            map[4] = "Thursday"
            map[5] = "Friday"
            map[6] = "Saturday"
        println("Map: $map")
    }

    /** to add elements to the map with no repeat values */
    fun addMapItems(value: String) {

        /** 1 assigns 1 as the starting key if the map is empty (no existing keys)
         *  maxOrNull() finds the highest existing key in the map. **/
        var newKey = map.keys.maxOrNull()?.plus(1) ?: 1
        while (map.containsKey(newKey)) {
            newKey++
        }
        // print the new item added to the map
        map[newKey] = value
        searchMapItem(newKey)
    }

    private fun searchMapItem(key: Int) {
        val item = map[key]
        if (item != null) {
            println("New Map updated with Key[$key] = Value[$item] added")
        } else {
            println("No item found with key $key")
        }
    }

    /** to check if an element is in the map by value */
    fun mapContains(value: String) : Boolean {
        return map.containsValue(value)
    }

    /** to check if an element is in the map by key */
    fun mapContains(key: Int) : Boolean {
        return map.containsKey(key)
    }

    /** to show the size of the map */
    fun showMapSize() {
        println("Map size: ${map.size}")
    }

    /** to display elements in the list using a for loop by expression lambda */
    fun printByForEach(): String{
        var mapString : String = ""
        var i : Int = 1
        map.forEach { (key, value) ->
            mapString.let {
                mapString += "\nItem[$i] = [$key] [$value]"
                i++
            }
        }
        println("Map: ${map.toString()}")
        return mapString.toString()
    }

    /** to display elements in the list using an iterator */
    fun printByIterator() {
        val iterator = map.iterator()
        while (iterator.hasNext()) {
            println(iterator.next())
        }
    }

    /** to delete an item from the map */
    fun removeMapItemByKey(key: Int) {
        map.remove(key)
    }

    /** to delete an item from the map by value */
    fun removeMapItemByValue(value: String) {
        val iterator = map.iterator()
        while (iterator.hasNext()) {
            val entry = iterator.next()
            if (entry.value == value) {
                iterator.remove()
            }
        }
        println("Map after removing item with value '$value': $map")
    }

}

