package com.example.collections_classes.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
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
import com.example.collections_classes.classes.kotlin_classes.MapClass


@Composable
fun MapScreen(navController: NavController){
    // Implement the logic for the List screen

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

        val stringToAppend : String = "Sunday"
        MapClass().mapItemCreator()
        if (!MapClass().mapContains(stringToAppend)) {
            MapClass().addMapItems(stringToAppend)
            Text(text = "Map\n${MapClass().printByForEach().apply {  }}", modifier = Modifier.align(Alignment.CenterHorizontally))
        }else{
            Text(text = "Map already contains: '$stringToAppend'", modifier = Modifier.align(Alignment.CenterHorizontally))
        }

        Spacer(modifier = Modifier.padding(10.dp))
        MapClass().removeMapItemByValue(stringToAppend)
        Text(text = "New Map\n${MapClass().printByForEach().apply {  }}", modifier = Modifier.align(Alignment.CenterHorizontally))

    }

}