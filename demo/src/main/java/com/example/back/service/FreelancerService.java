package com.example.back.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.back.models.CategoriaModel;
import com.example.back.models.FreelancerModel;
import com.example.back.repositories.CategoriaRepository;
import com.example.back.repositories.FreelancerRepository;

@Service
public class FreelancerService {
	@Autowired
	FreelancerRepository freelancerRepository;
	public ArrayList<FreelancerModel> obtenerFreelancers(){
		return (ArrayList<FreelancerModel>)freelancerRepository.findAll();
	}
	
	public FreelancerModel guardarFreelancer(FreelancerModel freelancer) {
		return freelancerRepository.save(freelancer);
	}
	
	public ArrayList<FreelancerModel> getFreelancerByCategoriaId(Long Id){
	
		return freelancerRepository.findByCategoria_Id(Id);
	}
	public boolean eliminarFreelancer(Long id) {
		try {
				freelancerRepository.deleteById(id);
				return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	
}
