package com.example.todo.presentation.details

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class DetailsViewModel : ViewModel() {
    private val _screenState = MutableStateFlow<DetailsScreenState>(
        DetailsScreenState.Add
    )
    val screenState: StateFlow<DetailsScreenState>
        get() = _screenState.asStateFlow()
}