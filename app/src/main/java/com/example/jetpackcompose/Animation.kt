package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateColor
import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class Animation : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var sizeState by remember {
                mutableStateOf(200.dp)
            }

            val size by animateDpAsState(
                targetValue = sizeState,
                tween(
                    durationMillis = 2000
                )

//                spring(
//                    Spring.DampingRatioMediumBouncy
//                )
//                tween(
//                    durationMillis = 5000,
//                    delayMillis = 300 ,
//                    easing = LinearOutSlowInEasing
//                )
            )

            val color by rememberInfiniteTransition().animateColor(
                initialValue = Color.Red,
                targetValue = Color.Green,
                animationSpec = infiniteRepeatable(
                    tween(durationMillis = 2000),
                    repeatMode = RepeatMode.Reverse
                )
            )

            Box(modifier = Modifier
                .size(size)
                .background(color),
                contentAlignment = Alignment.Center){
                Button(onClick = {
                    sizeState += 50.dp
                }) {
                    Text(text = "Increase Size")

                }
            }
        }
    }
}

