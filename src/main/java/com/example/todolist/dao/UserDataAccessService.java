package com.example.todolist.dao;

import com.example.todolist.model.Note;
import com.example.todolist.model.User;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository("demoDao")
public class UserDataAccessService implements UserDao, NoteDao{

    private static Map<UUID, User> userDB = new HashMap<>();
    private static Map<UUID, Note> noteDB = new HashMap<>();

    @Override
    public int insertUser(UUID userId, User user) {
        userDB.put(userId, new User(userId, user.getUsername(), user.getPassword()));
        return 1;
    }

    @Override
    public Collection<User> selectAllUsers() {
        return userDB.values();
    }

    @Override
    public int insertNote(UUID userId, Note note) {
        noteDB.put(userId, new Note(userId, note.getTitle(), note.getContent()));
        return 1;
    }

    @Override
    public Collection<Note> getAllNotesByUserID(UUID userID) {
        return noteDB.values().stream().filter(n -> n.getUserID().equals(userID)).collect(Collectors.toList());
    }
}
