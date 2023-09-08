package com.assignment.task.controller;

import com.assignment.task.entity.Task;
import com.assignment.task.payload.TaskPayload;
import com.assignment.task.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping
    public Task createTask(@RequestBody TaskPayload taskPayload) {
        return taskService.createTask(taskPayload);
    }

    @PutMapping("/{id}")
    public Task updateTaskStatus(@PathVariable Long id, @RequestParam String status) {
        return taskService.updateTaskStatus(id, status);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }
}
