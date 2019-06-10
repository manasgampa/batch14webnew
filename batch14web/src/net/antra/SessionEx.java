package net.antra;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionEx extends HttpServlet{
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		HttpSession hsession=request.getSession(false);
		hsession.setAttribute("name", "Calvin");
		System.out.println(hsession.getId());
		PrintWriter out=response.getWriter();	
		out.println(hsession.getId());
		
		
	}

}
