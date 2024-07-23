package com.example.springBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springBoot.entities.Users;

public interface UsersRepository extends JpaRepository<Users,Integer>{
	public Users findByEmail(String email);
	
}
