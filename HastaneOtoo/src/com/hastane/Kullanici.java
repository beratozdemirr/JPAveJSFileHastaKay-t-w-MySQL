package com.hastane;

import javax.persistence.*;

@Entity
@Table(name ="kullanici")
public class Kullanici {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long kullaniciID;
	private String kullaniciAd;
	private String kullaniciSifre;
	public Long getKullaniciID() {
		return kullaniciID;
	}
	public void setKullaniciID(Long kullaniciID) {
		this.kullaniciID = kullaniciID;
	}
	public String getKullaniciAd() {
		return kullaniciAd;
	}
	public void setKullaniciAd(String kullaniciAd) {
		this.kullaniciAd = kullaniciAd;
	}
	public String getKullaniciSifre() {
		return kullaniciSifre;
	}
	public void setKullaniciSifre(String kullaniciSifre) {
		this.kullaniciSifre = kullaniciSifre;
	}
	
	

}
