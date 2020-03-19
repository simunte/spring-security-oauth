package com.oauth.demo.controller;

import com.oauth.demo.domain.User;
import com.oauth.demo.dto.UserDTO;
import com.oauth.demo.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/user")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<UserDTO>> getAllUser(HttpServletRequest request) {
        List<UserDTO> users = userService.getAllUser();
        return ResponseEntity.ok().body(users);
    }
}
