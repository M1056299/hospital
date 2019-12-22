package com.kalinga.hospital.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Doctor {
	@Id
	private int doctorId;
	private String doctorName;
	private double doctorBill;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "doctor")
	private List<Patient> patients;
	public Doctor(int doctorId, String doctorName, double doctorBill, List<Patient> patients) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorBill = doctorBill;
		this.patients = patients;
	}
	public Doctor() {
		super();
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public double getDoctorBill() {
		return doctorBill;
	}
	public void setDoctorBill(double doctorBill) {
		this.doctorBill = doctorBill;
	}
	public List<Patient> getPatients() {
		return patients;
	}
	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", doctorBill=" + doctorBill
				+ ", patients=" + patients + "]";
	}
	public static java.util.Comparator<Doctor> salaryComp=new  java.util.Comparator<Doctor>() {
		
		@Override
		public int compare(Doctor arg0, Doctor arg1) {
			
			return (int) (arg1.getDoctorBill()-arg0.getDoctorBill());
		}
	};

	}