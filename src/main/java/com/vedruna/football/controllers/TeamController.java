package com.vedruna.football.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vedruna.football.dto.TeamDTO;
import com.vedruna.football.services.TeamServiceImpI;

@RestController
@RequestMapping("/api/v1/teams")
public class TeamController {
	
	@Autowired
	TeamServiceImpI teamService;
	
	@GetMapping()
	public List<TeamDTO> getAllTeams(){
		return teamService.getAllTeams();
	}
	
	@GetMapping("/getTeamByName/{name}")
	public TeamDTO getTeamByName(@PathVariable String name) {
		return teamService.getTeamByName(name);
	}
	
	

}
