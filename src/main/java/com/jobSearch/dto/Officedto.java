package com.jobSearch.dto;

import com.jobSearch.Model.Address;
import com.jobSearch.Model.Office;

public class Officedto {
public Office office;
public Address address;

public Officedto(Office office, Address address) {
	super();
	this.office = office;
	this.address = address;
}
public Office getOffice() {
	return office;
}
public void setOffice(Office office) {
	this.office = office;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}

}
