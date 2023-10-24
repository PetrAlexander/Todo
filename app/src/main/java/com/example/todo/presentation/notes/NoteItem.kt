package com.example.todo.presentation.notes

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.todo.domain.Note

@Composable
fun NoteItem(note: Note) {
    Card(modifier = Modifier.fillMaxWidth()) {
        Text(
            modifier = Modifier.fillMaxWidth().padding(4.dp),
            text = note.text,
            textAlign = TextAlign.Center
        )
    }
}
