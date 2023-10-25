package com.hms.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.model.User;
import com.hms.service.UserService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
@RequestMapping(value = "/home")
public class HomeController {

	@Autowired
	private UserService userService;

	
	
    @PostMapping("/sendOtp")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        userService.registerUser(user);
        return ResponseEntity.ok("User registered successfully.");
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@GetMapping("/test")
	public String test() {
		return "Api is working";
	}

	@GetMapping(value = "/users")
	public List<User> getUser() {
		System.out.println("Getting users");
		return userService.getUsers();
	}

	@GetMapping(value = "/currentUser")
	public String getLoggedInUser(Principal principal) {
		return principal.getName();
	}

//	@PostMapping("/create")
//	public User createUser(@RequestBody User user) {
//		
//		return userService.createUser(user);
//	}
	
	
}
