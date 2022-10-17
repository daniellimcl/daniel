package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.request.RegisterRequest;
import com.example.demo.response.generalResponse;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController

public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("Register")
    public ResponseEntity<?> registration(@RequestBody RegisterRequest registerRequest) {
        generalResponse gr = new generalResponse();
        userService.register(registerRequest);
        gr.setMessage("Register Success");
        return ResponseEntity.ok(gr);

    }

    @PostMapping("Login")
    public ResponseEntity<?> login(@RequestBody RegisterRequest registerRequest) {
        generalResponse gr = new generalResponse();
      System.out.println(registerRequest.getEmail()+" " +registerRequest.getPassword());

        if (userService.login(registerRequest) == true) {
            //  registerRequest.getEmail().equals(user.get().getEmail()) && registerRequest.getPassword().equals(user.get().getPassword
            gr.setMessage("Login Success");
            return ResponseEntity.ok(gr);
        } else {
            gr.setMessage("Login Fail");
            return ResponseEntity.badRequest().body(gr);

        }


    }
    @GetMapping("GetUsers")
    public ResponseEntity<?> getUsers(){

        List<User> userList = userService.getUsers();
        return ResponseEntity.ok(userList);
    }
}