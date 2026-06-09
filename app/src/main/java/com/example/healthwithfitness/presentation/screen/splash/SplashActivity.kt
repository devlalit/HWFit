package com.example.healthwithfitness.presentation.screen.splash

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.healthwithfitness.Greeting
import com.example.healthwithfitness.presentation.component.SplashScreenUi
import com.example.healthwithfitness.ui.theme.HealthWithFitnessTheme

class SplashActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent{
            HealthWithFitnessTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SplashScreenUi()
                }
            }
        }
    }
}
