package com.bharaththippireddy.trainings.jaxrs;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name="PatientB")
public class PatientB {
	private long id;
	private String name;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PatientB() {
		// TODO Auto-generated constructor stub
	
		
		
	}
	
	

}
