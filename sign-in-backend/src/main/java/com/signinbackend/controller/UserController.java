package com.signinbackend.controller;

import com.signinbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user/save")
    public ResponseEntity<HashMap>saveUserData(@RequestBody HashMap<String,Object> request){
        HashMap<String,Object> response = this.userService.userSave(request.get("username").toString(),request.get("password").toString());
        return ResponseEntity.ok(response);
    }

    @PostMapping("/user/check")
    public ResponseEntity<HashMap>checkUserData(@RequestBody HashMap<String,Object> request){
        HashMap<String,Object> response =this.userService.userCheck(request.get("username").toString(),request.get("password").toString());
        return ResponseEntity.ok(response);
    }
}