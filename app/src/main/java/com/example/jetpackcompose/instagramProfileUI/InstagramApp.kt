package com.example.jetpackcompose.instagramProfileUI

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class InstagramApp : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfileScreen()
        }
    }
}

