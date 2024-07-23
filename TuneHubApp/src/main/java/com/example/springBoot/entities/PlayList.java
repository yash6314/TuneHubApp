package com.example.springBoot.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class PlayList {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String name;
	@ManyToMany
	List<Songs>Songs;
	
	public PlayList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PlayList(int id, String name, List<com.example.springBoot.entities.Songs> songs) {
		super();
		this.id = id;
		this.name = name;
		Songs = songs;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Songs> getSongs() {
		return Songs;
	}

	public void setSongs(List<Songs> songs) {
		Songs = songs;
	}

	@Override
	public String toString() {
		return "PlayList [id=" + id + ", name=" + name + ", Songs=" + Songs + "]";
	}
	
	
	
}
