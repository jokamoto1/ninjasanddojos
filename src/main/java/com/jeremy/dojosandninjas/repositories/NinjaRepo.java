package com.jeremy.dojosandninjas.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jeremy.dojosandninjas.models.Dojo;
import com.jeremy.dojosandninjas.models.Ninja;


@Repository
public interface  NinjaRepo extends CrudRepository<Ninja, Long>{

	Ninja save(Ninja ninja);
//	Ninja findNinjaByDojoId(Long dojo); 
	
	}

