package com.pruebaSaber.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pruebaSaber.entity.Admin;
import com.pruebaSaber.exception.NotFoundException;
import com.pruebaSaber.repository.AdminRepository;

import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admins")
public class AdminsTemplatesController {
    @Autowired
    private AdminRepository adminRepository;

    @GetMapping("/")
    public String adminsListTemplate(Model model) {
        model.addAttribute("admins", adminRepository.findAll());
        return "listAdmin";
    }

    @GetMapping("/new")
    public String adminNewTemplate(Model model) {
        model.addAttribute("admin", new Admin());
        return "formAdmin";
    }

    @GetMapping("/edit/{id}")
    public String adminEditTemplate(@PathVariable("id") String id, Model model) {
        model.addAttribute("admin", adminRepository.findById(id).orElseThrow(() -> new NotFoundException("Admin no encontrado")));
        return "formAdmin";
    }

    @PostMapping("/save")
    public String adminSaveProcess(@ModelAttribute("admin") Admin admin) {
        if (admin.getId() == null || admin.getId().isEmpty()) {
            admin.setId(null);
        }
        adminRepository.save(admin);
        return "redirect:/admins/";
    }

    @GetMapping("/delete/{id}")
    public String adminDeleteProcess(@PathVariable("id") String id) {
        adminRepository.deleteById(id);
        return "redirect:/admins/";
    }

    @GetMapping("/search")
    public String searchByEmail(@RequestParam("email") String email, Model model) {
        Admin admin = adminRepository.findByEmail(email);
        if (admin != null) {
            model.addAttribute("admin", admin);
        }
        return "search-results"; // Redirige a la lista de resultados
    }
}
