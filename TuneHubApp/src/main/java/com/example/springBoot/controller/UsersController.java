package com.example.springBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.springBoot.entities.Users;
import com.example.springBoot.services.UsersService;

@Controller
public class UsersController {
	
	@Autowired
	UsersService userv;

	@PostMapping("/register")
	public String addUser(@ModelAttribute Users user) {
			boolean userstatus=userv.emailExists(user.getEmail());
			if(userstatus==false) {
				userv.addUser(user);
				return "registersuccess";
			}else {
				return "registerfail";
			}
	
		
	}
	@PostMapping("/login")
	public String validateUser(@RequestParam String email,@RequestParam String password) {
		if(userv.validateUser(email, password)== true) {
			if(userv.getRole(email).equals("admin")) {
				return "adminhome";
			}else {
				return "customerhome";
			}
		}
		else {
			return "loginfail";
		}
	}
}
