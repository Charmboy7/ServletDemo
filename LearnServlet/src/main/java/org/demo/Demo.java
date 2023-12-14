package org.demo;

import java.io.IOException;

import java.io.PrintWriter;

import org.apache.catalina.tribes.util.Arrays;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;


public class Demo extends HttpServlet{
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter pw=res.getWriter();
//		res.setContentType("html/text");
		pw.println("Welcome to servlet learning....");
		String name=req.getParameter("name");
		String gender=req.getParameter("gender");
		String[] languages = req.getParameterValues("language"); 
		String country=req.getParameter("country");
		pw.println("Name: "+name);
		pw.println("Gender: "+gender);
		pw.println("Languges: "+Arrays.toString(languages));
		pw.println("Country: "+country);
		
	}
	

}
