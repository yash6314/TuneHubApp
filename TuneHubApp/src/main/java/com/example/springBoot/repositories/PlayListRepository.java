package com.example.springBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springBoot.entities.PlayList;

public interface PlayListRepository extends JpaRepository<PlayList,Integer>{

}
