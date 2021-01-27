package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vaccines")
public class Vaccines {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "vaccine_name")
	private String vaccine_name;

	public long getId() {
		return id;
	}

	public String getVaccine_name() {
		return vaccine_name;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setVaccine_name(String vaccine_name) {
		this.vaccine_name = vaccine_name;
	}

}
