package com.example.navegacao.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()
        .background(Color(0xFFCE0432))
        .padding(32.dp)



    ) {
        Text(text = "LOGIN",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White

            )


        Button(
            onClick = {

                navController.navigate("menu")

            },
            modifier = Modifier.align(Alignment.Center),
            colors = ButtonDefaults.buttonColors(
                Color.White
            )
        ) {

            Text(text = "ENTRAR",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue

            )


        }

    }




}