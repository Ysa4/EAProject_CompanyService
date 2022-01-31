package com.jobSearch.Controller;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.jobSearch.Model.Address;
import com.jobSearch.Model.Coming;
import com.jobSearch.Model.Company;
import com.jobSearch.Model.Departement;
import com.jobSearch.Model.Office;
import com.jobSearch.Service.CompanyService;
import com.jobSearch.Service.DepartementService;
import com.jobSearch.Service.DepartementServicein;
import com.jobSearch.Service.OfficeService;
import com.jobSearch.dto.Companyprofile;
import com.jobSearch.dto.Officedto;

@RestController
public class Controller {
	@Resource
	public CompanyService companyService;
	@Resource
	public OfficeService officeService;
	@Resource
	public DepartementService departementService;
	
	@GetMapping("/Company")
	public List<Company>getall(@PathVariable Long id) {
		List<Company> company=companyService.getAll();
		
		return company ;
	}
	@GetMapping("Company/{id}/address")
	public Address getcomp(@PathVariable long id) {
		  Company company=companyService.get(id);
		 return  company.address;	
		
	}
		@PostMapping("/Company")
		public void add(@RequestBody Companyprofile companyprofile) {
			
			companyService.add(companyprofile);
		}
		@GetMapping("/Company/{id}")
		public Company getCompany(@PathVariable Long id) {
			Company company=companyService.get(id);
			return company ;
		}
		@PutMapping("/Company/{id}")
		public Company updateCompany(@PathVariable Long id,@RequestBody Company company) {
			companyService.update(company,id);
			
			return company ;

			
		}
		@DeleteMapping("/Company/{id}")
		public void deleteCompany(@PathVariable Long id) {
			
			companyService.delete(id);
			
		}
		@PostMapping("Company/{id}/office")
		public void addoffice(@PathVariable long id,@RequestBody Officedto officedto) {
			Company company=companyService.get(id);
			System.out.println();
			Office office=officedto.office;
			office.setAddress(officedto.address);
			company.setOffice(office);
			companyService.update(company, id);
		//    officeService.add(offices);
			
			
			
		}
		@GetMapping("Company/{id}/office")
		public List <Office> getalloffice(@PathVariable long id,@RequestBody Office office) {
			Company company=companyService.get(id);
			 return company.offices;	
			
		}
		@GetMapping("Company/{id}/office/{id1}/address")
		public Address getaddress(@PathVariable long id,@PathVariable long id1) {
			Office office=officeService.getbyidOffice(id1);
			 return  office.getAddress();	
			
		}
		@PutMapping("Company/{id}/office/{idd}")
		public Office edit(@PathVariable long id,@RequestBody Officedto officedto,@PathVariable long idd) {
			return officeService.update(officedto);
			
		}
		@DeleteMapping("Company/{id}/office/{idd}")
		public String deleteoffice(@PathVariable long id,@PathVariable long idd) {
			Company company=companyService.get(id);
			company.remove(officeService.getbyidOffice(idd));
			officeService.deleteoffice(idd);
			//companyService.add(company);
			return "success";
		}
		
		@PostMapping("Company/{id}/department")
		public void adddept(@PathVariable long id,@RequestBody Departement departement) {
			Company company=companyService.get(id);
			company.setdept(departement);
			departementService.add(departement);
			
		}
		@GetMapping("Company/{id}/department")
		public List <Departement> getalldept(@PathVariable long id) {
			Company company=companyService.get(id);
			 return company.departements;	
		}
//		}
		@PutMapping("Company/{id}/department/{idd}")
		public Office editdep(@PathVariable long id,@RequestBody Departement departement,@PathVariable long idd) {
			
			 departementService.update(departement,id,idd);
			 return null;
			
		}
		@DeleteMapping("Company/{id}/department/{idd}")
		public String deletedep(@PathVariable long id,@PathVariable long idd) {
			Company company=companyService.get(id);
			company.remove(departementService.get(idd));
			departementService.delete(idd);
			//companyService.add(company);
			return "success";
		}
		@GetMapping("Company/{id}/department/{idd}")
		public Departement getbyid(@PathVariable long id,@RequestBody Departement departement,@PathVariable long idd) {
			
			 
			 return departementService.get(idd);
			
		}
		

}
