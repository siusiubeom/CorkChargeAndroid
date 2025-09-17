package com.ku.corkcharge

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.ku.corkcharge.navigation.Route
import com.ku.corkcharge.ui.theme.Burgundy
import com.ku.corkcharge.ui.theme.Glass_Soft
import kotlinx.coroutines.delay

@Composable
fun StartScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController
){
    LaunchedEffect(Unit) {
        delay(1000)
        navController.navigate(Route.OnboardingStartScreen.route)
        navController.popBackStack()
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.radialGradient(
                    colors = listOf(Burgundy.copy(0.6f), Glass_Soft.copy(0.5f)),
                    center = Offset(0f, 1200f),
                    radius = 1200f
                )
            ),
        contentAlignment = Alignment.Center
    ){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier
                    .width(128.7.dp),
                painter = painterResource(R.drawable.img_all_logo),
                contentDescription = "CorkCharge Logo"
            )
            Image(
                modifier = Modifier
                    .padding(top = 23.dp)
                    .width(156.7.dp),
                painter = painterResource(R.drawable.icon_onboarding_corkcharge),
                contentDescription = "CorkCharge"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun OnboardingStartScreenPreview(){
    val navController = rememberNavController()
    StartScreen(navController = navController)
}