package com.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "branches")
public class Branches {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "branch_name")
	private String branch_name;

	@Column(name = "vaccines_quantity")
	private int vaccines_quantity;

	@Column(name = "available_date")
	private Date available_date;

	@Column(name = "availability")
	private boolean availability;

	@ManyToOne
	@JoinColumn(name = "vaccine_id")
	private Vaccines vaccines;

	public long getId() {
		return id;
	}

	public String getBranch_name() {
		return branch_name;
	}

	public int getVaccines_quantity() {
		return vaccines_quantity;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	public void setVaccines_quantity(int vaccines_quantity) {
		this.vaccines_quantity = vaccines_quantity;
	}

	public Date getAvailable_date() {
		return available_date;
	}

	public void setAvailable_date(Date available_date) {
		this.available_date = available_date;
	}

	public Vaccines getVaccines() {
		return vaccines;
	}

	public void setVaccines(Vaccines vaccines) {
		this.vaccines = vaccines;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

}
