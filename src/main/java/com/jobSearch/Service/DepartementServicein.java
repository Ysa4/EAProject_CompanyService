package com.jobSearch.Service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobSearch.Model.Company;
import com.jobSearch.Model.Departement;

public interface DepartementServicein {
	Departement get(Long id);
	List<Departement> getAll();
	void add(Departement departement);
	void update(Departement departement,long id,long id1);
	void delete(Long id);
}
