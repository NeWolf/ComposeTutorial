package com.newolf.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.newolf.composetutorial.ui.theme.ComposeTutorialTheme
import com.newolf.composetutorial.utils.Navigator

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainContent()
                }
            }
        }
    }
}

@Composable
fun MainContent() {
    Column {
        Greeting("Android")
        JumpMessage()
        JumpBasicLayout()
        JumpSunFlower()
    }
}

@Preview(showBackground = true)
@Composable
fun MainContentPreView() {
    MainContent()
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeTutorialTheme {
        Greeting("Android")
    }


}


@Composable
fun JumpMessage(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    Button(onClick = { Navigator.startMessageActivity(context) }, modifier = modifier) {
        Text(
            text = "Jump Message",
        )

    }
}

@Preview(showBackground = true)
@Composable
fun JumpMessagePreview() {
    ComposeTutorialTheme {
        JumpMessage()
    }

}

@Composable
fun JumpBasicLayout(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    Button(onClick = { Navigator.startBasicLayoutActivity(context) }, modifier = modifier) {
        Text(
            text = "Jump BasicLayout",
        )

    }
}

@Preview(showBackground = true)
@Composable
fun JumpBasicLayoutPreview() {
    ComposeTutorialTheme {
        JumpBasicLayout()
    }


}


@Composable
fun JumpSunFlower(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    Button(onClick = { Navigator.startSunflowerActivity(context) }, modifier = modifier) {
        Text(
            text = "Jump Sunflower",
        )

    }
}

@Preview(showBackground = true)
@Composable
fun JumpSunFlowerPreview() {
    ComposeTutorialTheme {
        JumpSunFlower()
    }


}

