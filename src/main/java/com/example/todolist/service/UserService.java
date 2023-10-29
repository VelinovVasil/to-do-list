package com.example.todolist.service;

import com.example.todolist.dao.UserDao;
import com.example.todolist.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class UserService {

    private final UserDao userDao;

    @Autowired
    public UserService(@Qualifier("demoDao") UserDao userDao) {
        this.userDao = userDao;
    }

    public int addUser(User user) {
        return this.userDao.insertUser(user);
    }

    public Collection<User> selectAllUsers() {
        return this.userDao.selectAllUsers();
    }
}
