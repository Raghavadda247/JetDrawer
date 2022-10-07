package com.example.myapplication.topbar

import com.example.myapplication.R

sealed class MenuAction(val label:String,val icon:Int){
    object lang: MenuAction("language", R.drawable.ic_translate)
    object search: MenuAction("search", R.drawable.ic_action_search_default)
    object notification: MenuAction("notification", R.drawable.ic_notification)
}
