package com.example.todo.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.todo.navigation.AppNavGraph
import com.example.todo.navigation.Screen
import com.example.todo.presentation.details.DetailsScreen
import com.example.todo.presentation.notes.NotesScreen
import com.example.todo.presentation.theme.TodoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TodoTheme {
                val navHostController = rememberNavController()
                AppNavGraph(
                    navHostController = navHostController,
                    notesScreenContent = { NotesScreen { navHostController.navigate(Screen.Details.route) } },
                    detailsScreenContent = { DetailsScreen() }
                )
            }
        }
    }
}