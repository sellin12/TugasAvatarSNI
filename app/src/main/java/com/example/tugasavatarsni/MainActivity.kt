package com.example.tugasavatarsni

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tugasavatarsni.ui.screens.AvatarScreen
import com.example.tugasavatarsni.ui.theme.TugasAvatarSNITheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			TugasAvatarSNITheme {
				AvatarAppStyled()
			}
		}
	}
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AvatarAppStyled() {
	Scaffold(
		topBar = {
			TopAppBar(
				title = { Text("AvatarApp", color = MaterialTheme.colorScheme.onPrimary) },
				colors = TopAppBarDefaults.topAppBarColors(
					containerColor = MaterialTheme.colorScheme.primary
				)
			)
		},

		containerColor = MaterialTheme.colorScheme.background
	) { innerPadding ->
		AvatarScreen(
			modifier = Modifier
				.padding(innerPadding)
				.fillMaxSize()
				.background(MaterialTheme.colorScheme.background)
		)
	}
}

@Preview(showBackground = true)
@Composable
fun AvatarAppPreview() {
	TugasAvatarSNITheme {
		AvatarAppStyled()
	}
}
