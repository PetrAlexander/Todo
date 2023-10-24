package com.example.todo.presentation.notes

import com.example.todo.domain.Note

sealed class NotesScreenState {
    data class Notes (
        val notes: List<Note>
    ): NotesScreenState()
}