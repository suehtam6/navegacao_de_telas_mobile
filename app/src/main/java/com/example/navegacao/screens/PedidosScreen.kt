package com.example.navegacao.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
fun PedidosScreen(navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize()
            .background(Color(0xFFAFA9A9))
            .padding(32.dp)


    ) {

                Text(
                    text = "Pedidos",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White

                )

                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {


                    Button(
                        onClick = {
                            navController.navigate("menu")
                        },
                        colors = ButtonDefaults.buttonColors(
                            Color.White
                        ),
                        modifier = Modifier.width(150.dp)
                    ) {

                        Text(
                            text = "VOLTAR",
                            fontSize = 20.sp,
                            color = Color.Blue

                        )


                    }
                }
            }



}