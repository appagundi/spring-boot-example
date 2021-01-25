package com.spring.boot.main.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.main.model.User;
import com.spring.boot.main.service.UserService;

@RestController
public class UserResource {

	@Autowired
	UserService userService;
			
	
	@GetMapping("/users")
	public List<User> getUsers() {
		return userService.getUsers();
	}
	
}
