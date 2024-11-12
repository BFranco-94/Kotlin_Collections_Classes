package com.example.collections_classes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.collections_classes.ui.navigator.Navigator
import com.example.collections_classes.ui.theme.CollectionsClassesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CollectionsClassesTheme {
                Navigator()
            }
        }
    }
}
