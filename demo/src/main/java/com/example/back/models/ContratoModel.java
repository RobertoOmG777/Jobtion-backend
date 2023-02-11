package com.example.back.models;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
@Entity
@Table(name = "Contrato")
public class ContratoModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false,unique = true)
	private Long id;
	@NotBlank
	private String nombreContrato;
	@NotBlank
	private String descripcion;
	@NotNull
	
	@JsonFormat(pattern = "MM-dd-yyyy")
	private Date fechaInicial;
	@NotNull
	@JsonFormat(pattern = "MM-dd-yyyy")
	private Date fechaFinal;
	@NotNull
	@Positive
	private Float valorContrato;
	@NotNull
	@ManyToOne
	private FreelancerModel freelancer;
	@NotNull
	@ManyToOne
	private Metodo_pagoModel metodoPago;
	
	public ContratoModel(Long id, String nombreContrato, String descripcion, Date fechaInicial, Date fechaFinal,
			Metodo_pagoModel metodoPago, Float valorContrato, FreelancerModel freelancer) {
		super();
		this.id = id;
		this.nombreContrato = nombreContrato;
		this.descripcion = descripcion;
		this.fechaInicial = fechaInicial;
		this.fechaFinal = fechaFinal;
		this.metodoPago = metodoPago;
		this.valorContrato = valorContrato;
		this.freelancer = freelancer;
	}
	public ContratoModel() {};
	
	
	public Metodo_pagoModel getMetodoPago() {
		return metodoPago;
	}
	public void setMetodoPago(Metodo_pagoModel metodoPago) {
		this.metodoPago = metodoPago;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombreContrato() {
		return nombreContrato;
	}
	public void setNombreContrato(String nombreContrato) {
		this.nombreContrato = nombreContrato;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripccion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFechaInicial() {
		return fechaInicial;
	}
	public void setFechaInicial(Date fechaInicial) {
		this.fechaInicial = fechaInicial;
	}
	public Date getFechaFinal() {
		return fechaFinal;
	}
	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}
	public Float getValorContrato() {
		return valorContrato;
	}
	public void setValorContrato(Float valorContrato) {
		this.valorContrato = valorContrato;
	}
	public FreelancerModel getFreelancer() {
		return freelancer;
	}
	public void setFreelancer(FreelancerModel freelancer) {
		this.freelancer = freelancer;
	}
	
	

}
