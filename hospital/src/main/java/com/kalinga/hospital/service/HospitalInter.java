package com.kalinga.hospital.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.kalinga.hospital.entity.Doctor;
import com.kalinga.hospital.entity.Patient;
@Service
public interface HospitalInter {
void insertDoctorsintoDB(Doctor doctor);

void insertPatient(Patient patient, String doctorName);

public List<Doctor> getAllDoctors();

List<Patient> getPatients(String doctorName);

public List<Doctor> getAllsorteddoctor();



}
 
