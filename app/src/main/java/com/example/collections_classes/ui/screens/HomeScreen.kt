package com.example.collections_classes.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.collections_classes.classes.kotlin_classes.Difficulty
import com.example.collections_classes.classes.kotlin_classes.Question


@Composable
fun HomeScreen(navController: NavController){
    val question = Question("What is the capital of France?", "Paris", Difficulty.EASY)
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ){
        Text(text = "Question: "+question.questionText, modifier = Modifier.align(Alignment.CenterHorizontally))
        Text(text = "Answer: "+question.answer, modifier = Modifier.align(Alignment.CenterHorizontally))
        Text(text = "Difficulty: "+question.difficulty, modifier = Modifier.align(Alignment.CenterHorizontally))
    }
}