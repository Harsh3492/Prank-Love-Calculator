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
import com.knowuhub.prankCalulator.SendMail;
public class Submit extends HttpServlet {
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Connection cn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		    cn=DriverManager.getConnection("jdbc:mysql://localhost/pranklovecalculator","root","12345");
		// End of Register Driver
		    PreparedStatement ps=null;
		    ResultSet rs=null;
		   String UserName=request.getParameter("UserName");
		   String FirstCrushName=request.getParameter("FirstCrushName");
		   String SecondCrushName=request.getParameter("SecondCrushName");
		   String ThirdCrushName=request.getParameter("ThirdCrushName");
		   String Code=request.getParameter("id");
	
		   ps=cn.prepareStatement("select email from user where code='"+Code+"'");
		   rs=ps.executeQuery();
		   rs.next();
		   String to = rs.getString(1);
		   String subject = "Love Calculator Prank";
		   String msg="  <div style=\"box-sizing: border-box;\">\r\n" + 
		   		"  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" style=\"box-sizing: border-box;\">\r\n" + 
		   		"    <link href=\"https://fonts.googleapis.com/css?family=Questrial\" rel=\"stylesheet\" style=\"box-sizing: border-box;\">\r\n" + 
		   		"    <script defer src=\"https://use.fontawesome.com/releases/v5.0.7/js/all.js\" style=\"box-sizing: border-box;\"></script>\r\n" + 
		   		"\r\n" + 
		   		"    <div class=\"container\" style=\"box-sizing: border-box;width: 100%;padding-right: 15px;padding-left: 15px;margin-right: auto;margin-left: auto;min-width: 992px!important;\">\r\n" + 
		   		"      <div class=\"row text-center\" style=\"height: 115px;background-color: #20313D;box-sizing: border-box;display: flex;-ms-flex-wrap: wrap;flex-wrap: wrap;margin-right: -15px;margin-left: -15px;text-align: center!important;\">\r\n" + 
		   		"          <img src=\"https://image.ibb.co/bFGMNd/Logo_of_Love_Calculator.jpg\" style=\"width: 30%;box-sizing: border-box;vertical-align: middle;border-style: none;page-break-inside: avoid;max-width: 100%;height: auto;display: block!important;margin-right: auto!important;margin-left: auto!important;\" class=\"img-fluid d-block mx-auto \" alt=\"KnowUHub logo\">\r\n" + 
		   		"      </div>\r\n" + 
		   		"    </div><br style=\"box-sizing: border-box;\"><br style=\"box-sizing: border-box;\">\r\n" + 
		   		"    <div class=\"container\" style=\"box-sizing: border-box;width: 100%;padding-right: 15px;padding-left: 15px;margin-right: auto;margin-left: auto;min-width: 992px!important;\">\r\n" + 
		   		"      <div class=\"row \" style=\"box-sizing: border-box;display: flex;-ms-flex-wrap: wrap;flex-wrap: wrap;margin-right: -15px;margin-left: -15px;\">\r\n" + 
		   		"       <div class=\"text-center\" style=\"box-sizing: border-box;text-align: center!important;\">\r\n" + 
		   		"         <p style=\"font-family: 'Questrial', sans-serif;letter-spacing: 1px;font-size: 20px;box-sizing: border-box;margin-top: 0;margin-bottom: 1rem;orphans: 3;widows: 3;\">Hey <span style=\"color: #27ae60;box-sizing: border-box;\">"+UserName+"</span> become Fool.His/Her Crush Name is:</p>\r\n" + 
		   		"\r\n" + 
		   		"       </div>\r\n" + 
		   		"      </div>\r\n" + 
		   		"    </div>\r\n" + 
		   		"\r\n" + 
		   		"    <div class=\"container\" style=\"box-sizing: border-box;width: 100%;padding-right: 15px;padding-left: 15px;margin-right: auto;margin-left: auto;min-width: 992px!important;\">\r\n" + 
		   		"        <p style=\"font-family: 'Questrial', sans-serif;letter-spacing: 1px;font-size: 20px;box-sizing: border-box;margin-top: 0;margin-bottom: 1rem;orphans: 3;widows: 3;\">1. <span style=\"color: #e74c3c;box-sizing: border-box;\">"+FirstCrushName+"</span></p>\r\n" + 
		   		"         <p style=\"font-family: 'Questrial', sans-serif;letter-spacing: 1px;font-size: 20px;box-sizing: border-box;margin-top: 0;margin-bottom: 1rem;orphans: 3;widows: 3;\">2. <span style=\"color: #e74c3c;box-sizing: border-box;\">"+SecondCrushName+"</span></p>\r\n" + 
		   		"           <p style=\"font-family: 'Questrial', sans-serif;letter-spacing: 1px;font-size: 20px;box-sizing: border-box;margin-top: 0;margin-bottom: 1rem;orphans: 3;widows: 3;\">3. <span style=\"color: #e74c3c;box-sizing: border-box;\">"+ThirdCrushName+"</span></p>\r\n" + 
		   		"    </div>\r\n" + 
		   		"    <div class=\"text-center\" style=\"box-sizing: border-box;text-align: center!important;\">\r\n" + 
		   		"      <p style=\"font-family: 'Questrial', sans-serif;letter-spacing: 1px;font-size: 20px;box-sizing: border-box;margin-top: 0;margin-bottom: 1rem;orphans: 3;widows: 3;\">Thank You For Using Love Calculator(Prank).</p>\r\n" + 
		   		"\r\n" + 
		   		"    </div><br style=\"box-sizing: border-box;\"><br style=\"box-sizing: border-box;\">\r\n" + 
		   		"    <div class=\"container\" style=\"box-sizing: border-box;width: 100%;padding-right: 15px;padding-left: 15px;margin-right: auto;margin-left: auto;min-width: 992px!important;\">\r\n" + 
		   		"      <div class=\"row text-center\" style=\"height: 47px;background-color: #20313D;box-sizing: border-box;display: flex;-ms-flex-wrap: wrap;flex-wrap: wrap;margin-right: -15px;margin-left: -15px;text-align: center!important;\">\r\n" + 
		   		"          <div class=\"d-block mx-auto text-center\" style=\"box-sizing: border-box;display: block!important;margin-right: auto!important;margin-left: auto!important;text-align: center!important;\">\r\n" + 
		   		"            <a href=\"https://www.facebook.com/KnowUHub/\" class=\"btn btn-dark btn-lg\" style=\"background-color: #4267B2;font-family: 'Questrial', sans-serif;text-align: center;box-sizing: border-box;color: #fff;text-decoration: none;-webkit-text-decoration-skip: objects;display: inline-block;font-weight: 400;white-space: nowrap;vertical-align: middle;-webkit-user-select: none;-moz-user-select: none;-ms-user-select: none;user-select: none;border: 1px solid transparent;padding: .5rem 1rem;font-size: 1.25rem;line-height: 1.5;border-radius: .3rem;transition: color .15s ease-in-out,background-color .15s ease-in-out,border-color .15s ease-in-out,box-shadow .15s ease-in-out;border-color: #343a40;\" name=\"button\"> <span style=\"text-align: center;box-sizing: border-box;\">Follow Us on</span> <i class=\"fab fa-facebook-square fa-lg\" style=\"box-sizing: border-box;\"></i></a>\r\n" + 
		   		"          </div>\r\n" + 
		   		"      </div>\r\n" + 
		   		"    </div>\r\n" + 
		   		"\r\n" + 
		   		"\r\n" + 
		   		"    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" style=\"box-sizing: border-box;\"></script>\r\n" + 
		   		"       <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" style=\"box-sizing: border-box;\"></script>\r\n" + 
		   		"       <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\" style=\"box-sizing: border-box;\"></script>\r\n" + 
		   		"  </div>";
		   String id="lovecaculatorprank@gmail.com";
		   String pwd="9838602164";
		    SendMail.send(to,subject,msg,id,pwd);
		   response.sendRedirect("Fool.html");
		   
		cn.close();		 
		   }
		 catch(Exception e)
		 {e.printStackTrace();}
		
		 
	}

}
