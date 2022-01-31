package com.jobSearch.Service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jobSearch.Model.Company;
import com.jobSearch.Model.Departement;
import com.jobSearch.dao.CompanyDao;
import com.jobSearch.dao.DepartementDao;
@Service
public class DepartementService implements DepartementServicein {
	@Resource
    DepartementDao departementDao;
	@Resource
	CompanyService companyService;
	
	
	@Override
	public Departement get(Long id) {
		// TODO Auto-generated method stub
		return departementDao.findById(id).get();
	}

	@Override
	public List<Departement> getAll() {
		// TODO Auto-generated method stub
		
		return departementDao.findAll();
	}

	@Override
	public void add(Departement departement) {
		// TODO Auto-generated method stub
		departementDao.save(departement);
	}

	@Override
	public void update(Departement departement,long id,long idd) {
		Company company=companyService.get(id);
		Departement departement2=this.get(idd);
		departement2.setName(departement.getName());
		companyService.update(company, id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		departementDao.deleteById(id);
	}

}
