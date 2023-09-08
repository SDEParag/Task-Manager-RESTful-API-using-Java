package com.assignment.task.service.impl;

import com.assignment.task.entity.Task;
import com.assignment.task.payload.TaskPayload;
import com.assignment.task.repository.TaskRepository;
import com.assignment.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task createTask(TaskPayload taskPayload) {
        Task task = new Task();
        task.setTitle(taskPayload.getTitle());
        task.setDescription(taskPayload.getDescription());
        task.setStatus(taskPayload.getStatus());
        return taskRepository.save(task);
    }

    @Override
    public Task updateTaskStatus(Long id, String status) {
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found"));
        task.setStatus(status);
        return taskRepository.save(task);
    }

    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}
