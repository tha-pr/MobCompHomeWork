package com.tejat.mobcomphomework

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.tejat.mobcomphomework.ui.HomeWorkApp
import com.tejat.mobcomphomework.ui.theme.MobCompHomeWorkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MobCompHomeWorkTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    // Text(text = "Hello $name!")
    HomeWorkApp()
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MobCompHomeWorkTheme {
        Greeting("Android")
    }
}