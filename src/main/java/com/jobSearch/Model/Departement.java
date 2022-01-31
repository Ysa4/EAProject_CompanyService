package com.jobSearch.Model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Departement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String name;
   
public Departement() {
	super();
	// TODO Auto-generated constructor stub
}

public Departement(String name) {
	super();
	this.name = name;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}


   
}
