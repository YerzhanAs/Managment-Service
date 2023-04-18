package com.example.video_task_8_16.services;

import com.example.video_task_8_16.entities.Users;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService  extends UserDetailsService {

    Users getUserByEmail(String email);
    Users createUser(Users user);

    Users saveUser(Users users);

}
