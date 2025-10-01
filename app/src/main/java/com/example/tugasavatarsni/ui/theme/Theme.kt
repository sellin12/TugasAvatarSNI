package com.example.tugasavatarsni.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable


private val DarkColorScheme = darkColorScheme(
	primary = PinkPrimary,
	secondary = PinkLight,
	tertiary = PinkLight
)

private val LightColorScheme = lightColorScheme(
	primary = PinkPrimary,
	secondary = PinkLight,
	tertiary = PinkLight,
	background = BackgroundLight,
	surface = BackgroundLight,
	onPrimary = White,
	onBackground = Black,
	onSurface = Black,

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun TugasAvatarSNITheme(
	darkTheme: Boolean = isSystemInDarkTheme(),
	content: @Composable () -> Unit
) {
	val colorScheme = when {
		darkTheme -> DarkColorScheme
		else -> LightColorScheme
	}

	MaterialTheme(
		colorScheme = colorScheme,
		typography = Typography,
		content = content
	)
}
