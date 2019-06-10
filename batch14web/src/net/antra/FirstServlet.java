package net.antra;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

public class FirstServlet extends HttpServlet{
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse reponse) throws IOException {
	
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String sal=request.getParameter("sal");
		int empId=Integer.parseInt(id);
		int empSal=Integer.parseInt(sal);
		
		PrintWriter out=reponse.getWriter();	
		out.println("welcome to servlet");
		out.println("id:"+id);
		out.println("name:"+name);
		out.println("sal:"+sal);
		
		Cookie ck1=new Cookie("id",id);
		Cookie ck2=new Cookie("name",name);
		Cookie ck3=new Cookie("sal",sal);
		ck1.setMaxAge(6000);
		reponse.addCookie(ck1);
		reponse.addCookie(ck2);
		reponse.addCookie(ck3);
		
		String className="oralce.jdbc.driver.OracleDriver";
		/*try {
			Class.forName(className);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
			PreparedStatement pstmt=con.prepareStatement("insert into emp values(?,?,?)");
			pstmt.setInt(1, empId);
			pstmt.setString(2, name);
			pstmt.setInt(3, empSal);
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		
		System.out.println("First Servlets");
		
	}

}
