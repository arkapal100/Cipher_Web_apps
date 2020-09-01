package com.arka;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class getDetails extends HttpServlet{
	
	public void service(HttpServletRequest req , HttpServletResponse res ) throws IOException
	{
		PrintWriter out = res.getWriter();
		
		Cookie cookies[] = req.getCookies();
		
		for(int i = 0;i<cookies.length;i++)
			out.println(cookies[i].getValue());
	}
}
