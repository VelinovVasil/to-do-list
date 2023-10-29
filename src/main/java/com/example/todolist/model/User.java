package com.example.todolist.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    private final UUID userID;
    private String username;
    private String password;

    public User (@JsonProperty("userID") UUID userID,
                 @JsonProperty("username") String username,
                 @JsonProperty("password") String password) {

        this.userID = userID;
        this.username = username;
        this.password = password;
    }

    public UUID getUserID() {
        return this.userID;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }
}
