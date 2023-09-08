package com.assignment.task.service;

import com.assignment.task.entity.Task;
import com.assignment.task.payload.TaskPayload;

import java.util.List;

public interface TaskService {
    List<Task> getAllTasks();

    Task createTask(TaskPayload taskPayload);

    Task updateTaskStatus(Long id, String status);

    void deleteTask(Long id);
}
