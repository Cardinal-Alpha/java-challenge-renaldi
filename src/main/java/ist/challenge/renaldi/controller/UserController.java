/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ist.challenge.renaldi.controller;

import ist.challenge.renaldi.mapper.UserMapper;
import ist.challenge.renaldi.pojo.UserDataInput;
import ist.challenge.renaldi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ryuuji
 */
@RestController
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @Autowired
    private UserMapper userMapper;
    
    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@ModelAttribute UserDataInput newUser){
        userService.registerUser(
                            userMapper.mapInput(newUser));
        return ResponseEntity.status(HttpStatus.CREATED)
                                    .body("OK");
    }
    
    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@ModelAttribute UserDataInput newUser){
        userService.loginUser(
                            userMapper.mapInput(newUser));
        return ResponseEntity.status(HttpStatus.OK)
                                    .body("WELCOME");
    }
    
}
