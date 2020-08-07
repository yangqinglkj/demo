package com.controller;

import com.entity.UserEntity;
import com.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService iUserService;


    @PostMapping("/saveUser")
    public void saveUser(@RequestBody UserEntity user) {
        iUserService.saveUser(user);

    }

    @DeleteMapping("/deleteUserById/{userId}")
    public void deleteUserById(@PathVariable("userId") Integer userId) {
        iUserService.deleteUserById(userId);

    }

    @PutMapping("/updateUserById")
    public void updateUserById(@RequestBody UserEntity user) {
        iUserService.updateUserById(user);

    }

    @GetMapping("/queryUserList")
    public List<UserEntity> queryUserList() {
        return iUserService.queryUserList();
    }

}
