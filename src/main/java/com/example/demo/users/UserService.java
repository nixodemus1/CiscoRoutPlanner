package com.example.demo.users;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	public List<Users>getUsers() {
		return List.of(new Users(1L, "Justin", "Noland", "jmnoland@aggies.ncat.edu", "Bballer32", "JustinNoland24", "123-456-7890"));
	}
	
}
