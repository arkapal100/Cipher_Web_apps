package com.arka;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HashFinder extends HttpServlet {
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{

		String[] s = req.getParameter("mytext").split(" ");
		for(String s1 : s)
		{
			s1 = s1.trim();
			if(s1.startsWith("#"))
				res.getWriter().println(s1);	
		}
	}
}
