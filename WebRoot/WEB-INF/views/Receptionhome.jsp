<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
 <%@ include file="/WEB-INF/views/header.jsp" %>

</head>
<body>

<nav class="navbar navbar-default" role = "navigation">
  
   
    <ul class="nav navbar-nav">
      <li ><a href="succeshome.html">Home</a></li>
      <li class="active"><a href="#">Reception home</a></li>
       <li class=""><a href="vistorsview.html">Visitor View</a></li>
      <li ><a href="admsnhome.html">Admission</a></li>
      
      
    </ul>
 
 </nav> 
<div id="wrap">
<div class="container">
<div class="form-horizontal"  >
<form:form id="Indentform" method="POST" action="/sdnext/recptAdd.html" >
<div class="pagetitle  col-sm-12 text-center space-ten">Reception Home</div>
<div class="form-group space-ten">
  <label class="control-label col-sm-2 col-lg-2 col-md-2" for="">Receptionist:</label>
				<div class="col-sm-2 col-lg-2 col-md-2">
			 <form:input class="form-control input-sm" id="recptnist_id" path="recptnist_id" />	
</div>
<label class="control-label col-sm-2 col-lg-2 col-md-2 " for="">Vistor Name</label> 
   <div class="col-sm-2 col-lg-2 col-md-2">
    <form:input class="form-control input-sm" id="visitor_name" path="visitor_name" />
   </div>
</div>

<div class="form-group space-ten">
  <label class="control-label col-sm-2 col-lg-2 col-md-2" for="">Visitor Detail:</label>
				<div class="col-sm-2 col-lg-2 col-md-2">
		 <form:input class="form-control input-sm" id="visitor_comm_details" path="visitor_comm_details" />		
</div>


<label class="control-label col-sm-2 col-lg-2 col-md-2" for="">Vist Date:</label>
				<div class="col-sm-2 col-lg-2 col-md-2">
				<div class="input-group date form_date" data-date="" data-date-format="yyyy/mm/dd hh:mm:ss" data-link-field="">
				<form:input class="form-control input-sm" type="text" name="visit_date" id="visit_date" path="visit_date" size="10" datepattern="yyyy/mm/dd hh:mm:ss" placeholder="" onchange="" />
				<span class="input-group-addon calander-blue"><span class="glyphicon glyphicon-th"></span></span>
				</div>
</div>

</div>

<div class="form-group space-ten">
  

   
   <label class="control-label col-sm-2 col-lg-2 col-md-2 " for="">Visit purpose</label> 
   <div class="col-sm-2 col-lg-2 col-md-2">
    <form:input class="form-control input-sm" id="visit_purpose" path="visit_purpose" />
   </div>
</div>

<div class="col-sm-12 col-lg-12 col-md-12 space-ten text-center">  
         <button class="btn btn-success" type="submit" >Submit</button>
         
         </div>

</form:form>

<link rel="stylesheet" href="${ctx}/resources/calendar/css/bootstrap-datetimepicker.css" type="text/css">
<script type="text/javascript" src="${ctx}/resources/calendar/js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
<script type="text/javascript" src="${ctx}/resources/calendar/js/locales/bootstrap-datetimepicker.fr.js" charset="UTF-8"></script>
<script type="text/javascript">
	
var d = new Date();
var month = d.getMonth()+1;
var day = d.getDate();
var year = d.getFullYear();
//var output = (month<10 ? '0' : '') + month + '/' + (day<10 ? '0' : '') + day + '/' + d.getFullYear();
//$("#paymentDate").val(output + "");
$('.form_date').datetimepicker({
  language: 'en',
  weekStart: 1,
  todayBtn:  1,
  autoclose: 1,
  todayHighlight: 1,
  startView: 2,
  minView: 2,
  forceParse: 0,
  format: "mm/dd/yyyy hh:mm:ss",
  
  //startDate: new Date(),	
  });

</script>
</div>
</div>
</div>
</body>
</html>