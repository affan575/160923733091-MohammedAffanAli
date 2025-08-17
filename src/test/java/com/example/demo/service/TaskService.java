package com.example.demo.service;

import com.example.demo.model.Task;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TaskService {
    private Map<Long, Task> taskMap = new HashMap<>();
    private long idCounter = 1;

    public Task createTask(Task task) {
        task.setId(idCounter++);
        taskMap.put(task.getId(), task);
        return task;
    }

    public Task getTaskById(Long id) {
        return taskMap.get(id);
    }

    public List<Task> getAllTasks() {
        return new ArrayList<>(taskMap.values());
    }

    public Task updateTask(Long id, Task updatedTask) {
        Task existing = taskMap.get(id);
        if (existing != null) {
            existing.setTitle(updatedTask.getTitle());
            existing.setDescription(updatedTask.getDescription());
            existing.setStatus(updatedTask.getStatus());
            return existing;
        }
        return null;
    }

    public boolean deleteTask(Long id) {
        return taskMap.remove(id) != null;
    }
}
