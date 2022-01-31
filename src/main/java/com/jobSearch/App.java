package com.jobSearch;

import com.jobSearch.Model.Address;
import com.jobSearch.Model.Company;
import com.jobSearch.Model.Departement;
import com.jobSearch.Model.Office;
import com.jobSearch.dao.CompanyDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication(scanBasePackages = {"com.jobSearch"})
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	@Bean
	public CommandLineRunner insertData(CompanyDao dao)
	{
		return  args -> {
			Company company1 = new Company("Company-one"
			,"c@gmail.com",
				"+12345678","Lorem ipsum dolor sit amet, nisl dolores in cum, per vitae intellegebat et, ei veniam iriure minimum sea. Cum facilisi accommodare ut, eos utinam sensibus ei. Ut vide partiendo definitiones nec, lorem voluptaria pro no. Per elit principes et, vix quod animal in."
				);
			company1.setAddress(new Address(
					"10004th street",
					"10004th street",
					"Fairfield",
					"Iowa",
					"52557"
					,"Usa"
			));


			Office o = new Office("+12345678","10am","5pm");
           Address addr = new Address(
				   "10014th street",
				   "10014th street",
				   "Fairfield",
				   "Iowa",
				   "52557"
				   ,"Usa"
		   );
			o.setAddress(addr);
           company1.setOffice(o);

			Office o1 = new Office("+12345678","10am","5pm");
			Address addr1 = new Address(
					"114th street",
					"114th street",
					"Dallas",
					"Texas",
					"52557"
					,"Usa"
			);
			o1.setAddress(addr1);
			company1.setOffice(o1);


			company1.setdept(new Departement(
					"IT"
			));

			dao.save(company1);
		};

	}


}
 