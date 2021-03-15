package com.parametra.prueba.web.soap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.parametra.prueba.service.ParametraService;
import com.parametra.xml.parametra.EmpleadoRequest;
import com.parametra.xml.parametra.EmpleadoResponse;


@Endpoint
public class EmpleadoEndpoint {
	
	private static final String NAMESPACE_URI = "http://www.parametra.com/xml/parametra";
	
	@Autowired
	private ParametraService service;
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "EmpleadoRequest")
	@ResponsePayload
	public EmpleadoResponse getStudent(@RequestPayload EmpleadoRequest request) {
		EmpleadoResponse response = new EmpleadoResponse();
		response.setEmpleadoOBJ(service.save(request.getEmpleadoOBJ()));

		return response;
	}

}
