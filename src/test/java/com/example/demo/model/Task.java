package com.example.demo.model;

public class Task {
    private Long id;
    private String title;
    private String description;
    private Status status;

    // Constructors
    public Task() {}
    public Task(Long id, String title, String description, Status status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public Status getStatus() { return status; }
    public void setStatus(Status status) { this.status = status; }

    @Override
    public String toString() {
        return "Task{id=" + id + ", title='" + title + '\'' + ", description='" + description + '\'' + ", status=" + status + '}';
    }
}
