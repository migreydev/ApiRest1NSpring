package com.vedruna.football.services;

import java.util.List;

import com.vedruna.football.dto.TeamDTO;

public interface TeamServiceI {
	
	List<TeamDTO> getAllTeams();
	TeamDTO getTeamByName (String name);
	TeamDTO getTeamById(int idTeam);
	void addTeam(TeamDTO team);
	void deleteTeam(TeamDTO teamDTO);

}
