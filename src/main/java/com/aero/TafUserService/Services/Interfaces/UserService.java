package com.aero.TafUserService.Services.Interfaces;

import com.aero.TafUserService.Models.UsersDTO;


public interface UserService {
    UsersDTO regUser(UsersDTO regUsers);
    UsersDTO getUser(Long userId);
    String updateUser(Long userId,UsersDTO updateUsers);

}
