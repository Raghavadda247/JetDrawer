package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun AppTopHomeDoubt(onNavigationIemClicked:()->Unit) {
    TopAppBar(
        title = { category() },
        navigationIcon = {
            IconButton(onClick = onNavigationIemClicked) {
                Icon(
                    painter = painterResource(id = R.drawable.menu),
                    contentDescription = "menu"
                )
            }
        },
        backgroundColor = Color.White,
        actions = {
            IconButton(onClick = { /*TODO*/}) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_translate),
                    contentDescription = null,
                    tint = Color.Unspecified
                )
            }
            IconButton(onClick = { /*TODO*/}) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_notification),
                    contentDescription = null,
                    tint = Color.Unspecified
                )
            }
        }

    )
}

@Composable
fun AppTopContentStore(onNavigationIemClicked:()->Unit) {
    TopAppBar(
        title = { category() },
        navigationIcon = {
            IconButton(onClick = onNavigationIemClicked) {
                Icon(
                    painter = painterResource(id = R.drawable.menu),
                    contentDescription = "menu"
                )
            }
        },
        backgroundColor = Color.White,
        actions = {
            IconButton(onClick = { /*TODO*/}) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_action_search_default),
                    contentDescription = null,
                    tint = Color.Unspecified
                )
            }
            IconButton(onClick = { /*TODO*/}) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_translate),
                    contentDescription = null,
                    tint = Color.Unspecified
                )
            }
            IconButton(onClick = { /*TODO*/}) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_notification),
                    contentDescription = null,
                    tint = Color.Unspecified
                )
            }
        },


    )
}


@Composable
fun category() {
    IconButton(onClick = { /*TODO*/ }) {
        Column {
            Image(
                painter = painterResource(id = R.drawable.adda_store_icon),
                contentDescription = "null",
            )

            Row() {
                Text(
                    text = "Banking",
                    style = TextStyle(
                        fontSize = 15.sp
                    )
                )
                Icon(
                    painter = painterResource(id = R.drawable.ic_drop_down),
                    contentDescription = "drop down",
                    modifier = Modifier.height(20.dp),
                )
            }
        }
    }
}


