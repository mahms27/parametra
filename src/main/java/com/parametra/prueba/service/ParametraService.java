package com.parametra.prueba.service;

import java.util.Date;

import com.parametra.prueba.dto.Response;
import com.parametra.xml.parametra.EmpleadoOBJ;

public interface ParametraService {
	
	Response getEmployee(String nombres, String apellidos, String tipoDocumento,String numeroDocumento, Date fechaNacimiento, Date  fechaVinculacion,String cargo,Double salario) throws Exception;
	
	EmpleadoOBJ save(EmpleadoOBJ e);
	
}
