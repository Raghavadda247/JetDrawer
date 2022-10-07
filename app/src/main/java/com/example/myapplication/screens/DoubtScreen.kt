package com.example.myapplication.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import com.example.myapplication.AppTopHomeDoubt
import com.example.myapplication.topbar.DrawerBody
import com.example.myapplication.topbar.DrawerList
import com.example.myapplication.topbar.MyDrawer
import kotlinx.coroutines.launch

@Composable
fun DoubtScreen() {
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            AppTopHomeDoubt(onNavigationIemClicked = {
                scope.launch {
                    scaffoldState.drawerState.open()
                }
            })
        },
        drawerContent = {
            MyDrawer()
            DrawerBody(items = DrawerList, modifier = Modifier, onItemClicked = {
                println("Clicked on ${it.title}")
            })
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Text(
                text = "Doubt Screen",
                fontSize = MaterialTheme.typography.h4.fontSize,
                fontWeight = FontWeight.Bold,
                color = Color.Black

            )
        }
    }
}