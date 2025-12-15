package com.jsp.library.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Column(name="book_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;
	
	private String title;
	private String author;
	private String category;
	@Column(name="available_copies")
	private int avlcopy;
	
	
	public Book() {
	}


	public Book(String title, String author, String category, int avlcopy) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.avlcopy = avlcopy;
	}


	public int getBid() {
		return bid;
	}


	public void setBid(int bid) {
		this.bid = bid;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public int getAvlcopy() {
		return avlcopy;
	}


	public void setAvlcopy(int avlcopy) {
		this.avlcopy = avlcopy;
	}


	@Override
	public String toString() {
		return "Book [book_id=" + bid + ", title=" + title + ", author=" + author + ", category=" + category + ", available_copy="
				+ avlcopy + "]";
	}
	
	
}
