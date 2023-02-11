package com.example.back.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.back.models.FreelancerModel;
import com.example.back.service.FreelancerService;

@RestController
@RequestMapping("/freelancer")
public class FreelancerController {
	@Autowired
	FreelancerService freelancerService;
	
	@GetMapping
	public ArrayList<FreelancerModel> obtenerFreelancers(){
		return freelancerService.obtenerFreelancers();
	}
	@PostMapping
	public FreelancerModel guardarFreelancer(@RequestBody FreelancerModel freelancer) {
		return this.freelancerService.guardarFreelancer(freelancer);
	}
	@GetMapping(value = "/categoria/{Id}")
	public ArrayList<FreelancerModel> getFreelancerByCategoriaId(@PathVariable Long Id){
		return freelancerService.getFreelancerByCategoriaId(Id);
	}
	@DeleteMapping(path = "/{id}")
	public String eliminarPorId(@PathVariable("id") Long id) {
		boolean ok=this.freelancerService.eliminarFreelancer(id);
		if(ok)
			return "Freelancer eliminado con id "+id;
		else
			return "No se pudo eliminar el usuario con id "+id;
		
	}
	
	
}
