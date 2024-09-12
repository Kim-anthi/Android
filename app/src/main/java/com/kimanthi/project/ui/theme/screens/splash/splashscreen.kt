package com.kimanthi.project.ui.theme.screens.splash


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.kimanthi.project.R
import com.kimanthi.project.navigation.ROUTE_HOME

import com.kimanthi.project.navigation.ROUTE_HOME
import com.kimanthi.project.navigation.ROUTE_REGISTER
import kotlinx.coroutines.delay

@Composable
fun splashscreen(navController: NavHostController) {
    //delay to simulate splash screen duration
    LaunchedEffect(Unit) {
        delay(2000) //2 seconds delay
        navController.navigate(ROUTE_REGISTER)

    }
    Box(modifier = Modifier
        .fillMaxSize()
        .background(
            Brush.linearGradient(
                colors = listOf(
                    Color(0xFFFFA726), // Orange
                    Color(0xFF8E24AA)  // Deep Purple
                )
            )
        ),

            contentAlignment = Alignment.Center){
        Image(painter = painterResource(id = R.drawable.img),
            contentDescription = "Splash Logo",
            modifier = Modifier.size(200.dp))
    }

}