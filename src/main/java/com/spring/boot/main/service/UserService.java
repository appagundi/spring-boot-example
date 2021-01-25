package com.spring.boot.main.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.main.model.User;

@Service
public class UserService {
	private static List<User> users = Arrays.asList(
			new User("John", "UK"), 
			new User("Kaen", "Austrailia"),
			new User("Meana", "guess?")
		);

	public List<User> getUsers() {
		return users;
	}
}
