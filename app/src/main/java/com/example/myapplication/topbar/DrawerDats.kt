package com.example.myapplication.topbar

import com.example.myapplication.R

data class DrawerDats(
    val id:String,
    val title:String,
    val icon: Int
)
val DrawerList= listOf<DrawerDats>(
    DrawerDats("current","Current Affairs",  R.drawable.ic_nav_currentaffairs_drawer),
    DrawerDats("quiz","Daily Quizes",  R.drawable.ic_nav_quiz),
    DrawerDats("job","Job Alerts",  R.drawable.nav_job_alerts),
    DrawerDats("capsules","Power Capsules",  R.drawable.ic_nav_capsules),
    DrawerDats("notes","Notes and Articles",  R.drawable.ic_nav_articles),
    DrawerDats("video","Videos",  R.drawable.ic_nav_videos_drawer),
    DrawerDats("store","Buy Study Material",  R.drawable.ic_nav_bottom_default_store),
    DrawerDats("content","My Content",  R.drawable.ic_nav_bottom_default_content),
    DrawerDats("help","Help & Support",  R.drawable.ic_help),
    DrawerDats("settings","Settings",  R.drawable.ic_settings)
)
