package com.knowuhub.prankCalulator;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class Calculate extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Connection cn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		    cn=DriverManager.getConnection("jdbc:mysql://localhost/pranklovecalculator","root","12345");
		// End of Register Driver
		    PreparedStatement ps=null;
		   
		    String id=request.getParameter("id");
		    RequestDispatcher rd=request.getRequestDispatcher("LoveCalulator.jsp");
		   request.setAttribute("id", id);
		   rd.include(request, response);
		cn.close();		 
		   }
		 catch(Exception e)
		 {e.printStackTrace();}
		
		 
	}

}
