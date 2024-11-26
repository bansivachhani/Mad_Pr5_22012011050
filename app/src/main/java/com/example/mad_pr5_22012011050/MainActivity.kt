package com.example.mad_pr5_22012011050

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.mad_pr5_22012011050.screen.Login
import com.example.mad_pr5_22012011050.screen.RegisterPage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppNavigation()
        }
    }
}