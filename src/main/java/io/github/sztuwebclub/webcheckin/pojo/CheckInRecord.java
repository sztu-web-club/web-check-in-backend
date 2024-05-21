package io.github.sztuwebclub.webcheckin.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckInRecord {
    private int recordId;
    private int taskId;
    private LocalDateTime checkInTime;
    private LocalDateTime checkOutTime;
    private LocalDate date;

}
