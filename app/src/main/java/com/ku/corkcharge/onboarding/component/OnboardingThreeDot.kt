package com.ku.corkcharge.onboarding.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ku.corkcharge.ui.theme.Burgundy
import com.ku.corkcharge.ui.theme.Burgundy_Light
import com.ku.corkcharge.ui.theme.Gray_5
import com.ku.corkcharge.ui.theme.White

@Composable
fun OnboardingThreeDot(modifier: Modifier = Modifier, type: Int) {
    val color1 = if (type==1) Burgundy_Light else if(type==2) Gray_5 else Gray_5
    val color2 = if (type==1) White else if(type==2) Burgundy_Light else Gray_5
    val color3 = if (type==1) White else if(type==2) Gray_5 else Burgundy_Light

    Row(
        modifier = Modifier
            .size(34.dp, 6.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Box(
            modifier = Modifier
                .size(6.dp)
                .clip(RoundedCornerShape(3.dp))
                .background(color1)
        )
        Box(
            modifier = Modifier
                .size(6.dp)
                .clip(RoundedCornerShape(3.dp))
                .background(color2)
        )
        Box(
            modifier = Modifier
                .size(6.dp)
                .clip(RoundedCornerShape(3.dp))
                .background(color3)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun OnboardingThreeDotPreview(){
    OnboardingThreeDot(type = 1)
}