package io.github.sztuwebclub.webcheckin.service.impl;

import io.github.sztuwebclub.webcheckin.mapper.IuserMapper;
import io.github.sztuwebclub.webcheckin.pojo.CheckInRecord;
import io.github.sztuwebclub.webcheckin.pojo.Task;
import io.github.sztuwebclub.webcheckin.service.IuserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService implements IuserService {
    private final IuserMapper userMapper;

    public userService(IuserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<Task> getUserTasks(int userId) {
        return userMapper.getUserTasks(userId);
    }

    public List<CheckInRecord> getUserCheckInRecords(int userId) {
        return userMapper.getUserCheckInRecords(userId);
    }
}

