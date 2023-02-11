package com.example.back.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.back.models.Metodo_pagoModel;
import com.example.back.repositories.Metodo_pagoRepository;

@Service
public class Metodo_pagoService {
	@Autowired
	Metodo_pagoRepository metodo_pagoRepository;
	public ArrayList<Metodo_pagoModel> obtenerMetodosPago(){
		return (ArrayList<Metodo_pagoModel>) metodo_pagoRepository.findAll();
	}

	
}
