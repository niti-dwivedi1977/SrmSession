package com.srm.beansXmlBased;

import java.util.List;

public class Address 
{
	private String street;
	private String city;
	private String pin;
	private List<String> landMarks;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String street, String city, String pin, List<String> landMarks) {
		super();
		this.street = street;
		this.city = city;
		this.pin = pin;
		this.landMarks = landMarks;
	}




	public List<String> getLandMarks() {
		return landMarks;
	}




	public void setLandMarks(List<String> landMarks) {
		this.landMarks = landMarks;
	}




	public Address(String street, String city, String pin) {
		super();
		this.street = street;
		this.city = city;
		this.pin = pin;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", pin=" + pin + ", landMarks=" + landMarks + "]";
	}
	
	public void getAddress()
	{
		
		System.out.println("Address Class Called");
	}
	
}