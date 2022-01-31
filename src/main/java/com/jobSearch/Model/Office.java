package com.jobSearch.Model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Office {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String phone_no;
	private String office_hour_open;
	private String office_hour_Close;
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	public Office() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Office(String phone_no, String office_hour_open, String office_hour_Close) {
		super();
		this.phone_no = phone_no;
		this.office_hour_open = office_hour_open;
		this.office_hour_Close = office_hour_Close;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getOffice_hour_open() {
		return office_hour_open;
	}
	public void setOffice_hour_open(String office_hour_open) {
		this.office_hour_open = office_hour_open;
	}
	public String getOffice_hour_Close() {
		return office_hour_Close;
	}
	public void setOffice_hour_Close(String office_hour_Close) {
		this.office_hour_Close = office_hour_Close;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}
