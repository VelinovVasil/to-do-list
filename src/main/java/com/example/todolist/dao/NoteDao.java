package com.example.todolist.dao;

import com.example.todolist.model.Note;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

public interface NoteDao {

    int insertNote(UUID userId, Note note);

    Collection<Note> getAllNotesByUserID(UUID userID);
}
