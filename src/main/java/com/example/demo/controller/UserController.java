package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.service.UserService;import lombok.val;

@RestController(value="user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value = "getUser")
	public List<User> getUsers(){
		return userService.getUsers();
	}
	
	@PostMapping(value = "addUser")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@PostMapping(value = "getUserById")
	public User getUserByUserName(@RequestParam String userName,@RequestParam String password) {
		return userService.getUserByUserName(userName,password);
	}

}
