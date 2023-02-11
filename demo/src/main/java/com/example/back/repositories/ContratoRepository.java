package com.example.back.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.back.models.ContratoModel;
@Repository
public interface ContratoRepository extends CrudRepository<ContratoModel, Long>{
	
}
