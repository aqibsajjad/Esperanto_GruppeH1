package com.example.esperanto_gruppeh1.navigationbar

import com.example.esperanto_gruppeh1.R

sealed class NavigationItem(var route: String, var icon: Int, var title: String){
    object Home: NavigationItem("home", R.drawable.ic_home_img, "Home")
    object Channels: NavigationItem("channels", R.drawable.ic_channels_img, "Channels")
    object Favorites: NavigationItem("favorites",R.drawable.ic_favorites_img ,"Favorites")
    object Search: NavigationItem("search", R.drawable.ic_search_img,"Search")
}
