package com.example.healthwithfitness.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.healthwithfitness.R

@Composable
fun  SplashScreenUi() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF0A84FF)), // Brand color
        contentAlignment = Alignment.Center
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

// App Logo
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "App Logo",
                modifier = Modifier.size(120.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

// App Name
            Text(
                text = "My App",
                color = Color.White,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
        }

// Bottom Text (Version / Tagline)
        Text(
            text = "Powered by Compose",
            color = Color.White,
            fontSize = 12.sp,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 24.dp)
        )
    }
}