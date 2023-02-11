package com.example.back.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.back.models.CategoriaModel;
import com.example.back.service.CategoriaService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/categoria")
public class CategoriaController {
	@Autowired
	CategoriaService categoriaService;
	@GetMapping
	public ArrayList<CategoriaModel> obtenerCategoria(){
		return categoriaService.obtenerCategoria();
	}
	@PostMapping
	public CategoriaModel crearCategoria(@RequestBody CategoriaModel contrato) {
		return categoriaService.crearCategoria(contrato);
	}
	@GetMapping(path="/{id}")
	public Optional<CategoriaModel> obtenerCategoriaPorId(@PathVariable("id") Long id){
		return this.categoriaService.obtenerCategoriaPorId(id);
	}
}
