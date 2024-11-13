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
import com.example.collections_classes.classes.kotlin_classes.DbConnection
import com.example.collections_classes.classes.kotlin_classes.Difficulty
import com.example.collections_classes.classes.kotlin_classes.Question


@Composable
fun HomeScreen(navController: NavController){
    val question = Question("What is the capital of France?", "Paris", Difficulty.EASY)
    val connection = DbConnection()
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ){
        Image(
            painter = painterResource(id = R.drawable.android),
            contentDescription = "Logo",
            modifier = Modifier.size(150.dp).align(Alignment.CenterHorizontally)
                       .fillMaxSize(0.5f).padding(30.dp)
        )

        Text(text = "Question: "+question.questionText, modifier = Modifier.align(Alignment.CenterHorizontally))
        Text(text = "Answer: "+question.answer, modifier = Modifier.align(Alignment.CenterHorizontally))
        Text(text = "Difficulty: "+question.difficulty, modifier = Modifier.align(Alignment.CenterHorizontally))

        // data class it will implement the toString method automatically for us to print the values of the object
        println(question.toString())

        // Connection status by default from database
        Text("Default -> Connection Status: ${DbConnection.isConnected.value}", modifier = Modifier.align(Alignment.CenterHorizontally))

        // Connection to the database
        connection.connect()
        Text(
            text = "Connecting -> Connection Status: ${DbConnection.isConnected.value}",
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        // Disconnection from the database
        connection.disconnect()
        Text(
            text = "Disconnecting -> Connection Status: ${DbConnection.isConnected.value}",
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Image(
            painter = painterResource(id = R.drawable.connection),
            contentDescription = "Logo",
            modifier = Modifier.size(100.dp).align(Alignment.CenterHorizontally)
                .fillMaxSize(0.5f).padding(16.dp)
        )

    }
}