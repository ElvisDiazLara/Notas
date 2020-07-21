package com.example.notas.listeners;

import com.example.notas.entities.Note;

public interface NotesListener {

    void onNoteClicked(Note note, int position);

}
