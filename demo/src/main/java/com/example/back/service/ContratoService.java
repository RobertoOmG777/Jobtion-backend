package com.example.back.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.back.models.ContratoModel;
import com.example.back.repositories.ContratoRepository;

@Service
public class ContratoService {

	@Autowired
	ContratoRepository contratoRepository;
	public ArrayList<ContratoModel> obtenerContratos(){
		return (ArrayList<ContratoModel>) contratoRepository.findAll();
	}
	
	public ContratoModel crearContrato(ContratoModel contrato) {
			return contratoRepository.save(contrato);
			
		
	}
	public Optional<ContratoModel> obtenerContratoById(Long id) {
		return contratoRepository.findById(id);
	}
}
