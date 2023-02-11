package com.example.back.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.back.models.FreelancerModel;

@Repository
public interface FreelancerRepository extends JpaRepository<FreelancerModel,Long>{
	

	public abstract ArrayList<FreelancerModel> findByCategoria_Id(Long id);
}

