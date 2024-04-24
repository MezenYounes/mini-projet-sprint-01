package com.mezen.camion.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.mezen.camion.entities.Camion;
public interface CamionService {
	Camion saveCamion(Camion c);
	Camion updateCamion(Camion c);
	void deleteCamion(Camion c);
	 void deleteCamionById(Long id);
	 Camion getCamion(Long id);
	List<Camion> getAllCamions();
	Page<Camion> getAllCamionsParPage(int page, int size);

}
