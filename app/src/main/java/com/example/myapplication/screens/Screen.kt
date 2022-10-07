package com.example.myapplication.screens

import com.example.myapplication.R

sealed class BottomNavigation(val route: String,val name: String,val icon: Int){
    object HomeTab: BottomNavigation("homeTab","Home",R.drawable.ic_nav_bottom_default_home)
    object DoubtTab: BottomNavigation("doubtTab","Doubt",R.drawable.ic_nav_bottom_default_doubt)
    object MyContentTab: BottomNavigation("myContentTab","My Content",R.drawable.ic_nav_bottom_default_content)
    object StoreTab: BottomNavigation("storeTab","Store", R.drawable.ic_nav_bottom_default_store)
}
