package com.jobSearch.Model;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class Coming {
public Company company;

public Company getCompany() {
	return company;
}

public void setCompany(Company company) {
	this.company = company;
}

public Coming() {
	super();
	// TODO Auto-generated constructor stub
}

public Coming(Company company) {
	super();
	this.company = company;
}

}
