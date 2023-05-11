package com.demo7;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class one extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		int n1=Integer.parseInt(request.getParameter("num1"));
		
		int n2=Integer.parseInt(request.getParameter("num2"));
		
		int ans=n1+n2;
		
		request.setAttribute("ans", ans);
		
		if(ans>0)
		{
			RequestDispatcher rd=request.getRequestDispatcher("sevelet");
			rd.forward(request, response);
		}
		else
		{System.out.println("Please enter number greather than 0");
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}
		
		
		
		
		
	out.close();	
	}

}
