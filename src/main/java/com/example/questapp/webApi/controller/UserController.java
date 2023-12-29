package com.example.questapp.webApi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.example.questapp.Entities.concretes.User;
import com.example.questapp.Repository.abs.UserRepository;

import lombok.Data;
@RestController
@RequestMapping("/users")
@Data
public class UserController {
	
	private UserRepository userRepository;
	
	@GetMapping
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	@PostMapping
	public User createUser( @RequestBody User newUser) {
		return userRepository.save(newUser);
	}
	
	@GetMapping("/{userId}")
	public User getOneUser(@PathVariable Long userId) {
		//custom exception
		return userRepository.findById(userId).orElse(null);
}
	
	@PutMapping("/{userId}")
	public User updateOneUser(@PathVariable Long userId,@RequestBody User newUser) {
		Optional<User> user =userRepository.findById(userId);
		if(user.isPresent()) {
			User foundUser =user.get();
			foundUser.setUserName(newUser.getUserName());
			foundUser.setPassword(newUser.getPassword());
			foundUser.setId(newUser.getId());
			userRepository.save(foundUser);
			return foundUser;
			
		}
		return null;
		
	}
	
	@DeleteMapping("/{userId")
	public void deleteOneUser(@PathVariable Long userId) {
		userRepository.deleteById(userId);
		
	}
	}
