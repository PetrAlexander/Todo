package com.example.todo.presentation.details

import com.example.todo.domain.Note

sealed class DetailsScreenState() {
    object Initial: DetailsScreenState()
    object Add: DetailsScreenState()
    data class Edit(
        val note: Note
    ): DetailsScreenState()
}
