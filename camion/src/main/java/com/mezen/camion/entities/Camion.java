package com.mezen.camion.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity 
public class Camion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long idcamion;
	public String nomcamion;
	public Double prixcamion;
	public String description;

	public Camion() {
		super();
		}
		public Camion(String nomcamion, Double prixcamion,String description) {
		super();
		this.nomcamion = nomcamion;
		this.prixcamion = prixcamion;
		this.description = description;
		}
		public Long getidcamion() {
			return idcamion;
			}
			public void setidcamion(Long idcamion) {
			this.idcamion = idcamion;
			}
			public String getnomcamion() {
			return nomcamion;
			}
			public void setnomcamion(String nomcamion) {
			this.nomcamion = nomcamion;
			}
			public Double getprixcamion() {
			return prixcamion;
			}
			public void setprixcamion(Double prixcamion) {
			this.prixcamion = prixcamion;
			}
			public String getdescription() {
			return description;
			}
			public void setdescription(String description) {
			this.description = description;
			}
		

		

			@Override
			public String toString() {
			return "camion [idcamion=" + idcamion + ", nomcamion=" +
			nomcamion + ", prixcamion=" + prixcamion
			+ ", description=" + description + "]";
			}





}

