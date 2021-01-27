package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "schedules")
public class Schedules {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "time_slot1")
	private String time_slot1;
	
	@Column(name = "time_slot2")
	private String time_slot2;
	
	
	@Column(name = "time_slot3")
	private String time_slot3;
	
	
	@Column(name = "time_slot4")
	private String time_slot4;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTime_slot1() {
		return time_slot1;
	}

	public String getTime_slot2() {
		return time_slot2;
	}

	public String getTime_slot3() {
		return time_slot3;
	}

	public String getTime_slot4() {
		return time_slot4;
	}

	public void setTime_slot1(String time_slot1) {
		this.time_slot1 = time_slot1;
	}

	public void setTime_slot2(String time_slot2) {
		this.time_slot2 = time_slot2;
	}

	public void setTime_slot3(String time_slot3) {
		this.time_slot3 = time_slot3;
	}

	public void setTime_slot4(String time_slot4) {
		this.time_slot4 = time_slot4;
	}
	
	
}
