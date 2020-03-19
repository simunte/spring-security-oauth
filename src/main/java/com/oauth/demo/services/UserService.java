package com.oauth.demo.services;


import com.oauth.demo.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public interface UserService {
    UserDetails loadUserByUsername(String s);

    List<UserDTO> getAllUser();
}
