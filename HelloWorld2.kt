package com.example.hello_world2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextCard("Hello World from composable function")
        }
    }
}

@Composable
fun TextCard(to_display: String){
    Text(to_display)
}
