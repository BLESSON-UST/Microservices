package com.UST.userservice.controller;

import com.UST.userservice.entity.User;
import com.UST.userservice.services.UserService;
import com.UST.userservice.vo.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService userservice;
    @PostMapping("/")
    public User saveUser(@RequestBody User user)
    {
        log.info("Inside Saveuser of usercontroller");
        return userservice.saveUser(user);
    }
    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id")Long userId)
    {
        log.info("inside getinfo of usercontroller");
        return userservice.getUserWithDepartment(userId);
    }
}
