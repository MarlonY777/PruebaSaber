package com.pruebaSaber.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pruebaSaber.entity.Admin;
import com.pruebaSaber.exception.NotFoundException;
import com.pruebaSaber.repository.AdminRepository;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/admins")
public class AdminsController {

    @Autowired
    private AdminRepository adminRepository;

    @GetMapping("/")
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    @GetMapping("/{id}")
    public Admin getAdminById(@PathVariable String id) {
        return adminRepository.findById(id).orElseThrow(() -> new NotFoundException("Admin no encontrado"));
    }

    @PostMapping("/")
    public Admin saveAdmin(@RequestBody Admin admin) {
        return adminRepository.save(admin);
    }

    @PutMapping("/{id}")
    public Admin updateAdmin(@PathVariable String id, @RequestBody Admin admin) {
        admin.setId(id);
        return adminRepository.save(admin);
    }

    @DeleteMapping("/{id}")
    public Admin deleteAdmin(@PathVariable String id) {
        Admin admin = adminRepository.findById(id).orElseThrow(() -> new NotFoundException("Admin no encontrado"));
        adminRepository.deleteById(id);
        return admin;
    }

    @GetMapping("/search")
    public Admin searchByEmail(@RequestParam("email") String email) {
        return adminRepository.findByEmail(email);
    }
}

