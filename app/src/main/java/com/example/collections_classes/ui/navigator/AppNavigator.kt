package com.example.collections_classes.ui.navigator

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.collections_classes.ui.routes.Routes
import com.example.collections_classes.ui.screens.HomeScreen


@Composable
fun Navigator(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "homeScreen", builder = {
        composable(Routes.HOME) {
            HomeScreen(navController)
        }
    })
}