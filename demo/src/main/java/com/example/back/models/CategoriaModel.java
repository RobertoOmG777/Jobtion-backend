package com.example.back.models;

import jakarta.persistence.*;
@Entity
@Table(name = "Categoria")
public class CategoriaModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false,unique = true)
	private long id;
	private String nombre;
	public CategoriaModel(long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	public CategoriaModel() {};
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
