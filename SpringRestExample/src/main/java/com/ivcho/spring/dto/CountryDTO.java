package com.ivcho.spring.dto;

import java.io.Serializable;

public class CountryDTO implements Serializable{
	private static final long serialVersionUID = 1784619875748636854L;
	
	private String code;
	private String name;
	
	public CountryDTO(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
}
