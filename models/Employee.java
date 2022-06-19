package com.lab.models;

public class Employee {
	private String fname;
	private String lname;
	public Employee(String fname,String lname) {
		// TODO Auto-generated constructor stub
		this.fname=fname;
		this.lname=lname;
	}
	
	public String getFname(){
		return fname;
	}
	public void setFname(String fname) {
		this.lname = fname;
	}
	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	
}
