package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Patient {
	@Id
	@GeneratedValue
	@Column(name="pid")
	private int patientId;
	private String patirntName;
	private int age;
	
	public Patient(String patirntName, int age) {
		super();
		this.patirntName = patirntName;
		this.age = age;
	}
	public Patient(int patientId) {
		super();
		this.patientId = patientId;
	}
	public Patient() {
		super();
	}
	public Patient(int patientId, String patirntName, int age) {
		super();
		this.patientId = patientId;
		this.patirntName = patirntName;
		this.age = age;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatirntName() {
		return patirntName;
	}
	public void setPatirntName(String patirntName) {
		this.patirntName = patirntName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patirntName="
				+ patirntName + ", age=" + age + "]";
	}
	
}
