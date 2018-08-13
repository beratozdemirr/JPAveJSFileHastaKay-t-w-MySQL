package com.hastane.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;

import com.hastane.Doktor;
import com.mergeCons.egitim.util.EntityUtil;

@ManagedBean
@SessionScoped
public class DoktorBean {
	

		private Doktor doktor = new Doktor();
		
		public void kaydet()
		{
			EntityManager em=EntityUtil.getEntityManager();
			em.getTransaction().begin();
			em.persist(doktor);
			em.getTransaction().commit();
			doktor = new Doktor();
		}
		
		public void sil()
		{
			EntityManager em= EntityUtil.getEntityManager();
			em.getTransaction().begin();
			em.remove(doktor);
			em.getTransaction().commit();
			doktor = new Doktor();
		}
		
		public void duzenle()
		{
			EntityManager em=EntityUtil.getEntityManager();
			em.getTransaction().begin();
			em.merge(doktor);
			em.getTransaction().commit();
			doktor = new Doktor();
		}
		
		
		public List<Doktor> getHataListe()
		{
			EntityManager em=EntityUtil.getEntityManager();
			return em.createQuery("from Doktor").getResultList();
		}

		public Doktor getDoktor() {
			return doktor;
		}

		public void setDoktor(Doktor doktor) {
			this.doktor = doktor;
		}

		
		
}
