package com.example.esperanto_gruppeh1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.esperanto_gruppeh1.ui.theme.Esperanto_GruppeH1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Esperanto_GruppeH1Theme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
            TopBarPreview()
        }
    }
}
@Composable
fun Topbar(){
    TopAppBar(
        title = { Text( text= stringResource(R.string.app_name), fontSize = 24.sp ) },
        backgroundColor = colorResource(id = R.color.red_200),
        contentColor = Color.White
    )
}
@Composable
fun TopBarPreview(){
    Topbar()
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Esperanto_GruppeH1Theme {
        Greeting("Android")
    }
}