package com.csj.meditationui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import com.csj.meditationui.ui.SleepScreen
import com.csj.meditationui.ui.theme.MeditationUITheme

class MainActivity : ComponentActivity() {
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeditationUITheme {
                //HomeScreen()
                SleepScreen()
            }
        }
    }
}
