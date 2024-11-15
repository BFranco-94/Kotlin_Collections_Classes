package com.example.collections_classes.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.collections_classes.R
import com.example.collections_classes.classes.kotlin_classes.ArrayClass

@Composable
fun ArraysScreen(navController: NavController) {
    // Implement the logic for the Arrays screen
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.android),
            contentDescription = "Logo",
            modifier = Modifier.size(150.dp).align(Alignment.CenterHorizontally)
                .fillMaxSize(0.5f).padding(30.dp)
        )

        Text(text = "Weekly Array: \n${ ArrayClass().printArrayImplementation()}", modifier = Modifier.align(Alignment.CenterHorizontally))


    }


}

fun arrayScreenImplementation() : Array<String> {
    val array = arrayOf(
        "Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday",
    )
    return array
}