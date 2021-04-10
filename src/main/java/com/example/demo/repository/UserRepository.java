package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import com.example.demo.users.Users;


public interface UserRepository extends MongoRepository<Users, Integer> {
	
}
