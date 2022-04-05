package com.caseStudy.mallAdmin;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "mallAdmin")
public class mallAdmin {
	
	@Id
	private int id;
	
	private String name;
	
	private String password;
	
	private Mall mall;
	
	private String phone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Mall getMall() {
		return mall;
	}

	public void setMall(Mall mall) {
		this.mall = mall;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	

}
