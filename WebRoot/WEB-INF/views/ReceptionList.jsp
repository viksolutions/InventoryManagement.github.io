<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Indent View</title>
<%@ include file="/WEB-INF/views/header.jsp" %>
</head>
<body>
 
   <nav class="navbar navbar-default" role = "navigation">
 
    <ul class="nav navbar-nav">
      <li ><a href="succeshome.html">Home</a></li>
      <li ><a href="recptnhome.html">Reception Home</a></li>
      <li class="active"><a href="#">Visitors View</a></li>
      
      
    </ul>
 
  </nav>
   
<div class="pagetitle h4notuse col-sm-12 text-center">Reception list </div>
<script>
$(document).ready(function() {
$('#recptview').DataTable({
"responsive": true,
"paging":   false,  //paging 1 2 3
"ordering": false,  // sorting
"info":     false,  // showin data count
"searching": false, //search hide
});
$('#recptview').DataTable();


});


				</script>

<c:if test="${!empty receptview}">
	 <table id="recptview" class="table display row-border hover order-column table-striped" cellspacing="0" width="100%">
		 <thead>
		<tr>
		<th>Visit ID</th> 
			<th>Visitor Name</th> 
			<th>Visited Date</th> 
			<th>Visit purpose</th>
			<th>Visit Address</th> 
		
		</tr>
</thead>
		<tbody>
		<c:forEach items="${receptview}" var="receptview">
			<tr>
			<td><c:out value="${receptview.recp_id}"/></td> 
			<td><c:out value="${receptview.visitor_name}"/></td>
			<td><c:out value="${receptview.visit_date}"/></td>
			<td><c:out value="${receptview.visit_purpose}"/></td> 
			<td><c:out value="${receptview.visitor_comm_details}"/></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</c:if>

</body>
</html>