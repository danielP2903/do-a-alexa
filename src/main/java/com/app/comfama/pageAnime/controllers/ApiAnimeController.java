package com.app.comfama.pageAnime.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.comfama.pageAnime.constants.Constants;
import com.app.comfama.pageAnime.constants.serviceImpl.AnimeServiceImpl;
import com.app.comfama.pageAnime.services.AnimeService;

@RestController

@RequestMapping(value = "/api-anime")
public class ApiAnimeController {
	
	@Autowired
	public AnimeService animeService;
	
	@GetMapping(value=Constants.ENDPOINT_GET_ANIME_BY_ID +"/{id}")
	public String getAnime(@PathVariable ("id") int id) {
		
		return animeService.getAnimes(id);
		
	}
}
