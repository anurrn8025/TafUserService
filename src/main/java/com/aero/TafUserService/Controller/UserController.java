package com.aero.TafUserService.Controller;
import com.aero.TafUserService.Models.UsersDTO;
import com.aero.TafUserService.Services.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

@RestController
@AllArgsConstructor

public class UserController {

    private final UserServiceImpl userServiceImpl;

    //Register a new user
    @PostMapping("/users/register")
    public UsersDTO regUser(@RequestBody UsersDTO regUsers){
        return userServiceImpl.regUser(regUsers);
    }

    //Get user details
    @GetMapping("/users/{userId}")
    public UsersDTO getUser(@PathVariable("userId")Long userId){
        return userServiceImpl.getUser(userId);
    }

    // Update user details
    @PutMapping("/users/{userId}")
    public String updateUser(@PathVariable("userId")Long userId,@RequestBody UsersDTO updateUsers){
        return userServiceImpl.updateUser(userId,updateUsers);
    }









}
