package com.vedruna.football.dto;

import com.vedruna.football.persistance.models.Footballer;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class FootballerDTO {
	
	private int idPlayer;
	private String name;
	private int age;
	private TeamDTO team;
	
	public FootballerDTO(Footballer footballer) {
		this.idPlayer = footballer.getIdPlayer();
		this.name = footballer.getName();
		this.age = footballer.getAge();
		this.team = new TeamDTO(footballer.getTeam()); 
	}
	
}
