package com.parametra.prueba.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {
	
    @JsonProperty("error")
    private String error;
    
	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public Response() {
		super();
	}
    

}
