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
	private String nameTeam;
	
	
	public FootballerDTO(Footballer footballer) {
		this.idPlayer = footballer.getIdPlayer();
		this.name = footballer.getName();
		this.age = footballer.getAge();
		if(footballer.getTeam() == null || footballer.getTeam().getName() == null) {
			this.nameTeam = "Sin equipo";
		}else {
			this.nameTeam = footballer.getTeam().getName();
		}
	}
	
}
