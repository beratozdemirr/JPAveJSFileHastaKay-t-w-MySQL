package com.hastane;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="doktor")
public class Doktor {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer doktorID;
	private String doktorAd;
	private String doktorSoyad;
	private String doktorAlan;
	@OneToMany(mappedBy="doktor")
	private List<Hasta> hasta = new ArrayList<Hasta>();
	public Integer getDoktorID() {
		return doktorID;
	}
	public void setDoktorID(Integer doktorID) {
		this.doktorID = doktorID;
	}
	public String getDoktorAd() {
		return doktorAd;
	}
	public void setDoktorAd(String doktorAd) {
		this.doktorAd = doktorAd;
	}
	public String getDoktorSoyad() {
		return doktorSoyad;
	}
	public void setDoktorSoyad(String doktorSoyad) {
		this.doktorSoyad = doktorSoyad;
	}
	public String getDoktorAlan() {
		return doktorAlan;
	}
	public void setDoktorAlan(String doktorAlan) {
		this.doktorAlan = doktorAlan;
	}
	public List<Hasta> getHasta() {
		return hasta;
	}
	public void setHasta(List<Hasta> hasta) {
		this.hasta = hasta;
	}
	
	
	
}
