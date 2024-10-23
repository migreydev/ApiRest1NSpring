package com.vedruna.football.dto;

import com.vedruna.football.persistance.models.Team;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class TeamDTO {
	
	private int idTeam;
	private String name;

	
	
	public TeamDTO(Team team) {
		this.idTeam = team.getIdTeam();
		this.name = team.getName();
	}
	
	
	

}
