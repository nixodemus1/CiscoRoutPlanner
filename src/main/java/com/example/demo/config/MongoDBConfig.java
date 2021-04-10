package com.example.demo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.demo.repository.UserRepository;
import com.example.demo.users.Users;
import com.example.demo.users.UsersController;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class MongoDBConfig {

	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepo) {
		//inject data into the db when app starts up
		return strings -> userRepo.save(new Users(1L, "Jack", "Sparrow", "jspar@.ncat.edu", "pirate32", "Jack4", "123-222-7890"));
	}
	
}
