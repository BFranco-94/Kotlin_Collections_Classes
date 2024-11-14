package com.example.collections_classes.classes.kotlin_classes

import com.example.collections_classes.classes.kotlin_interfaces.ProgressBarConnection


class DbConnection : ProgressBarConnection {


    /**
     * Gets the text that shows the progress of the database connection.
     * The text includes the current value of the connection in the progress bar.
     *
     * @return A String that represents the progress of the connection in human-readable form.
     */
    override val progressTextConnection: String
        get() = "Progress bar connection: $progressConnection"


    /**
     * Displays the progress of the database connection to the console.
     * Updates the `dbProgress` variable with a visual representation of the progress,
     * using filled blocks ("▓") and empty spaces ("░") to indicate the percentage of connection.
     */
    override fun showProgressBarConnection() {
        dbProgress = buildProgressBar(progressConnection, 10)
        println(dbProgress)
        println("Progress bar connection: $progressConnection")
    }

    /**
     * Constructs and returns a visual progress bar based on the filled progress value and the total.
     *
     * @param filled The number of filled blocks in the progress bar.
     * @param total The total number of blocks in the progress bar.
     * @return A String representing the progress bar using filled ("▓") and empty ("░") block characters.
     */
    private fun buildProgressBar(filled: Int, total: Int): String {
        return "▓".repeat(filled) + "░".repeat(total - filled)
    }


    /**
     * Establishes a connection to the database and data connection
     *
     * @return The connection status after establishing the connection.
     */
    companion object Connection {
        var driver: String = "mysql"
        var host: String = "localhost"
        var port = 3306
        var username: String = "root"
        var password: String = "password"
        var database: String = "kotlin"
        var progressConnection: Int = 8
        var dbProgress: String = ""
        var isConnected: DataBaseDataConnection = DataBaseDataConnection.DISCONNECTED
    }


    /**
     * Establishes a connection to the database.
     * This method simulates the process of connecting to the database.
     *
     * @return The connection status as a DataBaseDataConnection enum, indicating the current connection state.
     */
    fun connect(): DataBaseDataConnection {
        println("Connecting to database...")
        isConnected = DataBaseDataConnection.CONNECTED
        return isConnected
    }

    /**
     * Disconnects from the database.
     * This method simulates the process of disconnecting from the database.
     *
     * @return The connection status as a DataBaseDataConnection enum, indicating the current connection state.
     */
    fun disconnect(): DataBaseDataConnection {
        println("Disconnecting from database...")
        isConnected = DataBaseDataConnection.DISCONNECTED
        return isConnected
    }
}


