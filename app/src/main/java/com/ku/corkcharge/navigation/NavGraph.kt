package com.ku.corkcharge.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.ku.corkcharge.StartScreen
import com.ku.corkcharge.onboarding.OnboardingStartScreen

@Composable
fun NavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier
){
    NavHost(
        navController = navController,
        startDestination = Route.StartScreen.route
    ){
        composable(Route.StartScreen.route) {
            StartScreen(
                navController = navController
            )
        }

        composable(Route.OnboardingStartScreen.route) {
            OnboardingStartScreen(
                navController = navController
            )
        }

    }
}