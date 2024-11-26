package com.example.mad_pr5_22012011050

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mad_pr5_22012011050.screen.Login
import com.example.mad_pr5_22012011050.screen.RegisterPage


@Composable
fun AppNavigation()
{
    val navController = rememberNavController()

    NavHost(
        navController=navController,
        startDestination = "login")
    {
        composable("login"){
            Login(onSignUpClick = {
                navController.navigate("register")
            })
        }
        composable("register"){
           RegisterPage(onLoginClick = {
                navController.navigate("login")
            })
        }
    }
}
