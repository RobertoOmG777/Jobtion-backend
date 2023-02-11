package com.example.back.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.back.models.ContratoModel;
import com.example.back.service.ContratoService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/contrato")
public class ContratoController {
	@Autowired
	ContratoService contratoService;
	@GetMapping
	public ArrayList<ContratoModel> obtenerContratos(){
		return contratoService.obtenerContratos();
	}
	@PostMapping
	public ContratoModel crearContrato(@Valid @RequestBody ContratoModel contrato, BindingResult bindingResult) {
		return contratoService.crearContrato(contrato);
	}
	@GetMapping(path = "/{id}")
	public Optional<ContratoModel> obtenerContratoPorId(@PathVariable("id") Long id){
		return contratoService.obtenerContratoById(id);
	}
	

}
