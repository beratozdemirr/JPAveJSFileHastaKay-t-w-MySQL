package com.hastane.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.hastane.Kullanici;
import com.mergeCons.egitim.util.EntityUtil;

@ManagedBean
@SessionScoped
public class KullaniciBean {
private Kullanici kullanici = new Kullanici();
	
	public void kullaniciKaydet()
	{
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(kullanici);
		em.getTransaction().commit();
		kullanici = new Kullanici();
		
	}
	
	
	public void kullaniciSil()
	{
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.remove(kullanici);
		em.getTransaction().commit();
		kullanici = new Kullanici();
	}
	
	public String gec()
	{
		return "Hastane";
	}
	
	public void kullaniciDuzenle()
	{
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.merge(kullanici);
		em.getTransaction().commit();
		kullanici = new Kullanici();
	}
	
	public String kontrol()
	{
		EntityManager em  = EntityUtil.getEntityManager();
		String queryString = "SELECT a FROM Kullanici a WHERE a.kullaniciAd = :ad and a.kullaniciSifre = :sifre";
		Query query = em.createQuery(queryString);
		query.setParameter("ad", kullanici.getKullaniciAd());
		query.setParameter("sifre", kullanici.getKullaniciSifre());
		
		if(query.getResultList().isEmpty()) {
			return "Hata";
		}
		else
			return "Admin";
		
	}
	
	public List <Kullanici> getKullaniciListesi()
	{
		EntityManager em  = EntityUtil.getEntityManager();
		return em.createQuery("from Kullanici").getResultList();
	}


	public Kullanici getKullanici() {
		return kullanici;
	}


	public void setKullanici(Kullanici kullanici) {
		this.kullanici = kullanici;
	}
	
	
}