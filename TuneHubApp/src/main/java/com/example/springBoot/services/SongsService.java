package com.example.springBoot.services;

import java.util.List;

import com.example.springBoot.entities.Songs;

public interface SongsService {

	public String addSongs(Songs Song);
	public boolean songExists(String name);
	
	public List<Songs> fetchAllSongs();
}
