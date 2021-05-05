package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.models.Usuario;

@Controller
@RequestMapping("")
public class Controlador {
	
	@GetMapping("")
	public String index() {
		return "index";
	}
	
	@GetMapping("/que")
	public String que() {
		return "que";
	}
	
	@GetMapping("/contacto")
	public String contacto() {
		return "contacto";
	}
	
	@GetMapping("/login")
	public String login(Model model, @RequestParam String email, @RequestParam(required=false, defaultValue="1234") String contrasenha) {
		Usuario usuario = new Usuario(email, contrasenha);
		model.addAttribute("usuario", usuario);
		return "saludo";
	}
}
