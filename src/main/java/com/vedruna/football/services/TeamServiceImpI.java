package com.vedruna.football.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vedruna.football.dto.TeamDTO;
import com.vedruna.football.persistance.models.Footballer;
import com.vedruna.football.persistance.models.Team;
import com.vedruna.football.persistance.repository.FootballerRepository;
import com.vedruna.football.persistance.repository.TeamRepository;

@Service
public class TeamServiceImpI implements TeamServiceI{
	
	@Autowired
	TeamRepository teamRepository;
	
	@Autowired
	FootballerRepository footballerRepository;

	@Override
	public List<TeamDTO> getAllTeams() {
		List<Team> teamList = teamRepository.findAll(); 
        List<TeamDTO> teamListDTO = new ArrayList<>();
        
        for(Team team : teamList) {
        	teamListDTO.add(new TeamDTO(team));
        }
        
        return teamListDTO;
	}

	@Override
	public TeamDTO getTeamByName(String name) {
		return new TeamDTO(teamRepository.findByName(name));
	
	}

	@Override
	public void addTeam(TeamDTO team) {
		Team newTeam = new Team();
		
		newTeam.setIdTeam(team.getIdTeam());
		newTeam.setName(team.getName());
		
		Footballer footballer = footballerRepository.findByName(team.getName());
		newTeam.setFootballers(null);
		
		teamRepository.save(newTeam);
		
	}

}
