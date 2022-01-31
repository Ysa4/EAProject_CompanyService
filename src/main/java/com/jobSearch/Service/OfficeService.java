package com.jobSearch.Service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jobSearch.Model.Address;
import com.jobSearch.Model.Company;
import com.jobSearch.Model.Office;
import com.jobSearch.dao.OfficeDao;
import com.jobSearch.dto.Officedto;

import net.bytebuddy.asm.Advice.This;
@Service
public class OfficeService implements OfficeServiceIn {
	@Resource
	OfficeDao officeDao;
	@Resource
	CompanyService companyService;
	
	@Override
	public Office getbyidOffice(Long id) {
		
		return  officeDao.findById(id).get();
	}

	@Override
	public List<Office> getAlloffice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Office office) {
		// TODO Auto-generated method stub
	
		Address address=new Address(office.getAddress().getStreet1(), office.getAddress().getStreet2(), office.getAddress().getCity(), office.getAddress().getState(), office.getAddress().getPostalCode(), office.getAddress().getCountry());
		office.setAddress(address);
		officeDao.save(office);
		
	}

	@Override
	public Office update(Officedto officedto) {
	  Office office=officedto.office;
	  Address address=officedto.address;
	   office.setAddress(address);
	   
	   officeDao.save(office);
		
		return office;
	}

	@Override
	public void deleteoffice(Long id) {
		officeDao.deleteById(id);
		
	}

}
