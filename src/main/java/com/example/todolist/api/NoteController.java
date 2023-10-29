package com.example.todolist.api;

import com.example.todolist.model.Note;
import com.example.todolist.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.UUID;

@RequestMapping("api/v1/note")
@RestController
public class NoteController {

    private final NoteService noteService;

    @Autowired
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @PostMapping
    public void addNote(@RequestBody Note note) {
        this.noteService.addNote(note);
    }

    @GetMapping
    public Collection<Note> selectAllNotesByUserID(@RequestParam UUID userID) {
        return this.noteService.getAllNotesByUserID(userID);
    }
}
