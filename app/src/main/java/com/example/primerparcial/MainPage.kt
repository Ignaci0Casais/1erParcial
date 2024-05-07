package com.example.primerparcial

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.primerparcial.ui.theme.PrimerParcialTheme

@Composable
fun MainPage(modifier: Modifier = Modifier) {
    Scaffold{
        Column(modifier = Modifier.padding(it)){
            Row(modifier.padding()){
                Text(
                    text = "Ingrese email y contraseña",
                    modifier = modifier
                )
                Spacer(modifier = modifier.weight(1f))
            }
            TextField(value = "Usuario", onValueChange = {}, modifier = modifier
                .padding(top = 10.dp)
                .fillMaxWidth())
            TextField(value = "Contraseña", onValueChange = {}, modifier = modifier
                .padding(top = 10.dp)
                .fillMaxWidth())
            Button(onClick = {

            },
                modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(10.dp)){
                Text(
                    text = "Ingresar",
                    modifier = modifier.padding(horizontal = 10.dp)
                )
            }
            
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainPagePreview() {
    PrimerParcialTheme {
        MainPage()
    }
}