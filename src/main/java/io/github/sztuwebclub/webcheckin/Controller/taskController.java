package io.github.sztuwebclub.webcheckin.Controller;

import io.github.sztuwebclub.webcheckin.pojo.Task;
import io.github.sztuwebclub.webcheckin.service.ItaskService;
import io.github.sztuwebclub.webcheckin.service.IuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/admin/tasks")
public class taskController {
    @Autowired
    private ItaskService taskService;
    @GetMapping("/tasks")
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }
    @PostMapping("/tasks")
    public List<Task> createTask(@RequestBody Task task) {
       return taskService.createTask(task);
    }
    @PutMapping("/tasks/{taskId}")
    public List<Task> updateTask(@PathVariable int taskId, @RequestBody Task task) {
 return taskService.updateTask(taskId, task);
    }
    @DeleteMapping("/tasks/{taskId}")
    public void deleteTask(@PathVariable int taskId) {
        return taskService.DeleteTask(taskId);
    }
}
