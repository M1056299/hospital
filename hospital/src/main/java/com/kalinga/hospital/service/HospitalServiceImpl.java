package com.kalinga.hospital.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kalinga.hospital.entity.Doctor;
import com.kalinga.hospital.entity.Patient;
import com.kalinga.hospital.repository.DoctorRepository;
import com.kalinga.hospital.repository.PatientRepository;

@Service
public class HospitalServiceImpl implements HospitalInter {

	@Autowired
	DoctorRepository docrepo;
	@Autowired
	PatientRepository patrepo;

	@Override
	public void insertDoctorsintoDB(Doctor doctor) {

		docrepo.saveAndFlush(doctor);
	}

	public List<Doctor> getAllDoctors() {
		List<Doctor> doctors = docrepo.findAll();
		return doctors;

	}

	public void insertPatient(Patient patient, String doctorName) {
		List<Doctor> doc = docrepo.findAll();

		Doctor doc1 = new Doctor();
		for (Doctor doctor : doc) {
			if (doctor.getDoctorName().equals(doctorName)) {

				doc1 = doctor;
				doc1.setDoctorBill(doc1.getDoctorBill() + patient.getPatientBill());

				patient.setDoctor(doc1);
			}

		}
		
		patrepo.saveAndFlush(patient);
	}

	public List<Patient> getPatients(String doctorName) {
		List<Patient> result = new ArrayList<Patient>();
		List<Patient> patients = patrepo.findAll();
		for (Patient patient : patients) {
			if (patient.getDoctor().getDoctorName().equals(doctorName)) {
				result.add(patient);
			}
		}

		return result;
	}

	public List<Doctor> getAllsorteddoctor()
	{
		List<Doctor> doc=docrepo.findAll();
		Collections.sort(doc, Doctor.salaryComp);
		return doc;
	
	}
}
