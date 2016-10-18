package com.bharaththippireddy.trainings.jaxrs;

import javax.ws.rs.DELETE;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


@Produces({"application/xml","aplication/json"})
public interface PatientServicesB {
	
	
	@GET  // import javax.ws.rs.GET  .. step1 
	@Path ("/patients/{id}") // import jaxrs annotation .. step 2  define get resource
	public abstract PatientB getPatient (@PathParam ("id") String id);
	
	@PUT  // step1 import javax.ws.rs httpmethods
	@Path ("/patients/") // step2 import jaxrs path define resources add resource
	public abstract Response addPatient (PatientB patient);
	
	@POST  // step1 javax.ws.rs   http methods
	@Path ("/patients/") // step2  Identify the resource using @path from jaxrs anootation
	public abstract Response updatePatient (PatientB patient);
	
	@DELETE
	@Path ("/patients/{id}")
	public abstract Response deletePatient (@PathParam ("id") String id);
	
	@GET
	public abstract PrescriptionB getPrescription (String id);
	
	
	
	
	

}
