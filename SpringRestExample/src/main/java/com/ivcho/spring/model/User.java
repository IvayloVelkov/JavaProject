package com.ivcho.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="ivcho", name = "users")
public class User {
	@Id
	private Integer id;

	@Column(name = _username)
	private String username;
	public static final String _username = "username";
	
	@Column(name = _password)
	private String password;
	public static final String _password = "password";
	
	@Column(name = _funds)
	private Double funds;
	public static final String _funds = "funds";

	public User() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Double getFunds() {
		return funds;
	}

	public void setFunds(Double funds) {
		this.funds = funds;
	}
}
