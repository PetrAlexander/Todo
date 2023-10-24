package com.example.todo.presentation.details

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun DetailsScreen() {
    val viewModel: DetailsViewModel = viewModel()
    val screenState = viewModel.screenState.collectAsState()
    DetailsScreenContent()
}