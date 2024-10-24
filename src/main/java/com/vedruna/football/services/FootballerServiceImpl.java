package com.vedruna.football.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vedruna.football.dto.FootballerDTO;
import com.vedruna.football.persistance.models.Footballer;
import com.vedruna.football.persistance.repository.FootballerRepository;

@Service
public class FootballerServiceImpl implements FootballerServiceI{
	
	@Autowired
	FootballerRepository footballerRepository;

	@Override
	public List<FootballerDTO> getAllFootballers() {
		List<Footballer> listFootballers = footballerRepository.findAll();
		List<FootballerDTO> listFootballersDTO = new ArrayList<>();
		
		for(Footballer footballer : listFootballers) {
			listFootballersDTO.add(new FootballerDTO(footballer));
		}
		return listFootballersDTO;
	}

}
