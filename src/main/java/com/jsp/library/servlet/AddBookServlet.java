package com.jsp.library.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.library.entity.Book;
import com.jsp.library.service.LibraryService;

@WebServlet(urlPatterns = "/addBook")
public class AddBookServlet extends HttpServlet {
	
	LibraryService ls =new LibraryService();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String title = req.getParameter("title");
		String author = req.getParameter("author");
		String category = req.getParameter("category");
		int copies = Integer.parseInt(req.getParameter("copies"));
		
		
		
		Book b = new Book(title, author, category, copies);
		
		boolean saved = ls.addBook(b);
		
		if (saved)
			resp.sendRedirect("success.jsp");
		
		else
			resp.sendRedirect("error.jsp");
	}
	
	
}
