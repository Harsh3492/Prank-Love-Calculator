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
public class Login extends HttpServlet {
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Connection cn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		    cn=DriverManager.getConnection("jdbc:mysql://localhost/pranklovecalculator","root","12345");
		// End of Register Driver
		    PreparedStatement ps=null;
		    PreparedStatement psCount=null;
		    ResultSet rsCount=null;
		    String name=request.getParameter("name");
		    String email=request.getParameter("email");
		    //Code Generation
		    psCount=cn.prepareStatement("select count(*) from user");
		    rsCount=psCount.executeQuery();
		    rsCount.next();
		    int count=rsCount.getInt(1)+1;
	
		    String Code="KNLO"+count+"VEOWU";
		    //End of code Generetion
		    ps=cn.prepareStatement("insert into user values(?,?,?)");
		    ps.setString(1, name);
		    ps.setString(2,email);
		    ps.setString(3, Code);
		    ps.executeUpdate();
		   RequestDispatcher rd=request.getRequestDispatcher("LinkPage.jsp");
		   request.setAttribute("Code", Code);
		   rd.include(request, response);
		cn.close();		 
		   }
		 catch(Exception e)
		 {e.printStackTrace();}
		
		 
	}

}
