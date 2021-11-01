package com.example.esperanto_gruppeh1.navigationbar

sealed class NavigationItem(var route: String, var icon: Int, var title: String){
    object Home: NavigationItem("home", , "Home")
    object Channels: NavigationItem("channels", , "Channels")
    object Favorites: NavigationItem("favorites", ,"Favorites")
    object Search: NavigationItem("search", ,"Search")
}
