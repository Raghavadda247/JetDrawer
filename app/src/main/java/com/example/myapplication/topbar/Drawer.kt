package com.example.myapplication.topbar

import androidx.annotation.RestrictTo.Scope
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.createBitmap
import com.example.myapplication.R

@Composable
fun MyDrawer(modifier: Modifier = Modifier) {
    Column() {
        Row() {
            Icon(
                painter = painterResource(id = R.drawable.ic_plc_profile),
                contentDescription = "Profile Pic",
                tint =Color.Unspecified,
                modifier = Modifier
                    .padding(30.dp)
            )
            Column(modifier = Modifier.padding(top=50.dp)) {
                Text(text = "Person Name")
                Text(text = "Email Id....")
            }
            Icon(
                painter = painterResource(id = com.google.android.material.R.drawable.abc_ic_arrow_drop_right_black_24dp),
                contentDescription = "",
                modifier = Modifier.padding(top=50.dp)
            )
        }
        DrawerBody(items = DrawerList, modifier = Modifier, onItemClicked ={
            println("Clicked on ${it.title}")
        } )
        Row(modifier = Modifier
            .height(100.dp)
            .background(color = Color.Yellow, shape = RectangleShape)) {
            Icon(painter = painterResource(id = R.drawable.ic_adda_coin), contentDescription ="Coin" , tint=Color.Unspecified)
            Column(modifier = Modifier.padding(top=50.dp)) {
                Text(text = "Refer and Earn")
            }
        }

    }


}

@Composable
fun DrawerBody(
    items: List<DrawerDats>,
    modifier: Modifier,
    itemTextStyle: TextStyle = TextStyle(fontSize = 18.sp),
    onItemClicked: (DrawerDats)->Unit
){

    LazyColumn(modifier){
        items(items){
            item->
            Row(modifier = Modifier
                .fillMaxWidth()
                .clickable {
                    onItemClicked(item)
                }
                .padding(16.dp)
            ){
                Icon(painter = painterResource(id = item.icon), contentDescription = "", tint = Color.Black,
                modifier = Modifier
                    .height(30.dp)
                    .width(30.dp))
                Spacer(modifier = Modifier.padding(start = 20.dp))
                Text(text = item.title)
            }

        }
    }



}

@Composable
@Preview
fun PreviewDrewer() {
    MyDrawer()
}