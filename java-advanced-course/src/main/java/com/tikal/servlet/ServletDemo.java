package com.tikal.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo {

	public void doGe(HttpServletRequest request, HttpServletResponse response)
			throws IOException{
				PrintWriter out = response.getWriter();
				out.println("<html>");
				out.println("<body>");
				out.println("<h1>Hello Servlet Get</h1>");
				out.println("</body>");
				out.println("</html>");
			}
}