package com.example.collections_classes.classes.kotlin_classes



class DbConnection{


    /**
     * Establishes a connection to the database and data connection
     *
     * @return The connection status after establishing the connection.
     */
    companion object Connection{
        var driver : String = "mysql"
        var host : String = "localhost"
        var port = 3306
        var username : String ="root"
        var password : String ="password"
        var database : String ="kotlin"
        var isConnected: DataBaseDataConnection = DataBaseDataConnection.DISCONNECTED

    }

    /**
     * Establishes a connection to the database.
     * This method simulates the process of connecting to the database.
     *
     * @return The connection status as a `DataBaseDataConnection` enum, indicating the current connection state.
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
     * @return The connection status as a `DataBaseDataConnection` enum, indicating the current connection state.
     */
    fun disconnect(): DataBaseDataConnection {
        println("Disconnecting from database...")
        isConnected = DataBaseDataConnection.DISCONNECTED
        return isConnected
    }

}

