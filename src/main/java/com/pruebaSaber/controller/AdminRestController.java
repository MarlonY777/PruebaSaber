package com.pruebaSaber.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pruebaSaber.entity.User;
import com.pruebaSaber.exception.NotFoundException;
import com.pruebaSaber.repository.UserRepository;

@RestController
@RequestMapping(value = "/api/administrador")
public class AdminRestController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/listarUser")
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	@GetMapping("/listarUser/{id}")
	public User getUserId(@PathVariable String id) {
		//API:mirar_user
		return userRepository.findById(id).orElseThrow(() -> new NotFoundException("Usuario no encontrado"));
	}
	
	@PostMapping("/listarUser")
	public User saveUser(@RequestBody Map<String, Object> body) {
		//API:crear_user
		ObjectMapper mapper = new ObjectMapper();
		User user = mapper.convertValue(body, User.class);
		return userRepository.save(user);
	}
	
	@PutMapping("/listarUser/{id}")
	public User user(@PathVariable String id, @RequestBody Map<String, Object> body){
		//API:editar_user
		ObjectMapper mapper = new ObjectMapper();
		User user = mapper.convertValue(body, User.class);
		user.setId(id);
		return userRepository.save(user);
	}
	

}
