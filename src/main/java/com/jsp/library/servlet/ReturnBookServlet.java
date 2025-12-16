package com.jsp.library.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.library.service.LibraryService;

@WebServlet("/returnbook")
public class ReturnBookServlet extends HttpServlet {
	
	private LibraryService ls= new LibraryService();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			int isid = Integer.parseInt(req.getParameter("issueId"));
			
			boolean res = ls.returnIssue(isid);
			
			if (res) {
				req.setAttribute("msg", "Book Returned Successfully");
			} 
			else {
				
				req.setAttribute("msg", "Failed To Return Book ! Invalid Issue Id or Book Already Returned !");

			}
			
			RequestDispatcher rd = req.getRequestDispatcher("returnBook.jsp");
			rd.forward(req, resp);
		} 
		
		catch (Exception e) {
			e.printStackTrace();
			
			req.setAttribute("msg", "Error !! Enter Valid Issue Id");
			
			RequestDispatcher rd = req.getRequestDispatcher("returnBook.jsp");
			rd.forward(req, resp);
		}
	}

}
