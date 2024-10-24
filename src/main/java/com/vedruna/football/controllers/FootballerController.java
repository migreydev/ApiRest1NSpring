package com.vedruna.football.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vedruna.football.dto.FootballerDTO;
import com.vedruna.football.services.FootballerServiceImpl;

@RestController
@RequestMapping("/api/v1/footballers")
public class FootballerController {
	
	@Autowired
	FootballerServiceImpl footballerService;
	
	
	@GetMapping()
	public List<FootballerDTO> getALllPlayers(){
		return footballerService.getAllFootballers();
	}

	@PostMapping("/addPlayer")
	public void addPlayer(@RequestBody FootballerDTO footballerDTO) {
		footballerService.addFootballer(footballerDTO);
	}
	
	@PostMapping("/addPlayerTeam/{nameTeam}")
	public void addPlayerAteam(@PathVariable String nameTeam, @RequestBody FootballerDTO footballerDTO) {
		footballerDTO.setNameTeam(nameTeam);
		footballerService.addFootballer(footballerDTO);
		
	}
	
	@DeleteMapping("/deletePlayer/{namePlayer}")
	public void deletePlayer(@PathVariable String namePlayer) {
		FootballerDTO footballer = footballerService.getFootballerByName(namePlayer);
		footballerService.deleteFootballer(footballer);
	}
	
}
