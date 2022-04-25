package com.yao.userServer.controller;

import com.yao.userServer.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {


    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") String id) {
        return new User(id, id);
    }
}
