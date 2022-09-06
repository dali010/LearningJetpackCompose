package com.example.jetpackcompose.MetitationUi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.jetpackcompose.ui.theme.MeditationUIYouTubeTheme

class Meditation : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeditationUIYouTubeTheme {
                HomeScreen()
            }
        }
    }
}