package com.jeremy.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jeremy.dojosandninjas.repositories.NinjaRepo;
import com.jeremy.dojosandninjas.models.Dojo;
import com.jeremy.dojosandninjas.models.Ninja;

@Service
public class NinjaService {

		private final NinjaRepo repo;
	    
	    public NinjaService(NinjaRepo repo) {
	        this.repo = repo;
	    }

	    public List<Ninja> findAll() {
	        return (List<Ninja>) repo.findAll();
	    }
	 
	    public Ninja create(Ninja ninja) {
	        return repo.save(ninja);
	    }
	    public void delete(Long id) {
	    	 repo.deleteById(id);
	    }
//
	    public Ninja findOne(Long id) {
	        Optional<Ninja> optional = repo.findById(id);
	        if(optional.isPresent()) {
	            return optional.get();
	        } else {
	            return null;
	        }
	    }
//	    public List<Ninja> findAllFromDojoId(Long id){
//	    	return (List<Ninja>) repo.findNinjaByDojoId(id);
//	    }
	  

}
