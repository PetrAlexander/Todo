package com.example.todo.presentation.notes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.todo.domain.Note

@Composable
fun NotesScreenContent(
    notes: List<Note>,
    onAddClickListener: () -> Unit
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(4.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        items(notes.size) { ind ->
            NoteItem(note = notes[ind])
        }
        item {
            Button(
                modifier = Modifier
                    .fillMaxWidth(),
                onClick = { onAddClickListener() }
            ) {
                Text(
                    text = "Добавить"
                )
            }
        }
    }
}