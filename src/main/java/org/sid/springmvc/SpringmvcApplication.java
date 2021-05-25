package org.sid.springmvc;

import java.util.Date;

import org.sid.springmvc.dao.PatientRepository;
import org.sid.springmvc.entites.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringmvcApplication implements CommandLineRunner {
	@Autowired
	private PatientRepository patientrepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringmvcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		patientrepository.save(new Patient(null,"patient0",new Date(),false,4));
		patientrepository.save(new Patient(null,"patient1",new Date(),false,8));
		patientrepository.save(new Patient(null,"patient3",new Date(),false,6));
		
		patientrepository.findAll().forEach(p->{
			System.out.println(p.getName());
			
		}
				
				);
	}

}
