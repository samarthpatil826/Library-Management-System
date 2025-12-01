package com.jsp.library.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.library.entity.Member;
import com.jsp.library.service.LibraryService;

@WebServlet(urlPatterns = "/viewmembers")
public class ViewMemberServlet extends HttpServlet {

	LibraryService ls  =new LibraryService();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		List<Member> members = ls.memberList();
		
		req.setAttribute("members", members);
		
		RequestDispatcher rd = req.getRequestDispatcher("viewMembers.jsp");
		rd.forward(req, resp);
	}
	
}
