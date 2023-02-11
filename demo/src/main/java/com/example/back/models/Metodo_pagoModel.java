package com.example.back.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "metodoPago")

public class Metodo_pagoModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false,unique = true)
	@NotBlank
	private Long id;
	private String nombreMetodoPago;
	public Metodo_pagoModel(Long id, String nombreMetodoPago) {
		super();
		this.id = id;
		this.nombreMetodoPago = nombreMetodoPago;
	}
	public Metodo_pagoModel() {};
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombreMetodoPago() {
		return nombreMetodoPago;
	}
	public void setNombreMetodoPago(String nombreMetodoPago) {
		this.nombreMetodoPago = nombreMetodoPago;
	}

}
