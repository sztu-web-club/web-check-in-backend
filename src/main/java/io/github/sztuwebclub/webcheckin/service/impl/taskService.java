package io.github.sztuwebclub.webcheckin.service.impl;

import io.github.sztuwebclub.webcheckin.pojo.Task;
import io.github.sztuwebclub.webcheckin.service.ItaskService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class taskService implements ItaskService {
    @Autowired
    private taskMapper taskMapper;
    // 获取所有任务
    public List<Task> getAllTasks() {
        return taskMapper.findAll();
    }

    // 根据任务ID获取任务信息
    public Task getTaskById(Long taskId) {
        return taskMapper.findById(taskId);
    }

    // 创建新任务
    public List<Task> createTask (Task task) {
       return  taskMapper.insert(task);
    }

    // 更新任务信息
    public void updateTask(Task task) {
        taskMapper.update(taskId,task);
    }

    // 删除任务
    public void deleteTask(int taskId) {
        taskMapper.delete(taskId);
    }
}
