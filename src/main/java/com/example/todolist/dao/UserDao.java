package com.example.todolist.dao;

import com.example.todolist.model.User;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

public interface UserDao {

    int insertUser(UUID userId, User user);

    default int insertUser(User user) {

        UUID id = UUID.randomUUID();
        return insertUser(id, user);
    }

    Collection<User> selectAllUsers();
}
