package com.newolf.composetutorial.sunflower

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.newolf.composetutorial.ui.theme.ComposeTutorialTheme

class SunflowerMainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialTheme {
                SunflowerMainView()
            }
        }
    }

    @Composable
    fun SunflowerMainView() {

    }

    @Preview
    @Composable
    fun SunflowerMainViewPreview() {
        SunflowerMainView()
    }
}