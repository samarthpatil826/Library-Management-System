package com.jsp.library.dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.library.entity.Book;
import com.jsp.library.entity.IssueRecord;
import com.jsp.library.entity.Member;

public class IssueRecordDao {

	public void issueBook(Book b, Member m) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("samarth");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tr = em.getTransaction();
		
		tr.begin();
		
		Book bf = em.find(Book.class, b.getBid());
		Member mf = em.find(Member.class, m.getMid());
		int ct = bf.getAvlcopy();
		bf.setAvlcopy(ct-1);
		
		IssueRecord rec = new IssueRecord(LocalDate.now(), bf, mf);
		
		em.persist(rec);
		em.merge(bf);
		
		tr.commit();
	}
	
	public void returnBook(int isid) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("samarth");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tr = em.getTransaction();
		
		tr.begin();
		
		IssueRecord rec = em.find(IssueRecord.class, isid);
		
		rec.setRdate(LocalDate.now());
		Book b = rec.getBook();
		
		b.setAvlcopy(b.getAvlcopy()+1);
		
		em.merge(rec);
		em.merge(b);
		
		tr.commit();
	}
	
	public List<IssueRecord> getAllIssueBooks(){
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("samarth");
		EntityManager em = emf.createEntityManager();
//		EntityTransaction tr = em.getTransaction();
		
//		tr.begin();
		
		Query q = em.createQuery("from IssueRecord");
		
		List rl = q.getResultList();
		
		return rl;
	}
}
