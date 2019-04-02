<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <%@ include file="/WEB-INF/views/header1.jsp" %>
 
<style>
.centr {
    width: 400px;
    height: 400px;
   position: absolute;
    top:0;
    bottom: 0;
    left: 0;
    right: 0;
    border: 0px ;
	border-radius: 25px;
 background-color:#d4d8d6;
    margin: auto;
    
}

</style>
<script>
function precheck(){
	
	var usr=document.getElementById("login_id").value;
	var pwd=document.getElementById("login_password").value;
	
	if(usr=="" && pwd !="" ){
		$('#f1').show();
		$('#f2').hide();
		return false;
	
	}else if(pwd =="" && usr!=""){
		$('#f2').show();
		$('#f1').hide();
		return false;
	}
	else if(pwd =="" && usr==""){
		$('#f2').show();
		$('#f1').show();
		return false;
	}
	else if(pwd !="" && usr!=""){
		$('#f2').hide();
		$('#f1').hide();
		return true;
	}
	
	
	
}
</script>
</head>
<body>
 
<form:form id="loginform" method="POST" action="/sdnext/Login.html" onsubmit="return precheck()">
<div id="wrap">
<div class="container">
<div class="form-horizontal"  >
<div class="centr "  >

<div class="pagetitle h1  col-sm-12 text-center space-twenty"></div>
<div class="pagetitle h4  col-sm-12 text-center"><b>User Login</b></div>
<div class="pagetitle h1  col-sm-12 text-center space-twenty"></div>
<div class="pagetitle h1  col-sm-12 text-center space-twenty"></div>
<label class="control-label col-sm-4 col-lg-4 col-md-4 space-twenty" for="">User Name :</label>     
  <div class="form-group">
  
  <div class="col-sm-6 col-lg-6 col-md-6">
          <form:input class="form-control input-sm" id="login_id" path="login_id" /><p id="f1" style="display:none"><font color="red" >User Cannot Be Blank</font></p><br/><br/>
      </div>
      </div>
<label class="control-label col-sm-4 col-lg-4 col-md-4" for="">Password :</label> 
       <div class="form-group">
  
  <div class="col-sm-6 col-lg-6 col-md-6">
      
          <form:input class="form-control input-sm" id="login_password" type="password" path="login_password" /><p id="f2" style="display:none"> <font  color="red" > Password Cannot Be Blank</font></p><br/><br/>   
         </div>
      </div> 
      <div class="form-group">
  
  <div class="col-sm-12 col-lg-12 col-md-12 space-ten text-center">  
         <button class="btn btn-success" type="submit" >Submit</button>
         
         </div>
        </div>
        </div>
     </div>
        </div>
        </div>
</form:form>
</body>
</html>