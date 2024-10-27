package com.vedruna.football.dto;

import java.util.ArrayList;
import java.util.List;

import com.vedruna.football.persistance.models.Footballer;
import com.vedruna.football.persistance.models.Team;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class TeamDTO {
	
	private int idTeam;
	private String name;
	private List<FootballerDTO> footballersDto; 

	
	
	public TeamDTO(Team team) {
		this.idTeam = team.getIdTeam();
		this.name = team.getName();
		this.footballersDto = new ArrayList<>();
		
		for (Footballer player : team.getFootballers()) {
            this.footballersDto.add(new FootballerDTO(player));
        }
	}
	
	
	

}
