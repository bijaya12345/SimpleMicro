package com.dailycode.user.controller;

import com.dailycode.user.entity.User;
import com.dailycode.user.service.UserService;
import com.dailycode.user.valueobject.ResponseTemplateVO;
import com.dailycode.user.valueobject.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public void saveUser(@RequestBody UserRequest userRequest){
        userService.saveUser(userRequest);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id")Long userRequestId){
        return userService.getUserWithDepartment(userRequestId);
    }



}
