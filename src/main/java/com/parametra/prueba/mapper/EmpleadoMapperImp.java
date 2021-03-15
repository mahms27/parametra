package com.parametra.prueba.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.parametra.prueba.dto.Response;
import com.parametra.prueba.entity.Empleado;
import com.parametra.xml.parametra.EmpleadoOBJ;


@Service
public class EmpleadoMapperImp implements EmpleadoMapper {

	@Override
	public EmpleadoOBJ convertToOBJ(Empleado e) {
		
		EmpleadoOBJ empleadoOBJ  = null;
		
		if(e != null) {
			
			ModelMapper modelMapper = new ModelMapper();
			empleadoOBJ = modelMapper.map(e, EmpleadoOBJ.class);
			
		}
		
		return empleadoOBJ;
	}

	@Override
	public Empleado toEntity(EmpleadoOBJ e) {
		
		ModelMapper modelMapper = new ModelMapper();
		Empleado empleado = modelMapper.map(e, Empleado.class);
		
		return empleado;
		
	}

	@Override
	public EmpleadoOBJ convertToOBJ(Response e) {
		
		EmpleadoOBJ empleadoOBJ  = null;
		
		if(e != null) {
			
			ModelMapper modelMapper = new ModelMapper();
			empleadoOBJ = modelMapper.map(e, EmpleadoOBJ.class);
			
		}
		
		return empleadoOBJ;
	}

}
