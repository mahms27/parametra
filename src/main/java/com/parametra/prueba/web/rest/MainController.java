package com.parametra.prueba.web.rest;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.parametra.prueba.dto.Response;
import com.parametra.prueba.exception.EntityNotFoundException;
import com.parametra.prueba.service.ParametraService;



@Validated
@RestController
@RequestMapping("/api")
public class MainController {
	
	private static Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@Autowired
	private ParametraService service;
	


	@GetMapping("/parametra/getEmployee")
	@ResponseBody
    public ResponseEntity<Response> getEmployees(@RequestParam(value = "nombres", required = true) @NotBlank String nombres, @RequestParam(value = "apellidos", required = true) @NotBlank String apellidos,
    											 @RequestParam(value = "tipodocumento", required = true) @NotBlank String tipoDocumento, @RequestParam(value = "numerodocumento", required = true) @NotBlank String numeroDocumento,
    											 @RequestParam("fechanacimiento" ) @DateTimeFormat(pattern = "dd/MM/yyyy") @NotNull Date fechaNacimiento, @RequestParam("fechavinculacion") @DateTimeFormat(pattern = "dd/MM/yyyy") @NotNull Date fechaVinculacion,    											
    											 @RequestParam(value = "cargo", required = true) @NotBlank String cargo, @RequestParam(value = "salario", required = true) @NotNull Double salario) throws EntityNotFoundException{
		
		
		logger.info(" init method getEmployees {0}", numeroDocumento);
		
		Response resp = new Response();
		
		try {
			
			resp = service.getEmployee(nombres, apellidos, tipoDocumento, numeroDocumento, fechaNacimiento, fechaVinculacion, cargo, salario);
			
		} catch (Exception e) {
			
			resp.setError(e.getMessage());
			return new ResponseEntity<>(resp, HttpStatus.BAD_REQUEST);
			
		}
		
		return new ResponseEntity<>(resp, HttpStatus.OK);		
	}

}
