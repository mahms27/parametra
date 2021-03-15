package com.parametra.prueba.dto;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmpleadoDTO  extends Response{
	        
	@JsonProperty("nombres")
	@NotNull(message = "el campo nombres es obligatorio")
   	private String nombres;    
    
	@JsonProperty("apellidos")
	@NotNull(message = "el campo apellidos es obligatorio")
   	private String apellidos;
    
	@JsonProperty("tipoDocumento")
	@NotNull(message = "el campo tipoDocumento es obligatorio")
   	private String tipoDocumento;

	@JsonProperty("numeroDocumento")
	@NotNull(message = "el campo numeroDocumento es obligatorio")
   	private String numeroDocumento;
    
	@JsonProperty("fechanacimiento")
	@JsonFormat(pattern = "dd/MM/yyyy")
	  // Allows dd/MM/yyyy date to be passed into GET request in JSON
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@NotNull(message = "el campo fechanacimiento es obligatorio")
   	private Date fechanacimiento;
    
	@JsonProperty("fechaVinculacion")
	@JsonFormat(pattern = "dd/MM/yyyy")	
    @DateTimeFormat(pattern = "dd/MM/yyyy")
	@NotNull(message = "el campo fechaVinculacion es obligatorio")
   	private Date fechaVinculacion;
    
	@JsonProperty("cargo")
	@NotNull(message = "el campo cargo es obligatorio")
   	private String cargo;
    
	@JsonProperty("salario")
	@NotNull(message = "el campo salario es obligatorio")
   	private Double salario;
	
	@JsonProperty("tiempoVinculacion")
	private String tiempoVinculacion;
	
	@JsonProperty("edad")
	private String edad;
	
}
