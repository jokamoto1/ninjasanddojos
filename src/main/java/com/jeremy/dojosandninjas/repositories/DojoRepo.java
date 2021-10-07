package com.jeremy.dojosandninjas.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jeremy.dojosandninjas.models.Dojo;


@Repository
public interface  DojoRepo extends CrudRepository<Dojo, Long>{}
