package com.absjrdev.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.absjrdev.course.entities.User;

@RestController
@RequestMapping("/user")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(null, "Fau", "fau@gmail.com", "99999", "1234");
		
		return ResponseEntity.ok().body(u);
	}
	
}
