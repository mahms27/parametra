package com.parametra.prueba.service;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.parametra.prueba.dto.EmpleadoDTO;
import com.parametra.prueba.dto.Response;
import com.parametra.prueba.entity.Empleado;
import com.parametra.prueba.mapper.EmpleadoMapper;
import com.parametra.prueba.util.Utils;
import com.parametra.prueba.web.soap.SoapClient;
import com.parametra.xml.parametra.EmpleadoOBJ;

@Service
@Transactional
public class ParametraServiceImpl implements ParametraService{

	
	private static Logger logger = LoggerFactory
			.getLogger(ParametraServiceImpl.class);
	
	@Autowired
	private EmpleadoMapper eMapper;
	
    @PersistenceContext
    private EntityManager em;
    
	@Autowired
    private SoapClient soapClient;
    
    
	
	@Override
	public Response getEmployee(String nombres, String apellidos, String tipoDocumento,String numeroDocumento, Date fechaNacimiento, Date  fechaVinculacion,String cargo,Double salario) throws Exception{
		
		EmpleadoDTO e = new EmpleadoDTO();
		
		if(Utils.getAge(Utils.convertToLocalDateViaInstant(fechaNacimiento)) < 18) {
			throw new Exception("Empleado no cumple con la mayoria de edad establecidad por ley.");
		}else {
			
			e.setNombres(nombres);
			e.setApellidos(apellidos);
			e.setTipoDocumento(tipoDocumento);
			e.setNumeroDocumento(numeroDocumento);
			e.setFechanacimiento(fechaNacimiento);
			e.setFechaVinculacion(fechaVinculacion);
			e.setCargo(cargo);
			e.setSalario(salario);
			e.setEdad(Utils.getTimeCalculation(Utils.convertToLocalDateViaInstant(fechaNacimiento)));
			e.setTiempoVinculacion(Utils.getTimeCalculation(Utils.convertToLocalDateViaInstant(fechaVinculacion)));
			soapClient.getEmpleado(e);
			
		}
		
		return e;
	}

	@Override
	public EmpleadoOBJ save(EmpleadoOBJ emp) {
		
		EmpleadoOBJ obj = null;
		
		try {
			
			Empleado eVo = eMapper.toEntity(emp);
			em.persist(eVo);
			obj = eMapper.convertToOBJ(eVo);
			
		} catch (Exception e) {			
			
			logger.error("error method save  ", e);
			
		}
		
		return obj;
		
	}

}
