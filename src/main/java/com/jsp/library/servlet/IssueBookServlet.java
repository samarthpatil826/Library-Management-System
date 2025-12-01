package com.jsp.library.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.library.entity.Book;
import com.jsp.library.entity.Member;
import com.jsp.library.service.LibraryService;

@WebServlet(urlPatterns = "/issuebook")
public class IssueBookServlet extends HttpServlet{

	LibraryService ls= new LibraryService();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int bi = Integer.parseInt(req.getParameter("bookId"));
		int mi = Integer.parseInt(req.getParameter("memberId"));
		
		Book bid = ls.getBookById(bi);
		Member mid = ls.getMemberById(mi);
		
		boolean issued = ls.issueBook(bid, mid);
		
		if (issued) {
			
			resp.sendRedirect("success.jsp");
			
		} 
		else {
			
			resp.sendRedirect("Error.jsp");
		}
	}
	
}
