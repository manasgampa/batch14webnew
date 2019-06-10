package net.antra;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CookieEx extends HttpServlet{

	public void service(HttpServletRequest request, HttpServletResponse reponse) {
		
		HttpSession hsession=request.getSession();
		System.out.println(hsession.getId());
		
		System.out.println(hsession.getAttribute("name"));
	}
}
