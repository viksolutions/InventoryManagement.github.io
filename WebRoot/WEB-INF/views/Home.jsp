
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <%@ include file="/WEB-INF/views/header1.jsp" %>
 
</head>
<title>Insert title here</title>
 <body>

        <div class="container">
         <div class="form-horizontal">
       
         <div class="pagetitle h4notuse col-sm-12 text-center">Home</div>
        
   
   <div class="row">
  <div class="form-group"> 
  <div class="col-lg-10 col-md-10 col-sm-10 " >
  <h2 ><a class="pull-right" href="ShowLogin.html" style="font-size: 20px">Login</a></h2>
  </div>
  </div>
  </div>
  <div class="row"> 
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
     
        <img src="${pageContext.request.contextPath}/resources/image/Home.png" alt="Los Angeles" style="width:100%;">
      </div>

      <div class="item">
        <img src="${pageContext.request.contextPath}/resources/image/Wild-at-Heart.jpg" alt="Chicago" style="width:100%;">
      </div>
    
      <div class="item">
        <img src="${pageContext.request.contextPath}/resources/image/wp-about-us.jpg" alt="New york" style="width:100%;">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
  </div>
  
  
</div>  
</div>
</body>
</html>