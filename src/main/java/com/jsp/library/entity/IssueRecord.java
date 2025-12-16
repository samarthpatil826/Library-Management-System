package com.jsp.library.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class IssueRecord {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "issue_id")
	private int isid;

	@Column(name = "issue_date")
	private LocalDate idate;

	@Column(name = "return_date")
	private LocalDate rdate;

	@ManyToOne
	@JoinColumn(name = "book_id")
	private Book book;

	@ManyToOne
	@JoinColumn(name = "member_id")
	private Member member;

	public IssueRecord() {
		
	}

	public IssueRecord(LocalDate idate, Book book, Member member) {
		this.idate = idate;
		this.book = book;
		this.member = member;
	}

	public int getIsid() {
		return isid;
	}

	public void setIsid(int isid) {
		this.isid = isid;
	}

	public LocalDate getIdate() {
		return idate;
	}

	public void setIdate(LocalDate idate) {
		this.idate = idate;
	}

//	public LocalDate getRdate() {
//		return rdate;
//	}
//
//	public void setRdate(LocalDate rdate) {
//		this.rdate = rdate;
//	}

	public Book getBook() {
		return book;
	}

	public LocalDate getRdate() {
		return rdate;
	}

	public void setRdate(LocalDate rdate) {
		this.rdate = rdate;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	@Override
	public String toString() {
		return "IssueRecord [isid=" + isid + ", idate=" + idate + ", rdate=" + rdate + ", book=" + book + ", member="
				+ member + "]";
	}
	
	

}
