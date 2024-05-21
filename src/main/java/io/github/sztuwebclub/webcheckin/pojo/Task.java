package io.github.sztuwebclub.webcheckin.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    private int taskId;
    private String taskName;
    private String description;
    private boolean isCompleted;
}
