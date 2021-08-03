package com.healthyryu.testlottie

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition

@Preview
@Composable
fun TextT() {
	Text("가나다")
}

@Preview
@Composable
fun Loader() {
		val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.confetti))
		val progress by animateLottieCompositionAsState(composition)
		LottieAnimation(
				composition,
				progress,
		)
}