package net.antra;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {
	
	public void init() {
		
		System.out.println("in init method");
	}
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		System.out.println("in second servlet service");
		
		/*PrintWriter out=response.getWriter();
		
		Cookie ck[]=request.getCookies();
		if(ck!=null) {
			
			for(int i=0;i<ck.length;i++) {
				
				out.println("key:"+ck[i].getName());
				out.println("value:"+ck[i].getValue());
			}
		}
		
		System.out.println("in second servlet");*/
	}
	
	public void destroy() {
		System.out.println("in destroy");
	}

}
