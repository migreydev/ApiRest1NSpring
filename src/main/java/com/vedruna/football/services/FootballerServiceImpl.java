package com.vedruna.football.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vedruna.football.dto.FootballerDTO;
import com.vedruna.football.persistance.models.Footballer;
import com.vedruna.football.persistance.models.Team;
import com.vedruna.football.persistance.repository.FootballerRepository;
import com.vedruna.football.persistance.repository.TeamRepository;

@Service
public class FootballerServiceImpl implements FootballerServiceI{
	
	@Autowired
	FootballerRepository footballerRepository;
	
	@Autowired
	TeamRepository teamRepository;

	@Override
	public List<FootballerDTO> getAllFootballers() {
		List<Footballer> listFootballers = footballerRepository.findAll();
		List<FootballerDTO> listFootballersDTO = new ArrayList<>();
		
		for(Footballer footballer : listFootballers) {
			listFootballersDTO.add(new FootballerDTO(footballer));
		}
		return listFootballersDTO;
	}

	@Override
	public void addFootballer(FootballerDTO footballerDTO) {
		Footballer newPlayer = new Footballer();
		
		newPlayer.setIdPlayer(footballerDTO.getIdPlayer());
		newPlayer.setName(footballerDTO.getName());
		newPlayer.setAge(footballerDTO.getAge());
		
		Team team = teamRepository.findByName(footballerDTO.getNameTeam());
		newPlayer.setTeam(team);
		
		footballerRepository.save(newPlayer);
			
	}
	
	

}
