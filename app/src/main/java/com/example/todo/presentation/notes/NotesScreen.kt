package com.example.todo.presentation.notes

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun NotesScreen(
    onAddClickListener: () -> Unit
) {
    val viewModel: NotesViewModel = viewModel()
    val screenState = viewModel.screenState.collectAsState()
    val notes = screenState.value
    if (notes is NotesScreenState.Notes) {
        NotesScreenContent(
            notes = notes.notes,
            onAddClickListener
        )
    }
}
