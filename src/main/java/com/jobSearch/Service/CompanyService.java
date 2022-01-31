package com.jobSearch.Service;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.view.RedirectView;

import com.jobSearch.Model.Address;
import com.jobSearch.Model.Company;
import com.jobSearch.Model.Departement;
import com.jobSearch.Model.Office;
import com.jobSearch.dao.CompanyDao;
import com.jobSearch.dao.OfficeDao;
import com.jobSearch.dto.Companyprofile;



@Service
@Transactional
public class CompanyService implements CompanyServicein {
	@Resource
    CompanyDao companyDao;
	@Resource
	OfficeDao officeDao;
	

	@Override
	public Company get(Long id) {
		// TODO Auto-generated method stub
		Company company=companyDao.findById(id).get();
    //    System.out.println(company==null);
		return company ;
	}

	@Override
	public List<Company> getAll() {
		// TODO Auto-generated method stub
		
		return companyDao.findAll();
	}
	
	@Override
	public void add(Companyprofile c) {
		Company company=new Company(c.company.getName(), c.company.getEmail(),c.company.getPhone_no() ,c.company.description);
     	Departement departement=new Departement(c.departement.getName());
		Address address=new Address(c.address.getStreet1(), c.address.getStreet2(), c.address.getCity(),c.address.getState(), c.address.getPostalCode(), c.address.getCountry());

		Office office=new Office(c.office.getPhone_no(), c.office.getOffice_hour_open(), c.office.getOffice_hour_Close());
		Address address2=new Address(c.office.getAddress().getStreet1(), c.office.getAddress().getStreet2(), c.office.getAddress().getCity(), c.office.getAddress().getState(), c.office.getAddress().getPostalCode(), c.office.getAddress().getCountry());
		company.setAddress(address);
		office.setAddress(address2);
		company.setOffice(office);
		company.setdept(departement);
		
		// TODO Auto-generated method stu
	 companyDao.save(company);
//	 officeDao.save(office);
	}

	@Override
	public void update(Company c,Long id) {
		if(this.get(id)!=null) {
			companyDao.save(c);
		}
		companyDao.save(c);
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		if(this.get(id)!=null) {
		companyDao.deleteById(id);
		}
	}


	

	
	
}
