package com.jsp.library.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.library.entity.Book;
import com.jsp.library.service.LibraryService;

@WebServlet(urlPatterns = "/viewbook")
public class ViewBookServlet extends HttpServlet {

	private LibraryService ls = new LibraryService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Book> book = ls.bookList();
		
		req.setAttribute("Books", book);
		
		RequestDispatcher rd = req.getRequestDispatcher("viewBooks.jsp");
		rd.forward(req, resp);
		
	}
	
}
