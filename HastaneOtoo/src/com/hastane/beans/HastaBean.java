package com.hastane.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;

import com.hastane.Hasta;
import com.mergeCons.egitim.util.EntityUtil;

@ManagedBean
@SessionScoped
public class HastaBean {

	private Hasta hasta = new Hasta();
	
	public void kaydet()
	{
		EntityManager em=EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(hasta);
		em.getTransaction().commit();
		hasta = new Hasta();
	}
	
	public void sil()
	{
		EntityManager em= EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.remove(hasta);
		em.getTransaction().commit();
		hasta = new Hasta();
	}
	
	public void duzenle()
	{
		EntityManager em=EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.merge(hasta);
		em.getTransaction().commit();
		hasta = new Hasta();
	}
	
	
	public List<Hasta> getHataListe()
	{
		EntityManager em=EntityUtil.getEntityManager();
		return em.createQuery("from Hasta").getResultList();
	}

	public Hasta getHasta() {
		return hasta;
	}

	public void setHasta(Hasta hasta) {
		this.hasta = hasta;
	}
	
	
	
}
