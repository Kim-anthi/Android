package com.kimanthi.project.navigation

//import com.kimanthi.project.ui.theme.screens.products.AddProductsScreen
//import com.kimanthi.project.ui.theme.screens.products.UpdateProductsScreen
//import com.kimanthi.project.ui.theme.screens.products.ViewProductsScreen
//import com.kimanthi.project.ui.theme.screens.products.ViewUploadsScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kimanthi.project.ui.theme.screens.home.homescreen
import com.kimanthi.project.ui.theme.screens.login.loginscreen

import com.kimanthi.project.ui.theme.screens.products.AddProductsScreen
import com.kimanthi.project.ui.theme.screens.products.UpdateProductsScreen
import com.kimanthi.project.ui.theme.screens.products.ViewProductsScreen
import com.kimanthi.project.ui.theme.screens.products.ViewUploadsScreen
import com.kimanthi.project.ui.theme.screens.register.registerscreen
import com.kimanthi.project.ui.theme.screens.splash.splashscreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier, navController: NavHostController= rememberNavController(), startDestination: String= ROUTE_SPLASH) {
    NavHost(
        navController = navController,
        modifier = modifier,
        startDestination = startDestination
    ) {
        composable(ROUTE_SPLASH) {
            splashscreen(navController)
        }
        composable(ROUTE_HOME) {
            homescreen(navController)
        }
//        composable(ROUTE_MAINSCREEN) {
//            mainscreen(navController)
//        }
        composable(ROUTE_LOGIN) {
            loginscreen(navController)
        }
        composable(ROUTE_REGISTER) {
            registerscreen(navController)
        }
        composable(ROUTE_ADD_PRODUCT) {
            AddProductsScreen(navController)
        }
        composable(ROUTE_VIEW_PRODUCT){
            ViewProductsScreen(navController)
        }
        composable(ROUTE_UPDATE_PRODUCT+ "/{id}"){passedData ->
            UpdateProductsScreen(navController,passedData.arguments?.getString("id")!!)
        }
        composable(ROUTE_VIEW_UPLOAD){
            ViewUploadsScreen(navController)
        }

    }
}