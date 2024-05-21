package io.github.sztuwebclub.webcheckin.Controller;

import io.github.sztuwebclub.webcheckin.pojo.CheckInRecord;
import io.github.sztuwebclub.webcheckin.pojo.Task;
import io.github.sztuwebclub.webcheckin.service.IuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/{userId}/records")
    public List<CheckInRecord> getUserCheckInRecords(@PathVariable int userId) {
        return userService.getUserCheckInRecords(userId);
    }
}
