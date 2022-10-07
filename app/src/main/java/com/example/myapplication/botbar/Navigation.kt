package com.example.myapplication


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myapplication.screens.BottomNavigation
import com.example.myapplication.screens.DoubtScreen
import com.example.myapplication.screens.MyContentScreen
import com.example.myapplication.screens.StoreScreen

@Composable
fun BottomNav(navController:NavHostController)
{
    NavHost(
        navController = navController,
        startDestination = BottomNavigation.HomeTab.route
    ) {
        composable(route = BottomNavigation.HomeTab.route) {
            HomeScreen()
        }
        composable(route = BottomNavigation.DoubtTab.route) {
            DoubtScreen()
        }
        composable(route = BottomNavigation.MyContentTab.route) {
            MyContentScreen()
        }
        composable(route = BottomNavigation.StoreTab.route) {
            StoreScreen()
        }
    }
}