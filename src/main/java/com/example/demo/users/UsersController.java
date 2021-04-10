package com.example.demo.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/users")
public class UsersController {

	private final UserService userservice;
	
	
	@Autowired
	public UsersController(UserService userservice) {
		super();
		this.userservice = userservice;
	}



	@GetMapping
	public List<Users>getUsers() {
		System.out.println("GETTING ALL USERS");
		return userservice.getUsers();
	}
	
	
	
}
