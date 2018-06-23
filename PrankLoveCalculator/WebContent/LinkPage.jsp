<!DOCTYPE HTML>
<html lang="en-US">
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import = "javax.servlet.RequestDispatcher" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="javax.xml.bind.DatatypeConverter"%>
<%@ page import="java.security.*"%>
<%!
String code=null;
%>
<%
code=(String)request.getAttribute("Code");
%>
<head>
     <meta charset="utf-8">
	   <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
     <title>Love Calculator</title>
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
     <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
     <link rel="stylesheet" href="EditLinkPage/css.css" />

</head>
<body>
  <div class="modal-dialog modal-lg">
   <div class="modal-content" style="background-color:#29212100;">
      <div class="modal-body">
                        <div class="text-center">
                          <h3 style="color:#2c3e50;">Love Calculator <span style="color:#e74c3c;">(Prank)</span></h3>
                        </div><br>
                      <div class="text-justify">
                        <h4 class="headingtxt">This is your Love calculator link :</h4>
                      </div>
                      <div class="form-group">
                          <input type="text" class="form-control inputBox" id="linkText" value="www.knowuhub.com/lovecalculator/calculate?id=<%=code %>">
                      </div>
                         <div class="form-group">
                             <button type="button" class="btn btn-outline-danger" onclick="copyText()" name="button">Copy text</button>
                         </div>
                         <div class="">
                           <p class="shareTxt">Share your link on facebook and WhatsApp to know their crush names </p>
                         </div>
                         <hr class="line">
                         <a href="#" class="btn btn-lg btn-outline-dark d-block mx-auto">Back to Home</a>
         </div>
       <!--End of modal----------->

   </div>
 </div>
     <script type="text/javascript">
       function copyText() {
         var copyText = document.getElementById("linkText");
          copyText.select();
           document.execCommand("copy");
           alert("Link Copied");
       }
     </script>
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/js/bootstrap.min.js"></script>
    <script src="EditLinkPage/js.js" type="text/javascript"></script>
</body>

</html>
