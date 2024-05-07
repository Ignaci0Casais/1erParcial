package com.example.primerparcial

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.primerparcial.ui.theme.PrimerParcialTheme

@Composable
fun LoginPage(modifier: Modifier = Modifier) {
    Text(
        text = "Hello",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun LoginPagePreview() {
    PrimerParcialTheme {
        LoginPage()
    }
}