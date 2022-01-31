package com.jobSearch.Service;

import java.util.List;

import com.jobSearch.Model.Address;
import com.jobSearch.Model.Company;
import com.jobSearch.Model.Office;
import com.jobSearch.dto.Companyprofile;

public interface CompanyServicein {
	Company get(Long id);
	List<Company> getAll();
	void add(Companyprofile c);
	void update(Company c,Long id);
	void delete(Long id);
	


}
