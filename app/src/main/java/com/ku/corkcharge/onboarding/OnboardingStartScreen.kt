package com.ku.corkcharge.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.ku.corkcharge.R

@Composable
fun OnboardingStartScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    Box(
        modifier = Modifier
            .requiredSize(677.dp, 1015.dp)
            .clipToBounds()
    ){
        Image(
            modifier = Modifier
                .matchParentSize(),
            painter = painterResource(R.drawable.img_onboarding_whatiscorkage),
            contentDescription = "CorckCharge background image with glasses of wine"
        )
    }
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

    }
}

@Preview(showBackground = true)
@Composable
fun OnboardingStartScreenPreview(){
    val navController = rememberNavController()
    OnboardingStartScreen(navController = navController)
}