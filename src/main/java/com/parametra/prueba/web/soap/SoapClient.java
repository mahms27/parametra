package com.parametra.prueba.web.soap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.parametra.prueba.dto.Response;
import com.parametra.prueba.mapper.EmpleadoMapper;
import com.parametra.xml.parametra.EmpleadoRequest;
import com.parametra.xml.parametra.EmpleadoResponse;

@Service
@Component("Empleado")
public class SoapClient extends WebServiceGatewaySupport {

    private String endpoint = "http://localhost:8080/service/empleadoWsdl.wsdl";

	@Autowired
	private EmpleadoMapper eMapper;
	
    public EmpleadoResponse getEmpleado(Response e) {
    	
        EmpleadoRequest request = new EmpleadoRequest();
        request.setEmpleadoOBJ(eMapper.convertToOBJ(e));
        EmpleadoResponse response = (EmpleadoResponse) getWebServiceTemplate().marshalSendAndReceive(endpoint,
                request);
        
        return response;
    }

}
