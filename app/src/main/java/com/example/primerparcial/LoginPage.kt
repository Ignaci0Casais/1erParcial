package com.example.primerparcial

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.primerparcial.ui.theme.PrimerParcialTheme

@Composable
fun LoginPage(modifier: Modifier = Modifier,
              navController: NavController
) {

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    var errorMessage by remember { mutableStateOf<String?>(null) }

    Column(modifier = Modifier){
        Row(modifier.padding()){
            Text(
                text = "Ingrese email y contraseña",
                modifier = modifier
            )
            Spacer(modifier = modifier.weight(1f))
        }
        TextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            modifier = modifier
            .padding(top = 10.dp)
            .fillMaxWidth())
        TextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Contraseña") },
            modifier = modifier
            .padding(top = 10.dp)
            .fillMaxWidth())
        Button(onClick = {
            if (email == "pedro@pe.com.ar" && password == "abc123") {
                navController.navigate("LoginOk")
            } else {
                errorMessage = "Email o contraseña incorrectos"
            }
        },
            modifier
                .align(Alignment.CenterHorizontally)
                .padding(10.dp)){
            Text(
                text = "Ingresar",
                modifier = modifier.padding(horizontal = 10.dp)
            )
        }

            if (errorMessage != null){
                Text(
                    text = "Email o contraseña incorrectos",
                    color = MaterialTheme.colorScheme.error
                )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginPagePreview() {
    PrimerParcialTheme {
        val navController = rememberNavController()
        LoginPage(navController = navController)
    }
}