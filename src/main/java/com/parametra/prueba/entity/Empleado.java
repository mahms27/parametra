package com.parametra.prueba.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empleado")
public class Empleado {
	
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nombres")
   	private String nombres;    
    
    @Column(name = "apellidos")
   	private String apellidos;
    
    @Column(name = "tipo_documento")
   	private String tipoDocumento;

    @Column(name = "numero_documento")
   	private String numeroDocumento;
    
    @Column(name = "fecha_nacimiento")
   	private Date fechaNacimiento;
    
    @Column(name = "fecha_vinculacion")
   	private Date fechaVinculacion;
    
    @Column(name = "cargo")
   	private String cargo;
    
    @Column(name = "salario")
   	private Double salario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Date getFechaVinculacion() {
		return fechaVinculacion;
	}

	public void setFechaVinculacion(Date fechaVinculacion) {
		this.fechaVinculacion = fechaVinculacion;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
    
    
    
}
