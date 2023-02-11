package com.example.back.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.back.models.CategoriaModel;
import com.example.back.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	public ArrayList<CategoriaModel> obtenerCategoria(){
		return (ArrayList<CategoriaModel>)categoriaRepository.findAll();
	}
	
	public Optional<CategoriaModel> obtenerCategoriaPorId(Long id){
		return categoriaRepository.findById(id);
	}
	public CategoriaModel crearCategoria(CategoriaModel categoria) {
		return categoriaRepository.save(categoria);
		
	}
}
