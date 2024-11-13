package com.example.collections_classes.classes.kotlin_classes

enum class DataBaseDataConnection(val value: Boolean) {
    CONNECTED(true),
    DISCONNECTED(false),
    STARTING(true),
    STOPPING(false),
    ERROR(false),
    UNKNOWN(false),
    DB_NOT_FOUND(false),
    DB_CONNECTION_FAILED(false)
}