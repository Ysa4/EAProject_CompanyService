package com.jobSearch.Service;

import java.util.List;

import com.jobSearch.Model.Office;
import com.jobSearch.dto.Officedto;

public interface OfficeServiceIn {
	Office getbyidOffice(Long id);
	List<Office> getAlloffice();
	void add(Office office);
	Office update(Officedto officedto);
	void deleteoffice(Long id);
}
