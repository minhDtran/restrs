package com.bharaththippireddy.trainings.jaxrs;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="PrescriptionB")
public class PrescriptionB {
   
	
	    private long id;
	    private String description;
	    private Map <Long,MedicineB> prescriptionB = new HashMap <Long,MedicineB> ();
    
	public PrescriptionB() {
		// TODO Auto-generated constructor stub
		init ();
	}

	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Map<Long, MedicineB> getPrescription() {
		return prescriptionB;
	}

	public void setPrescription(Map<Long, MedicineB> prescription) {
		this.prescriptionB = prescription;
	}
	
	public void init () {
		// create singleton object MedicneB
		
		  MedicineB medicineB = new MedicineB();
		  medicineB.setId(123);
		  medicineB.setDescription("this is description of medicine 123");
		  prescriptionB.put(medicineB.getId(), medicineB);
			
	}
	
	
	public MedicineB getMedicineB (long id)
	{
		MedicineB medicineB = prescriptionB.get(id);
		return medicineB;
	}
	

}
