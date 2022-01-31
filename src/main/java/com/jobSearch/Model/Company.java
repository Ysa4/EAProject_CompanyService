package com.jobSearch.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SecondaryTable;

@Entity
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	public String name;
	public String email;
	public String phone_no;	
	@Lob
	public String description;
	@OneToMany( cascade = CascadeType.ALL)
	@JoinColumn(name="company_id")
	public List<Office>offices=new ArrayList<>();	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="Com_id")
	public List <Departement> departements=new ArrayList<>();
	
	@OneToOne(cascade = CascadeType.ALL)
	public Address address;


	
	public Company() {
		
	}
		public Company(String name,String email, String phone_no, String description) {
		super();
		this.email = email;
		this.name=name;
		this.phone_no = phone_no;
		this.description = description;
		
	}
		public String getName() {
			 
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhone_no() {
			return phone_no;
		}
		public void setPhone_no(String phone_no) {
			this.phone_no = phone_no;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		public void setOffice(Office office) {
			offices.add(office);
		}
		public void remove(Office office) {
			offices.remove(office);
		}
		public void setdept(Departement departement) {
			departements.add(departement);
		}
		public void remove(Departement departement) {
			departements.remove(departement);
		}
		
		
	
	
}
