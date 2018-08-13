package com.hastane;

import javax.persistence.*;

@Entity
@Table(name="hasta")
public class Hasta {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer hastaID;
	private String hastaAd;
	private String hastaSoyad;
	private Integer hastaTC;
	private String hastaAdres;
	@ManyToOne(cascade=CascadeType.ALL)
	private Doktor doktor = new Doktor();
	public Integer getHastaID() {
		return hastaID;
	}
	public void setHastaID(Integer hastaID) {
		this.hastaID = hastaID;
	}
	public String getHastaAd() {
		return hastaAd;
	}
	public void setHastaAd(String hastaAd) {
		this.hastaAd = hastaAd;
	}
	public String getHastaSoyad() {
		return hastaSoyad;
	}
	public void setHastaSoyad(String hastaSoyad) {
		this.hastaSoyad = hastaSoyad;
	}
	public Integer getHastaTC() {
		return hastaTC;
	}
	public void setHastaTC(Integer hastaTC) {
		this.hastaTC = hastaTC;
	}
	public String getHastaAdres() {
		return hastaAdres;
	}
	public void setHastaAdres(String hastaAdres) {
		this.hastaAdres = hastaAdres;
	}
	public Doktor getDoktor() {
		return doktor;
	}
	public void setDoktor(Doktor doktor) {
		this.doktor = doktor;
	}
	
	
}
