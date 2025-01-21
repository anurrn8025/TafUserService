package com.aero.TafUserService.Models;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UsersDTO {
    private Long id;
    private String username;
    private String email;
    private String phone;
    private String created_at;
    private String updated_at;

}
