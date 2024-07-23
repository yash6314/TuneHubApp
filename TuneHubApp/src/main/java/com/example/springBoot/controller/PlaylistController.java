package com.example.springBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.springBoot.entities.PlayList;
import com.example.springBoot.entities.Songs;
import com.example.springBoot.services.PlayListService;
import com.example.springBoot.services.SongsService;

@Controller
public class PlaylistController {

	
	@Autowired
	PlayListService pserv;
	@Autowired
	SongsService sserv;
	@GetMapping("/createplaylist")
	public String createPlayList(Model model) {
		//fetching the songs using song service
		List<Songs> songslist=sserv.fetchAllSongs();
		//adding the songs to the model
		model.addAttribute("songslist", songslist);
		//sending create playlist
		return "createplaylist";
	}
	@PostMapping("/addplaylist")
	public String addPlayList(@ModelAttribute PlayList playlist) {
		
		return "playlistsuccess";
		
	}
}
