package com.emp.pack;

public class Employee {
	int eno;
	String ename;
	Address address;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employee(int eno, String ename, Address address) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.address = address;
	}
	
	
}
