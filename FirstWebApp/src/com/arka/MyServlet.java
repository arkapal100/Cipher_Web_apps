package com.arka;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
	
	public void service(HttpServletRequest req , HttpServletResponse res ) throws IOException
	{
		PrintWriter out = res.getWriter();
		out.print("<h1>Hi there! welcome to LPU</h1>");
		String username = req.getParameter("myname");
		String password = req.getParameter("pass");
		
		if(username.equals("Arka") && password.equals("Arka@100"))
			out.println("<h2>You are successfully logged in...</h2>");
		else
			out.println("<h2>Wrong username or password</h2>");
		
		
		Cookie c1 = new Cookie("uname", username);
		Cookie c2 = new Cookie("pass", password);
		
		res.addCookie(c1);
		res.addCookie(c2);
		
		out.println("<h3>Details are saved in cookies</h3>");
		
		//We will create getDetails servlet
		out.print("<a href = 'getDetails'>GetMYDetails</a>");
		
		
	}
}
