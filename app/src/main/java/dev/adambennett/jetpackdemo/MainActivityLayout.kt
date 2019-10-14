package dev.adambennett.jetpackdemo

import androidx.compose.Composable
import androidx.compose.state
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.layout.Column
import androidx.ui.layout.CrossAxisAlignment
import androidx.ui.layout.MainAxisAlignment
import androidx.ui.layout.absolutePadding
import androidx.ui.layout.padding
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme

@Composable
fun mainLayout() {
    val (text, setText) = +state { "Hello, World!" }
    MaterialTheme {
        Column(
            modifier = padding(8.dp),
            mainAxisAlignment = MainAxisAlignment.Center,
            crossAxisAlignment = CrossAxisAlignment.Center
        ) {
            Text(text = text, modifier = absolutePadding(bottom = 8.dp))
            Button(text = "Click me", onClick = { setText("Button Clicked!") })
        }
    }
}
