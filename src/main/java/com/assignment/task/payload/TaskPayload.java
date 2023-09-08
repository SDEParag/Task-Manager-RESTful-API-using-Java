package com.assignment.task.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskPayload {
    private String title;
    private String description;
    private String status;
}
