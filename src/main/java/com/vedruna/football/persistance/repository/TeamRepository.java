package com.vedruna.football.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vedruna.football.persistance.models.Team;

public interface TeamRepository extends JpaRepository<Team, Integer> {
	
	Team findByName(String name);
	Team findByidTeam(int id);

}
