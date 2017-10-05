package com.app.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Doctor {
	@Id
	@GeneratedValue
	@Column(name="drid")
private int doctorId;
private String doctorname;
private String Qualifaction;
@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,orphanRemoval=true)
@JoinColumn(name="drid_fk",referencedColumnName="drid")
private Set<Patient> patient;

public Doctor(String doctorname, String qualifaction) {
	super();
	this.doctorname = doctorname;
	Qualifaction = qualifaction;
}
public Doctor(String doctorname, String qualifaction, Set<Patient> patient) {
	super();
	this.doctorname = doctorname;
	Qualifaction = qualifaction;
	this.patient = patient;
}
public Doctor(int doctorId) {
	super();
	this.doctorId = doctorId;
}
public Doctor() {
	super();
}
public Doctor(int doctorId, String doctorname, String qualifaction,
		Set<Patient> patient) {
	super();
	this.doctorId = doctorId;
	this.doctorname = doctorname;
	Qualifaction = qualifaction;
	this.patient = patient;
}
public int getDoctorId() {
	return doctorId;
}
public void setDoctorId(int doctorId) {
	this.doctorId = doctorId;
}
public String getDoctorname() {
	return doctorname;
}
public void setDoctorname(String doctorname) {
	this.doctorname = doctorname;
}
public String getQualifaction() {
	return Qualifaction;
}
public void setQualifaction(String qualifaction) {
	Qualifaction = qualifaction;
}
public Set<Patient> getPatient() {
	return patient;
}
public void setPatient(Set<Patient> patient) {
	this.patient = patient;
}
@Override
public String toString() {
	return "Doctor [doctorId=" + doctorId + ", doctorname=" + doctorname
			+ ", Qualifaction=" + Qualifaction + ", patient=" + patient + "]";
}


}
