package com.example.springBoot.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springBoot.entities.Songs;

public interface SongsRepository extends JpaRepository<Songs,Integer>{
	public Songs findByName(String name);
	
}
