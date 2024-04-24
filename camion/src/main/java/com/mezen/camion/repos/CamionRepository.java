package com.mezen.camion.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mezen.camion.entities.Camion;

public interface CamionRepository extends JpaRepository<Camion, Long> {

}
