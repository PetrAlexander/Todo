package com.example.todo.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavGraph(
    navHostController: NavHostController,
    notesScreenContent: @Composable () -> Unit,
    detailsScreenContent: @Composable () -> Unit
) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.Notes.route
    ) {
        composable(Screen.Notes.route) {
            notesScreenContent()
        }
        composable(Screen.Details.route) {
            detailsScreenContent()
        }
    }
}