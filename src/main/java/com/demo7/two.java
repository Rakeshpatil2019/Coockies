package com.demo7;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class two extends HttpServlet {
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");	
		
		PrintWriter out=response.getWriter();
		
		int s= (int) request.getAttribute("ans");
		
		out.print("<h1>welcome to my second servlet</h1>");
		out.print("Square root:-"+(s*s));
		
		out.close();
		
		
		
		
		
		
	}

}
