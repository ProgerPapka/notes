package com.ellion.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Message {

    private UUID id;
    private String content;
    private LocalDateTime createTime;

    public Message() {
    }

    public Message(String content, LocalDateTime createTime) {
        this(UUID.randomUUID(), content, createTime);
    }

    public Message(UUID id, String content, LocalDateTime createTime) {
        this.id = id;
        this.content = content;
        this.createTime = createTime;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
}
