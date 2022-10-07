package com.example.myapplication

import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.screens.BottomNavigation
import com.example.myapplication.topbar.MyDrawer
import kotlinx.coroutines.selects.select

@Composable
fun MainScreen(){
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomBar(navController = navController)}
    ) {
        BottomNav(navController=navController)

    }
}

@Composable
fun BottomBar(navController: NavHostController){
    val screens= listOf(
        BottomNavigation.HomeTab,
        BottomNavigation.DoubtTab,
        BottomNavigation.MyContentTab,
        BottomNavigation.StoreTab,
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currenntDestination = navBackStackEntry?.destination
    BottomNavigation(modifier = Modifier
        .background(color = Color.White)) {
        screens.forEach { screen->
            AddItem(screen = screen, currentDestination = currenntDestination, navController = navController)
        }
    }
}

@Composable
fun RowScope.AddItem(
    screen: BottomNavigation,
    currentDestination: NavDestination?,
    navController: NavHostController
) {
    val select:Boolean
    BottomNavigationItem(
        selectedContentColor = Color.Black,
        unselectedContentColor = Color.Gray,
        label = { Text(text = screen.name, style = TextStyle(
            fontSize = 10.sp,
            fontWeight = FontWeight.Bold
        ))},
        selected = currentDestination?.hierarchy?.any {
                  it.route==screen.route
        }==true,

        modifier = Modifier.background(color = Color.White)
            .fillMaxWidth(),
        icon={ Icon(painter = painterResource(id = screen.icon),
            modifier = Modifier.height(25.dp),
            contentDescription ="Navigation Item")
             },
        onClick = {
            navController.navigate(screen.route)
        },

    )
}

@Composable
@Preview
fun BotBarPre(){
    MainScreen()
}