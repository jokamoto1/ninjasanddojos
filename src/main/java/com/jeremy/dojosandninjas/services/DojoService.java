package com.jeremy.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jeremy.dojosandninjas.repositories.DojoRepo;
import com.jeremy.dojosandninjas.models.Dojo;

@Service
public class DojoService {

		private final DojoRepo repo;
	    
	    public DojoService(DojoRepo repo) {
	        this.repo = repo;
	    }

	    public List<Dojo> findAll() {
	        return (List<Dojo>) repo.findAll();
	    }
	 
	    public Dojo create(Dojo e) {
	        return repo.save(e);
	    }
	    public void delete(Long id) {
	    	 repo.deleteById(id);
	    }
//
	    public Dojo findOne(Long id) {
	        Optional<Dojo> optional = repo.findById(id);
	        if(optional.isPresent()) {
	            return optional.get();
	        } else {
	            return null;
	        }
	    }

}
