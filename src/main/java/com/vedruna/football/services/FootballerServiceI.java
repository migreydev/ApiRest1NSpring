package com.vedruna.football.services;

import java.util.List;

import com.vedruna.football.dto.FootballerDTO;

public interface FootballerServiceI {
	
	List<FootballerDTO> getAllFootballers();
	void addFootballer(FootballerDTO footballer);
	
	


}
