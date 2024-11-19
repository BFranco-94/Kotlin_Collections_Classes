package com.example.collections_classes.ui.navigator

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.collections_classes.ui.routes.Routes
import com.example.collections_classes.ui.screens.ArraysScreen
import com.example.collections_classes.ui.screens.ClassesScreen
import com.example.collections_classes.ui.screens.ListScreen
import com.example.collections_classes.ui.screens.MapScreen
import com.example.collections_classes.ui.screens.SetScreen


@Composable
fun Navigator(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "mapsScreen", builder = {
        composable(Routes.CLASSES_SCREEN) {
            ClassesScreen(navController)
        }
        composable(Routes.ARRAYS_SCREEN) {
            ArraysScreen(navController)
        }
        composable(Routes.LIST_SCREEN) {
            ListScreen(navController)
        }
        composable(Routes.SETS_SCREEN) {
            SetScreen(navController)
        }
        composable(Routes.MAPS_SCREEN) {
            MapScreen(navController)
        }

    })
}