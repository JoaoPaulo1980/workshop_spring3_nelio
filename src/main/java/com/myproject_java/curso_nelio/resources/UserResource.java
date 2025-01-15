package com.myproject_java.curso_nelio.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myproject_java.curso_nelio.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User teste = new User(1L,"JP","JP777@gmail.com", "999999", "123456");
		return ResponseEntity.ok().body(teste);
	}
}
