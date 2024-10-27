package com.vedruna.football.persistance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vedruna.football.persistance.models.Footballer;
import com.vedruna.football.persistance.models.Team;

public interface FootballerRepository extends JpaRepository<Footballer, Integer>{
	
	 Footballer findByName(String name);
	 Footballer findByidPlayer (int idPlayer);
	 List<Footballer> findByTeam (Team team);
}
