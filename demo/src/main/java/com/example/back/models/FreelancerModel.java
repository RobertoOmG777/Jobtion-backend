package com.example.back.models;



import jakarta.persistence.*;
@Entity
@Table(name="Freelancer")
public class FreelancerModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false,unique = true)
	private long id;
	private String nombre;
	private String apellido;
	private int edad;
	private int aniosExp;
	private String pais;
	private String ciudad;
	@Column(length = 1000)
	private String descripcion;
	private String fotoFreelancer;
	@ManyToOne
	private CategoriaModel categoria;
	public FreelancerModel(long id, String nombre, String apellido, int edad, int aniosExp, String pais, String ciudad,
			String descripcion, String fotoFreelancer, CategoriaModel categoria) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.aniosExp = aniosExp;
		this.pais = pais;
		this.ciudad = ciudad;
		this.descripcion = descripcion;
		this.fotoFreelancer = fotoFreelancer;
		this.categoria = categoria;
	}
	public FreelancerModel() {};
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
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getAniosExp() {
		return aniosExp;
	}
	public void setAniosExp(int aniosExp) {
		this.aniosExp = aniosExp;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getFotoFreelancer() {
		return fotoFreelancer;
	}
	public void setFotoFreelancer(String fotoFreelancer) {
		this.fotoFreelancer = fotoFreelancer;
	}
	public CategoriaModel getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaModel categoria) {
		this.categoria = categoria;
	}
}
