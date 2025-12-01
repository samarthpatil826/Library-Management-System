package com.jsp.library.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.library.entity.Book;

public class BookDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("samarth");
	
	public boolean addBook(Book b) {
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tr = em.getTransaction();
		
		tr.begin();
		
		em.persist(b);
		
		tr.commit();
		
		return true;
		
	}
	
	public void updateBookCopies(int bid, int ncp) {
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tr = em.getTransaction();
		
		tr.begin();
		
		Book bf = em.find(Book.class, bid);
		
		if (bf != null) {
			
			bf.setAvlcopy(ncp);
			em.merge(bf);
			System.out.println("Book Copies Updated !!");
		} 
		
		else {
			System.out.println("Book is not available, please add book first.....");
		}
		
		tr.commit();
		
	}
	
	public List<Book> getAllBook(){
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tr = em.getTransaction();
		
		tr.begin();
		
		Query q = em.createQuery("From Book b");
		List<Book> rl = q.getResultList();
		
		tr.commit();
		return rl;
	}
	
	public void deleteBook(int bid) {
	
		EntityManager em = emf.createEntityManager();
		EntityTransaction tr = em.getTransaction();
		
		tr.begin();
		
		Book bf = em.find(Book.class, bid);
		
		if (bf != null) {
			
			em.remove(bf);
			System.out.println("Book Deleted !!");
			
		} 
		else {
			System.out.println("Book not available");
		}
		
		tr.commit();
	}
	
	
	public Book getBookById(int id) {
		
		EntityManager em = emf.createEntityManager();
		Book b = em.find(Book.class, id);
		
		return b;
	}
}
