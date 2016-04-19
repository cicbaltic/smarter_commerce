package com.smartercommerce.rest;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smartercommerce.pojo.*;

/**
 * Servlet implementation class ControllerServlet
 */

@WebServlet(name = "ControllerServlet", urlPatterns = "/asdsad")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
	/*@Override
	public void init() throws ServletException {
		
	}*/


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = new User();
		user.set_name("Guest");
		user.set_email("a@b.c");
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/_header.jsp");
		request.setAttribute("user", user);
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
