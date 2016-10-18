package com.bharaththippireddy.trainings.jaxrs;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;

public class PatientServiceImpl implements PatientService {
	private long currentId = 123;
	Map<Long, Patient> patients = new HashMap<Long, Patient>();
	Map<Long, Prescription> prescriptions = new HashMap<Long, Prescription>();

	public PatientServiceImpl() {
		init();
	}

	final void init() {
		Patient patient = new Patient();
		patient.setName("John");
		patient.setId(currentId);
		patients.put(patient.getId(), patient);

		Prescription prescription = new Prescription();
		prescription.setDescription("prescription 223");
		prescription.setId(223);
		prescriptions.put(prescription.getId(), prescription);
	}

	public Response addPatient(Patient patient) {
		System.out.println ("...Invoking add patient!!!!" + patient.getName());
		patient.setId(currentId ++);
		patients.put(patient.getId(), patient);
		
		return Response.ok(patient).build();
	}

	public Patient getPatient(String id) {
		long patientId = Long.parseLong(id);
		Patient patient= patients.get(patientId);

		return patient;
	}

	public Response updatePatient(Patient updatedPatient) {

		return null;
	}

	public Response deletePatients(String id) {

		return null;
	}

	public Prescription getPrescription(String prescriptionId) {

		return null;
	}

}
