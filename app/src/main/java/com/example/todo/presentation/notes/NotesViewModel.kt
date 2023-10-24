package com.example.todo.presentation.notes

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class NotesViewModel : ViewModel() {
    private val _screenState = MutableStateFlow<NotesScreenState>(
        NotesScreenState.Notes(emptyList())
    )
    val screenState: StateFlow<NotesScreenState>
        get() = _screenState.asStateFlow()
}