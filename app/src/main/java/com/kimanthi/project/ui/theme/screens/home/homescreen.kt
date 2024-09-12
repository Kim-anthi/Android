package com.kimanthi.project.ui.theme.screens.home


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.kimanthi.project.navigation.ROUTE_ADD_PRODUCT
import com.kimanthi.project.navigation.ROUTE_VIEW_PRODUCT
import com.kimanthi.project.navigation.ROUTE_VIEW_UPLOAD



@Composable
fun homescreen(navController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(
            Brush.linearGradient(
                colors = listOf(
                    Color(0xFF89CFF0), // Light Blue
                    Color(0xFFB19CD9)  // Soft Purple
                )
            )
        ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center)
    {
        var context= LocalContext.current
//        var productdata=productviewmodel(navController,context)

        Text(text = "Welcome to Home page",
            color = Color.Black,
            fontFamily = FontFamily.SansSerif,
            fontSize = 30.sp)
        Spacer(modifier = Modifier.height(100.dp))

        Button(onClick = {
            navController.navigate(ROUTE_ADD_PRODUCT)

        },modifier = Modifier.width(230.dp),
            colors = ButtonDefaults.buttonColors(
                Color.Black
            )) {
            Text(text = "Add Product",
                color = Color.White)
        }
        Spacer(modifier = Modifier.height(100.dp))

        Button(onClick = {
            navController.navigate(ROUTE_VIEW_PRODUCT)

        },modifier = Modifier.width(230.dp),
            colors = ButtonDefaults.buttonColors(
                Color.Black
            )) {
            Text(text = "View Product",
                color = Color.White)
        }
        Spacer(modifier = Modifier.height(100.dp))

        Button(onClick = {
            navController.navigate(ROUTE_VIEW_UPLOAD)

        },modifier = Modifier.width(230.dp),
            colors = ButtonDefaults.buttonColors(
                Color.Black
            )) {
            Text(text = "View Uploads",
                color = Color.White)
        }


    }



}

@Preview
@Composable
fun homepreview() {
    homescreen(rememberNavController())
}