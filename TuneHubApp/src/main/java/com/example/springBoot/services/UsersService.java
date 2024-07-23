package com.example.springBoot.services;

import com.example.springBoot.entities.Users;

public interface UsersService {
	public String addUser(Users user);
	public boolean emailExists(String email);
	public boolean validateUser(String email,String password);
	public String getRole(String email);
}
