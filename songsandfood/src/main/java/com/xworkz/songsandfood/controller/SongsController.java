package com.xworkz.songsandfood.controller;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.xworkz.songsandfood.dto.SongDTO;

@Component
@RequestMapping("/")
public class SongsController {
	
	Collection<SongDTO> songs = new ArrayList<SongDTO>();
	
	public SongsController() {
		System.out.println("creating "+this.getClass().getSimpleName());
	}
	

	@RequestMapping("/music.do")
	public String onCreateSongDTO(SongDTO song, Model model) {
		System.out.println("running onCreateSongDTO");
		System.out.println("DTO data from form " + song);
		songs.add(song);
		model.addAttribute("SongDTO", song);
		return "song.jsp";
	}
	
	@RequestMapping("/songview.do")
	public String onView ( Model model) {
		System.out.println("Running onView ()...........!");
		model.addAttribute("List",this.songs);
		return "songsDisp.jsp";
	}
	
	
}
