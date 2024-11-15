package com.example.collections_classes.ui.navigator

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.collections_classes.ui.routes.Routes
import com.example.collections_classes.ui.screens.ArraysScreen
import com.example.collections_classes.ui.screens.ClassesScreen


@Composable
fun Navigator(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "arraysScreen", builder = {
        composable(Routes.CLASSES_SCREEN) {
            ClassesScreen(navController)
        }
        composable(Routes.ARRAYS_SCREEN) {
            ArraysScreen(navController)
        }
    })
}