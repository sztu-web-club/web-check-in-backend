package io.github.sztuwebclub.webcheckin.service.impl;

import io.github.sztuwebclub.webcheckin.pojo.CheckInRecord;
import io.github.sztuwebclub.webcheckin.pojo.Task;
import io.github.sztuwebclub.webcheckin.pojo.checkin;
import io.github.sztuwebclub.webcheckin.pojo.user;
import io.github.sztuwebclub.webcheckin.service.IuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService implements IuserService {
    @Autowired
    private userMapper userMapper;

    public List<Task> getUserTasks(int userId) {
        return userMapper.getUserTasks(userId);
    }

    public List<CheckInRecord> getUserCheckInRecords(int userId) {
        return userMapper.getUserCheckInRecords(userId);
    }
    public List<checkin> getUsercheckin(int userId) {
        return userMapper.getUsercheckin(userId);
    }
    public List<user> getUserById(int userId) {
        return userMapper.getUserById(userId);
    }
    public List<user> updateUser(int userId, user user) {
        return userMapper.updateUser(userId);
    }
}

