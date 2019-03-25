package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

public class HelloWorld extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	ObjectMapper map = new ObjectMapper();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		System.out.println("HelloWorld!");
		resp.getWriter().append(map.writeValueAsString("HelloWorld!"));
	}

}
