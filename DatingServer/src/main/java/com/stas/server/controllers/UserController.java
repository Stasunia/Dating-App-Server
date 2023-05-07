package com.stas.server.controllers;

import com.stas.server.data.UserLoginData;
import com.stas.server.entities.User;
import com.stas.server.exceptions.ServerException;
import com.stas.server.logic.UserLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserLogic userLogic;

    @Autowired
    public UserController(UserLogic userLogic) {
        this.userLogic = userLogic;
    }

    @PostMapping
    public void addUser(@RequestBody User user) throws ServerException {
        userLogic.createUser(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody UserLoginData userLoginData) throws Exception {
        String token = userLogic.login(userLoginData);
        return token;
    }

    @GetMapping("{userId}")
    public User getUser(@PathVariable("userId") int userId)throws ServerException{
        return this.userLogic.getUser(userId);
    }

}
