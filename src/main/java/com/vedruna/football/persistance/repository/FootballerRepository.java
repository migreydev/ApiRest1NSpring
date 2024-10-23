package com.vedruna.football.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vedruna.football.persistance.models.Footballer;

public interface FootballerRepository extends JpaRepository<Footballer, Integer>{
	
	 Footballer findByName(String name);
}
