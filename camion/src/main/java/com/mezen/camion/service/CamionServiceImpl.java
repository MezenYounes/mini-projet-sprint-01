package com.mezen.camion.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.mezen.camion.entities.Camion;
import com.mezen.camion.repos.CamionRepository;
@Service
public class CamionServiceImpl implements CamionService {
	
	@Autowired
	CamionRepository camionRepository;


	@Override
	public Camion saveCamion(Camion c) {
		return camionRepository.save(c);
	}

	@Override
	public Camion updateCamion(Camion c) {
		return camionRepository.save(c);
	}

	@Override
	public void deleteCamion(Camion c) {
		camionRepository.delete(c);
		
	}

	@Override
	public void deleteCamionById(Long id) {
		camionRepository.deleteById(id);
		
	}

	@Override
	public Camion getCamion(Long id) {
		return camionRepository.findById(id).get();
	}

	@Override
	public List<Camion> getAllCamions() {
		return camionRepository.findAll();
	}
	@Override
	public Page<Camion> getAllCamionsParPage(int page, int size) {
	return camionRepository.findAll(PageRequest.of(page, size));
	}
}
