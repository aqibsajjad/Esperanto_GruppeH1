package com.example.esperanto_gruppeh1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
// import androidx.navigation.compose.rememberNavController
import com.example.esperanto_gruppeh1.navigationbar.NavigationItem
import com.example.esperanto_gruppeh1.ui.theme.Esperanto_GruppeH1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Esperanto_GruppeH1Theme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Ib")
                }
            }
            MainScreen()
        }
    }
}
@Composable
fun Topbar(){
    TopAppBar(
        title = { Text(text ="Esperanto", fontSize = 24.sp, textAlign = TextAlign.Center) },
        backgroundColor = colorResource(id = R.color.red_200),
        contentColor = colorResource(id = R.color.white),
    )
}
@Composable
fun TopBarPreview(){
    Topbar()
}
@Composable
fun BottomNavigationBar(){
    val items = listOf(
        NavigationItem.Home,
        NavigationItem.Channels,
        NavigationItem.Favorites,
        NavigationItem.Search
    )
    BottomNavigation(
        backgroundColor = colorResource(id = R.color.red_200),
         contentColor= Color.White
    ){
        items.forEach { item ->
            BottomNavigationItem(
                icon = { Icon(painterResource(id = item.icon), contentDescription = item.title) },
                label = { Text(text = item.title)},
                selectedContentColor = colorResource(id= R.color.white),
                //unselectedContentColor = colorResource(id = R.color.white),
                alwaysShowLabel = true,
                selected = false,
                onClick = {
                }
            )
        }
    }
}
@Composable
fun BottomNavigationBarPreview(){
    BottomNavigationBar()
}

@Composable
fun MainScreen(){
    Scaffold (
        topBar = { Topbar()},
        bottomBar = { BottomNavigationBar()}
    ){
            }
}
@Preview(showBackground = true)
@Composable
fun MainScreenPreview(){
    MainScreen()
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Esperanto_GruppeH1Theme {
        Greeting("Ib")
    }
}