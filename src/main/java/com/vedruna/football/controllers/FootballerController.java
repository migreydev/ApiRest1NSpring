package com.vedruna.football.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
