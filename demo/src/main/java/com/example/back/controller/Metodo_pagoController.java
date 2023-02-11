package com.example.back.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.back.models.Metodo_pagoModel;
import com.example.back.service.Metodo_pagoService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/metodospago")
public class Metodo_pagoController {
	@Autowired
	Metodo_pagoService metodo_pagoService;
	
	@GetMapping
	public ArrayList<Metodo_pagoModel> obtenerMetodosPago(){
		return metodo_pagoService.obtenerMetodosPago();
	}
}
