package com.example.userDemo.controllers;

import com.example.userDemo.entity.User;
import com.example.userDemo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(("user/"))
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/bolsa")
    public String message (){
        return "Amo o projeto Bolsa Jovem!!";
    }

}
