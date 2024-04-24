package com.mezen.camion;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.mezen.camion.entities.Camion;
import com.mezen.camion.repos.CamionRepository;
import com.mezen.camion.service.CamionService;

@SpringBootTest
class CamionApplicationTests {

	
		@Autowired
		private CamionRepository camionRepository;
		@Autowired
		private CamionService camionservice;
		@Test
		public void testCreateCamion() {
		Camion cam = new Camion("Tacoma",45000.00,"Le Toyota Tacoma est un camion compact durable et fiable");
		camionRepository.save(cam);
		}
		 @Test
		 public void testFindCamion()
		 {
		 Camion c = camionRepository.findById(1L).get();
		 System.out.println(c);
		 }
		 @Test
		 public void testUpdateCamion()
		 {
		 Camion c = camionRepository.findById(1L).get();
		 c.setprixcamion(30000.00);
		 camionRepository.save(c);
		 }
		 @Test
		 public void testDeleteCamion()
		 {
			 camionRepository.deleteById(1L);;
		 }
		 @Test
		 public void testListerTousCamions()
		 {
		 List<Camion> cams = camionRepository.findAll();
		 for (Camion c : cams)
		 {
		 System.out.println(c);
		 }}
		 @Test
		 public void testFindByNomProduitContains()
		 {
		 Page<Camion> cams = camionservice.getAllCamionsParPage(0,2);
		 System.out.println(cams.getSize());
		 System.out.println(cams.getTotalElements());
		 System.out.println(cams.getTotalPages());
		 cams.getContent().forEach(p -> {System.out.println(p.toString());
		  });
		
		 }
}