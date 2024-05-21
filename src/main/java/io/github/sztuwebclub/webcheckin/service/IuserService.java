package io.github.sztuwebclub.webcheckin.service;

import io.github.sztuwebclub.webcheckin.pojo.CheckInRecord;
import io.github.sztuwebclub.webcheckin.pojo.Task;

import java.util.List;

public interface IuserService {

    List<Task> getUserTasks(int userId);

    List<CheckInRecord> getUserCheckInRecords(int userId);
}
