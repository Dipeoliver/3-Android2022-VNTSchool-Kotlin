package com.example.compose_aula12

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose_aula12.ui.theme.Compose_Aula12Theme

enum class Type {
    IMAGE, TEXT, BUTTON, ROW, COLUMN, NONE
}

fun MyView(
    type: Type = Type.TEXT,
    customize: String = "",
    scope: () -> Unit = {}
) {
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@Composable
fun MessageCard(name: String) {
    Text(text = "Hello $name!")
}



