package com.jobSearch.dto;

import com.jobSearch.Model.Address;
import com.jobSearch.Model.Company;
import com.jobSearch.Model.Departement;
import com.jobSearch.Model.Office;

public class Companyprofile {
public Company company;
public Office office;
public Departement departement;
public Address address;



public Companyprofile(Company company, Departement departement, Office office, Address address) {
	super();
	this.company = company;
	this.departement = departement;
	this.office = office;
	this.address = address;
}
public Departement getDepartement() {
	return departement;
}
public void setDepartement(Departement departement) {
	this.departement = departement;
}
public Office getOffice() {
	return office;
}
public void setOffice(Office office) {
	this.office = office;
}

public Company getCompany() {
	return company;
}
public void setCompany(Company company) {
	this.company = company;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}

public Companyprofile() {
	super();
	// TODO Auto-generated constructor stub
}

}
