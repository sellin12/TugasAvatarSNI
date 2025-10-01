package com.example.tugasavatarsni.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tugasavatarsni.R

@Composable
fun AvatarScreen(modifier: Modifier = Modifier) {
	var isBrowEnabled by remember { mutableStateOf(true) }
	var isEyeEnabled by remember { mutableStateOf(true) }
	var isNoseEnabled by remember { mutableStateOf(true) }
	var isMouthEnabled by remember { mutableStateOf(true) }

	Column(
		modifier = modifier
			.fillMaxSize()
			.padding(horizontal = 24.dp),
		horizontalAlignment = Alignment.CenterHorizontally,
		verticalArrangement = Arrangement.Center
	) {
		// Judul Halaman
		Text(
			text = "AvatarApp",
			style = MaterialTheme.typography.headlineLarge,
			color = MaterialTheme.colorScheme.onBackground
		)

		Spacer(modifier = Modifier.height(32.dp))

		// Tumpukan gambar avatar
		Box(
			modifier = Modifier
				.size(300.dp)
				.align(Alignment.CenterHorizontally)
		) {
			Image(
				painter = painterResource(id = R.drawable.ic_avatar_base),
				contentDescription = "Avatar Base",
				modifier = Modifier.fillMaxSize()
			)
			if (isBrowEnabled) {
				Image(
					painter = painterResource(id = R.drawable.ic_avatar_brow),
					contentDescription = "Alis",
					modifier = Modifier.fillMaxSize()
				)
			}
			if (isEyeEnabled) {
				Image(
					painter = painterResource(id = R.drawable.ic_avatar_eye),
					contentDescription = "Mata",
					modifier = Modifier.fillMaxSize()
				)
			}
			if (isNoseEnabled) {
				Image(
					painter = painterResource(id = R.drawable.ic_avatar_nose),
					contentDescription = "Hidung",
					modifier = Modifier.fillMaxSize()
				)
			}
			if (isMouthEnabled) {
				Image(
					painter = painterResource(id = R.drawable.ic_avatar_mouth),
					contentDescription = "Mulut",
					modifier = Modifier.fillMaxSize()
				)
			}
		}

		Spacer(modifier = Modifier.height(32.dp))

		// Checkbox untuk mengaktifkan/menonaktifkan komponen wajah
		Row(
			modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
		) {
			CheckboxWithLabel(label = "Brow", checked = isBrowEnabled) { isBrowEnabled = it }
			CheckboxWithLabel(label = "Eye", checked = isEyeEnabled) { isEyeEnabled = it }
			CheckboxWithLabel(label = "Nose", checked = isNoseEnabled) { isNoseEnabled = it }
			CheckboxWithLabel(label = "Mouth", checked = isMouthEnabled) { isMouthEnabled = it }
		}

		Spacer(modifier = Modifier.height(32.dp))
	}
}


@Composable
fun CheckboxWithLabel(label: String, checked: Boolean, onCheckedChange: (Boolean) -> Unit) {
	Row(
		verticalAlignment = Alignment.CenterVertically
	) {
		Checkbox(checked = checked, onCheckedChange = onCheckedChange)
		Text(text = label)
	}
}

@Preview(showBackground = true)
@Composable
fun AvatarScreenPreview() {
	AvatarScreen()
}
