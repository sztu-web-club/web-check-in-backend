package io.github.sztuwebclub.webcheckin.Controller;

import io.github.sztuwebclub.webcheckin.pojo.CheckInRecord;
import io.github.sztuwebclub.webcheckin.pojo.Task;
import io.github.sztuwebclub.webcheckin.pojo.checkin;
import io.github.sztuwebclub.webcheckin.pojo.user;
import io.github.sztuwebclub.webcheckin.service.IuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class userController {
    private final IuserService userService;

    public userController(IuserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{userId}/tasks")
    public List<Task> getUserTasks(@PathVariable int userId) {
        return userService.getUserTasks(userId);
    }

    @GetMapping("/{userId}/checkin")
    public List<checkin> getUsercheckin(@PathVariable int userId) {
        return userService.getUsercheckin(userId);
    }
    @GetMapping("/{userId}/attendance-records")
    public List<CheckInRecord> getUserCheckInRecords(@PathVariable int userId) {
        return userService.getUserCheckInRecords(userId);
    }
    @GetMapping("/{userId}")
    public List<user> getUserById(@PathVariable int userId) {
        return userService.getUserById(userId);
    }
    @PutMapping("/{userId}")
    public List<user> updateUser(@PathVariable int userId, @RequestBody user user) {
        return userService.updateUser(userId, user);
    }


}
