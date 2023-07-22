package com.example.userregistration.service;

import com.example.userregistration.DTO.UserRegisterDto;
import com.example.userregistration.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegisterDto userRegDto);
}
