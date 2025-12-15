package com.jsp.library.main;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.library.entity.Book;
import com.jsp.library.entity.IssueRecord;
import com.jsp.library.entity.Member;
import com.jsp.library.service.LibraryService;

public class LibraryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		LibraryService ls = new LibraryService();
		
		System.out.println("----------Library Management----------");
		System.out.println();
		System.out.println("1.Add Book");
		System.out.println("2.View All Books");
		System.out.println("3.Update Book Copies");
		System.out.println("4.Delete Book");
		System.out.println("5.Add Member");
		System.out.println("6.View All Members");
		System.out.println("7.Update Email");
		System.out.println("8.Delete Member");
		System.out.println("9.Issue Book");
		System.out.println("10.Return Book");
		System.out.println("11.View Issued Records");
		System.out.println();
		System.out.println("Select Option : ");
		int opt = sc.nextInt();
		
		
		switch (opt) {
		case 1:
			System.out.println("Enter Title: ");
			String title = sc.nextLine();
//			sc.nextLine();
			System.out.println("Enter Author: ");
			String auth = sc.nextLine();
			System.out.println("Enter Category: ");
			String categ = sc.nextLine();
			System.out.println("Enter Available Copies: ");
			int copies = sc.nextInt();
			
			ls.addBook(new Book(title, auth, categ, copies));
			break;
			
		case 2:
			
			List<Book> bl = ls.bookList();
			
			if (!bl.isEmpty()) {
				for (Book b : bl)
					System.out.println(b);
			}
			else
				System.out.println("No Book Available");
			
			break;
			
		case 3:
			
			System.out.println("Enter Valid Book id: ");
			int bid = sc.nextInt();
			
			System.out.println("Enter New Copies: ");
			int ncopies = sc.nextInt();
			
			ls.updateBookCopies(bid, ncopies);
			
			break;
			
		case 4:
			
			System.out.println("Enter Book id to Delete: ");
			int boid = sc.nextInt();
			ls.deleteBook(boid);
			
			break;
			
		case 5:
			
			System.out.println("Enter Member Name: ");
			String mem = sc.nextLine();
			System.out.println("Enter Contact Number: ");
			String cont = sc.nextLine();
			System.out.println("Enter Email: ");
			String mail = sc.nextLine();
			
			ls.addMember(new Member(mem, mail, cont));
			break;
			
		case 6:
			
			List<Member> ml = ls.memberList();
			
			if (!ml.isEmpty()) {
				for (Member m : ml)
					System.out.println(m);
			} 
			else {
				System.out.println("No Member Available");
			}
			break;
			
		case 7:
			
			System.out.println("Enter Member id: ");
			int mid = sc.nextInt();
			
			System.out.println("Enter New Email: ");
			String mailid = sc.next();
			
			ls.updateMember(mid, mailid);
			break;
			
		case 8:
			
			System.out.println("Enter Member id: ");
			int memid = sc.nextInt();
			
			ls.deleteMember(memid);
			break;
			
		case 9:
			
			System.out.println("Enter Book Id to Issue: ");
			int bookid = sc.nextInt();
			
			System.out.println("Enter Member Id: ");
			int membid = sc.nextInt();
			
			Book tempb = new Book();
			tempb.setBid(bookid);
			Member tempm = new Member();
			tempm.setMid(membid);
			
			ls.issueBook(tempb, tempm);
			
			break;
			
		case 10:
			
			System.out.println("Enter Book Issue Id: ");
			int isid = sc.nextInt();
			
			ls.returnIssue(isid);
			
			break;
			
		case 11:
			
			List<IssueRecord> il = ls.getIssueList();
			
			if (!il.isEmpty()) {
				for (IssueRecord i : il)
					System.out.println(i);
			} 
			
			else {
				System.out.println("No Issue Record Available");
			}
			
			break;
		}
		
		
	}


}
