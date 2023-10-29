package com.example.todolist.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Note {

    private final UUID userID;
    private String title;
    private String content;

    public Note(@JsonProperty("userID") UUID userID,
                @JsonProperty("title") String title,
                @JsonProperty("content") String content) {
        this.userID = userID;
        this.title = title;
        this.content = content;
    }

    public UUID getUserID() {
        return this.userID;
    }

    public String getTitle() {
        return this.title;
    }

    public String getContent() {
        return this.content;
    }
}
