package com.example.todolist.service;

import com.example.todolist.dao.NoteDao;
import com.example.todolist.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.UUID;

@Service
public class NoteService {
    private final NoteDao noteDao;

    @Autowired
    public NoteService(@Qualifier("demoDao") NoteDao noteDao) {
        this.noteDao = noteDao;
    }

    public int addNote(Note note) {
        return this.noteDao.insertNote(note.getUserID(), note);
    }

    public Collection<Note> getAllNotesByUserID(UUID userID) {
        return this.noteDao.getAllNotesByUserID(userID);
    }
}
