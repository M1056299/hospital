package com.kalinga.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kalinga.hospital.entity.Patient;
@Repository
public interface PatientRepository  extends JpaRepository<Patient, Integer>{

}
