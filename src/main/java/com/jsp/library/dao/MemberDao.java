package com.jsp.library.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.library.entity.Member;

public class MemberDao {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("samarth");

	public boolean addMember(Member mem) {
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tr = em.getTransaction();
		
		tr.begin();
		
		em.persist(mem);
		
		tr.commit();
		
		return true;
	}
	
	public List<Member> getAllMember(){
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tr = em.getTransaction();
		
		tr.begin();
		
		Query q = em.createQuery("from Member m");
		
		List rl = q.getResultList();
		
		tr.commit(); 
		
		return rl;
	}
	
	public void updateEmail(int mid, String nmail) {
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tr = em.getTransaction();
		
		tr.begin();
		
		Member mf = em.find(Member.class, mid);
		mf.setEmail(nmail);
		em.merge(mf);
		
		tr.commit();
		
	}
	
	public void deleteMember(int mid) {
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tr = em.getTransaction();
		
		tr.begin();
		
		Member mf = em.find(Member.class, mid);
		em.remove(mf);
		
		tr.commit();
	}
	
	public Member getMemberById(int id) {
		
	    EntityManager em = emf.createEntityManager();
	    Member m = em.find(Member.class, id);
	
	    return m;
	}

}
