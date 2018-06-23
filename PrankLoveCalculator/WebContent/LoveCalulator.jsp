<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import = "javax.servlet.RequestDispatcher" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="javax.xml.bind.DatatypeConverter"%>
<%@ page import="java.security.*"%>
<%!
String id=null;
%>
<%
id=(String)request.getAttribute("id");
%>

<!DOCTYPE HTML>
<html lang="en-US">
<head>
     <meta charset="utf-8">
	   <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
     <title>Love Calculator</title>
     <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
     <link rel="stylesheet" href="EditLoveCalculator/css.css" />

</head>
<body>
     <div class="container">
        <div class="row" >
            <div class="d-block mx-auto">
              <img src="EditLoveCalculator/icon.png" class="img-fulid d-block mx-auto img" alt="logo">
              <h3 class="d-block mx-auto icontext ">Love Calculator</h3>
            </div>
        </div>
     </div>
     <div class="modal-dialog modal-lg">
      <div class="modal-content" style="background-color:#2C3A47;">
         <div class="modal-body">
           <div class="text-center">
             <p class="informationText">Enter Your and your Crush's Full name and click Calculate Button. </p>
              <p class="informationText" style="color:white;">Note:Enter Your Crush/Partner according to your priority</p>
           </div>

             <form class="" action="./submit" name="fname" onsubmit="return valid()" method="post">
               <div class="form-group">
                  <input type="text" placeholder="Enter Your Full Name" class="form-control inputBox" name="UserName">
               </div>
               <div class="form-group">
                  <input type="text" placeholder="Enter Your Crush/Partner Name" class="form-control inputBox" name="FirstCrushName">
               </div>
               <div class="form-group">
                  <input type="text" placeholder="Enter Your Crush/Partner Name" class="form-control inputBox" name="SecondCrushName">
               </div>
               <div class="form-group">
                  <input type="text" placeholder="Enter Your Crush/Partner Name" class="form-control inputBox" name="ThirdCrushName">
               </div><br>
               <div class="form-group">
                  <input type="hidden" class="form-control inputBox" name="id" value="<%=id%>">
               </div>
               <div class="form-group">

                  <button type="submit"class="btn btn-outline-danger d-block mx-auto"><i class="fas fa-heart fa-lg"></i>  &nbspCalculate</button>
               </div>
             </form>

             <div class="text-center">
                   <p class="informationText" style="color:white;">Enter Your and your Crush's Full name and click Calculate Button. </p>
             </div>
         </div>
          <!--End of modal----------->

      </div>
    </div>
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.13/css/all.css">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/js/bootstrap.min.js"></script>
    <script src="EditLoveCalculator/js.js" type="text/javascript"></script>
</body>

</html>
