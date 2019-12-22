package com.kalinga.hospital.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kalinga.hospital.entity.Doctor;
@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Integer> {

	
	

}
