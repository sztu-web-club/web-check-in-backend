package io.github.sztuwebclub.webcheckin.service;

import io.github.sztuwebclub.webcheckin.pojo.Task;

import java.util.List;

public interface ItaskService {
    List<Task> getAllTasks();
    List<Task> createTask (Task task);
    List <Task> updateTask (Task task);
    void deleteTask (Task task);
}
