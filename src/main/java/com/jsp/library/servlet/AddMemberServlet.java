package com.jsp.library.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.library.entity.Member;
import com.jsp.library.service.LibraryService;

@WebServlet(urlPatterns = "/addMember")
public class AddMemberServlet extends HttpServlet{
	
	LibraryService ls =new LibraryService();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String contact = req.getParameter("num");
		
		Member m = new Member(name, email, contact);
		
		boolean save = ls.addMember(m);
		
		if (save) {
			resp.sendRedirect("success.jsp");
			
		} else 
			resp.sendRedirect("error.jsp");
		
	}

}
