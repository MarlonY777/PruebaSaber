package com.pruebaSaber.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pruebaSaber.entity.Admin;


public interface AdminRepository extends MongoRepository<Admin, String> {

	public Admin findByEmail(String email);

}
