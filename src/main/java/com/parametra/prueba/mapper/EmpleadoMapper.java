package com.parametra.prueba.mapper;

import com.parametra.prueba.dto.Response;
import com.parametra.prueba.entity.Empleado;
import com.parametra.xml.parametra.EmpleadoOBJ;

public interface EmpleadoMapper {
	
    EmpleadoOBJ convertToOBJ(Empleado e);
    
    Empleado toEntity(EmpleadoOBJ e);
    
    EmpleadoOBJ convertToOBJ(Response e);
}
