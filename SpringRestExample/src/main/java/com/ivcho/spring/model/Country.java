package com.ivcho.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="ivcho", name = "countries")
public class Country {
	@Id
	private String code;

	@Column(name = _name)
	private String name;
	public static final String _name = "name";

	public Country() {}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
