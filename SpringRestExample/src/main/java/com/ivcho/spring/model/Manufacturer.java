package com.ivcho.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="ivcho", name = "manufacturers")
public class Manufacturer {
	@Id
	private Integer id;

	@Column(name = _name)
	private String name;
	public static final String _name = "name";
	
	public Manufacturer() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
