package com.kalinga.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kalinga.hospital.entity.Doctor;
import com.kalinga.hospital.entity.Patient;
import com.kalinga.hospital.service.HospitalInter;

/**
 * @author M1056299
 *
 */
@Controller
public class hospitalController {

@Autowired HospitalInter ds;
	
/**
 * @return index.jsp
 */
@RequestMapping("/getform")
public String form1() {
	return "index";
}
/**
 * @return register doctor.jsp
 */
@RequestMapping("/doctors")
public String form2() {
	return "registerdoctors";
}
/**
 * @param doctor
 * @param m
 * @return doctorsintoDB
 */
@PostMapping("/insertdoctors")
public String insertdoc(Doctor doctor, Model m)
{
	ds.insertDoctorsintoDB(doctor);
	m.addAttribute("doctor", doctor);
	return "doctorsuccessfully";
}

/**
 * @param m
 * @return register patient details
 */
@RequestMapping("/patients")
public String form3(Model m)
{
	List<Doctor> doctors=ds.getAllDoctors();
	m.addAttribute("doctors",doctors);
	return "patientdetails";
}

/**
 * @param patient
 * @param doctorsName
 * @return inserting patient into DB
 */
@PostMapping("/insertpatient")
public String insertpat(Patient patient,String doctorName)
{   
	
	ds.insertPatient(patient,doctorName);
	return "Patientinsertedsuccessfully";
	
}
/**
 * @param m
 * @return get doctor from DB
 */
@GetMapping("/displaypatient")
public String getpatient(Model m)
{   
	List<Doctor> doctors=ds.getAllDoctors();

	m.addAttribute("doctors", doctors);
	return "display";
}
/**
 * @param doctorName
 * @param m
 * @return DISPLAY DETIALS OF PATIENTS UNDER PARTICULAR DOCTOR
 */
@GetMapping("/viewdetails")
public String getPatientsdetails(@RequestParam("doctors") String doctorName,Model m)
{
	List<Patient> patients=ds.getPatients(doctorName);
	m.addAttribute("patients",patients);
	return "display";
	
}
@GetMapping("/displaydoctors")

public String getEmployee(Model m) {
	List<Doctor> doc = ds.getAllsorteddoctor();
	m.addAttribute("list", doc);
	return "viewdoctors";

}


}
