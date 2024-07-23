package com.example.springBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.springBoot.entities.Songs;
import com.example.springBoot.services.SongsService;

@Controller
public class songsController {
	
	@Autowired
	SongsService sserv;
	
	@PostMapping("/addsongs")
	public String addSongs(@ModelAttribute Songs Song) { 
		boolean status=sserv.songExists(Song.getName());
		if(status==false) {
		sserv.addSongs(Song);
		return "songsuccess";
	}else {
		return "songfail";
	}
 }
	@GetMapping("/map-viewsongs")
	public String viewSongs(Model model) {
		List<Songs> songslist=sserv.fetchAllSongs();
		model.addAttribute("songslist",songslist);
		return "displaysongs";
	}
	@GetMapping("/viewsongs")
	public String viewCustomerSongs(Model model) {
		boolean primestatus=false;
		if(primestatus==true) {
			List<Songs> songslist=sserv.fetchAllSongs();
			model.addAttribute("songslist",songslist);
			return "displaysongs";
		}else {
			return "makepayment";
		}
	}
}
