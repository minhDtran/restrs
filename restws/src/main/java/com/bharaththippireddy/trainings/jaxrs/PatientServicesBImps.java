package com.bharaththippireddy.trainings.jaxrs;
import java.util.*;
import javax.ws.rs.core.Response;

public class PatientServicesBImps implements PatientServicesB{
   Map <Long, PatientB> patients = new HashMap <Long,PatientB> ();
   Map <Long, PrescriptionB> prescriptions = new HashMap <Long, PrescriptionB> ();
   long currentid = 123;
   PatientServicesBImps() {
		// TODO Auto-generated constructor stub
	   init ();
	}

   public void init ()
   
   {
	   // calling constructor to create Patient object 
	   
	   PatientB patient = new PatientB ();
	   patient.setId(currentid);
	   patient.setName("First  patient ");
	   patients.put(patient.getId(), patient);
	   
	   // calling contsructor for creating prescription object 
	   
	   PrescriptionB prescription = new PrescriptionB ();
	   prescription.setId(currentid);
	   prescription.setDescription("First description");
	   prescriptions.put(prescription.getId(), prescription);
   }
	@Override
	public PatientB getPatient(String id) {
		System.out.println ("Get patient " + id);
		// TODO Auto-generated method stub
		long patientId = Long.parseLong(id);
		return (patients.get(patientId));
		
	}

	@Override
	public Response addPatient(PatientB patient) {
		// TODO Auto-generated method stub
		// do not create patient object since already given patient object as class paarameter
		System.out.println ("Add patient " + patient);
		System.out.println ("Invokig add patient ..." + patient.getName());
		patient.setId(currentid++);
		patients.put(patient.getId(), patient);
		return Response.ok(patient).build();
		
		
	}

	@Override
	public Response updatePatient(PatientB updatepatient) {
		// TODO Auto-generated method stub
		// Update patient given patient object
		// test if patent exist before put him or update hi to patients
		System.out.println ("update patient " + updatepatient);
		Response response= null;
		PatientB currentpatient = patients.get(updatepatient.getId());
		if (currentpatient != null){
			patients.put (updatepatient.getId(),updatepatient);
			response = Response.ok(updatepatient).build();
		}
		else
		{
			response = Response.notModified().build();
		}
		
		
		return response;
	}

	@Override
	public Response deletePatient(String id) {
		// TODO Auto-generated method stub
		System.out.println ("Delete patient " + id);
		PatientB patient = patients.get(Long.parseLong(id));
		Response response = null;
		if (patient != null) {
		patients.remove(patient.getId()); 
		response.ok().build();}
		else {
			response.notModified().build();
		}
		
		
		
		return response;
	}

	@Override
	public  PrescriptionB getPrescription(String id) {
		// TODO Auto-generated method stub
		System.out.println ("Get precription " + id);
		Long prescriptionid = Long.parseLong(id);
		PrescriptionB prescription =  prescriptions.get(prescriptionid);
		return prescription;
	}

}
