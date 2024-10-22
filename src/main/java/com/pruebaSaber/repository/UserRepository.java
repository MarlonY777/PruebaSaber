package com.pruebaSaber.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pruebaSaber.entity.User;

public interface UserRepository extends MongoRepository<User, String> {

	public User findByEmail(String email);
}
