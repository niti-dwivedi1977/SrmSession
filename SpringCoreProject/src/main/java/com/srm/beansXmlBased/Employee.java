package com.srm.beansXmlBased;

public class Employee
{
	private String id;
	private String name;
	private String email;
	//Reference of Address Class
	private Address addr;



	public Employee(String id, String name, String email, Address addr) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.addr = addr;
	}



		public Address getAddr() {
			return addr;
		}
	
	
		public void setAddr(Address addr) {
			this.addr = addr;
		}

		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}



	public String getId() {
		return id;
	}
	public void setId(String id) {
		System.out.println("setting id");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("setting name");
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		System.out.println("setting email");
		this.email = email;
	}
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", addr=" + addr + "]";
	}



	public void welcome()
	{
		System.out.println("welcome to spring");
	}

}