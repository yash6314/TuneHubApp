package com.example.springBoot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springBoot.entities.Songs;
import com.example.springBoot.repositories.SongsRepository;

@Service
public class SongsServiceImplementation implements SongsService{
	
	@Autowired
	SongsRepository srepo;

	@Override
	public String addSongs(Songs Song) {
		srepo.save(Song);
		return "Songs is added";
		 
	}

	@Override
	public boolean songExists(String name) {
		Songs song=srepo.findByName(name);
		if(song==null) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public List<Songs> fetchAllSongs() {
		List<Songs> songslist=srepo.findAll();
		return songslist;
	}
	
}
