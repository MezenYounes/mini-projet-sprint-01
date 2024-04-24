package com.mezen.camion;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import com.mezen.camion.service.CamionService;
import com.mezen.camion.entities.Camion;

@SpringBootApplication
public class CamionApplication  implements CommandLineRunner {
	@Autowired
	private CamionService camionservice;

	public static void main(String[] args) {
		SpringApplication.run(CamionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		camionservice.saveCamion(new Camion("Tacoma",45000.00,"Le Toyota Tacoma est un camion compact durable et fiable"));
		camionservice.saveCamion(new Camion("Hilux",70000.00,"Le Toyota Hilux est un camion efficace"));
		camionservice.saveCamion(new Camion("Amaroke",10000.00,"L Amaroke est un camion puissant"));
		}


}
