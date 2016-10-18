package com.bharaththippireddy.trainings.jaxrs;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="MedicineB")
public class MedicineB {

	
	
	private long id;
	private String description;
	public MedicineB() {
		// TODO Auto-generated constructor stub
		
		
		
		
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

}
