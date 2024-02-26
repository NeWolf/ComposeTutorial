package com.newolf.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.newolf.composetutorial.ui.theme.ComposeTutorialTheme
import com.newolf.composetutorial.utils.Navigator

class SunflowerActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_sunflower).apply {
            findViewById<ComposeView>(R.id.compose_view).setContent {
                ComposeTutorialTheme {
                    ContentView()
                }
            }
        }


    }


    @Composable
    fun ContentView() {
        val context = LocalContext.current
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "xml的layout和compose混合开发要点：" +
                        "\n1.继承ComponentActivity" +
                        "\n2.xml中包含androidx.compose.ui.platform.ComposeView" +
                        "\n3.通过ComposeView的setContent调用Compose"
            )

            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = { Navigator.startSunflowerMainActivity(context) },
                colors = ButtonColors(
                    containerColor = Color.Magenta,
                    contentColor = Color.Cyan,
                    disabledContainerColor = Color.Gray,
                    disabledContentColor = Color.DarkGray
                ), enabled = true
            ) {
                Text(text = "SunflowerMainActivity")
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun ContentViewPreView() {
        ContentView()
    }

}