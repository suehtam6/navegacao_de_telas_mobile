package com.example.navegacao

import android.R.attr.type
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHost
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.navegacao.screens.LoginScreen
import com.example.navegacao.screens.MenuScreen
import com.example.navegacao.screens.PedidosScreen
import com.example.navegacao.screens.PerfilScreen
import com.example.navegacao.ui.theme.NavegacaoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavegacaoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = "login",
                        exitTransition = {
                            slideOutOfContainer(
                                towards = AnimatedContentTransitionScope.SlideDirection.Left,
                                animationSpec = tween(1000)
                            ) + fadeOut(animationSpec = tween(1000))
                        }
                    ){

                        composable (route = "login"){ LoginScreen(navController) }

                        composable (
                            route = "perfil/{nome}/{idade}",

                            arguments = listOf(
                                navArgument(name = "nome"){
                                    type = NavType.StringType
                                },

                                navArgument(name = "idade") {
                                    type = NavType.IntType
                                }
                            )
                        ){


                            val nome    = it.arguments?.getString("nome")
                            val idade   = it.arguments?.getInt("idade")

                            PerfilScreen(navController, nome = nome!!, idade = idade!!) }





                        composable (route = "pedidos?numeroPedido={numeroPedido}",
                            arguments = listOf(navArgument(name = "numeroPedido"){
                                defaultValue = "Sem pedidos"})

                        ){
                            val numeroPedido = it.arguments?.getString("numeroPedido")
                            PedidosScreen(navController, numeroPedido = numeroPedido!!) }

                        composable (route = "menu"){ MenuScreen(navController) }



                    }




                }
            }
        }
    }
}



