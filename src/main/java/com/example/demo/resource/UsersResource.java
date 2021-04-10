package com.example.demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.UserRepository;
import com.example.demo.users.Users;

@RestController
@RequestMapping(path = "/rest/users")
public class UsersResource {

	private UserRepository userRepo;
	
	@Autowired
	public UsersResource(UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}



	@GetMapping(path = "/all")
	public List<Users> getAll(){
		System.out.println("GETTING ALL users from the userRepo");
		return userRepo.findAll();
	}
	
}
