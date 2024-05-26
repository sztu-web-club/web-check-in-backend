package io.github.sztuwebclub.webcheckin.service;

import io.github.sztuwebclub.webcheckin.pojo.CheckInRecord;
import io.github.sztuwebclub.webcheckin.pojo.Task;
import io.github.sztuwebclub.webcheckin.pojo.checkin;
import io.github.sztuwebclub.webcheckin.pojo.user;

import java.util.List;

public interface IuserService {

    List<Task> getUserTasks(int userId);

    List<CheckInRecord> getUserCheckInRecords(int userId);
    List<checkin> getUsercheckin(int userId);
    List<user> getUserById(int userId);
    List<user> updateUser(int userId, user user);
}
