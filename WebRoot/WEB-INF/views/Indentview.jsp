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
      <li ><a href="indhome.html">IndentHome</a></li>
      <li class="active"><a href="#">Indent View</a></li>
      
      
    </ul>
 
  </nav>
   
<div class="pagetitle h4notuse col-sm-12 text-center">Open Indent </div>
<script>
$(document).ready(function() {
$('#IndentItems').DataTable({
"responsive": true,
"paging":   false,  //paging 1 2 3
"ordering": false,  // sorting
"info":     false,  // showin data count
"searching": false, //search hide
});
$('#IndentItems').DataTable();


});


				</script>

<c:if test="${!empty indentview}">
	 <table id="IndentItems" class="table display row-border hover order-column table-striped" cellspacing="0" width="100%">
		 <thead>
		<tr>
		<th>Indent ID</th> 
			<th>Item Name</th> 
			<th>Item Quantity</th> 
			<th>From Department</th>
			<th>To Department</th> 
			<th>Indent Date</th> 
			<th>Action</th>
		</tr>
</thead>
		<tbody>
		<c:forEach items="${indentview}" var="indentview">
			<tr>
			<td><c:out value="${indentview.ind_id}"/></td> 
			<td><c:out value="${indentview.item_name}"/></td>
			<td><c:out value="${indentview.ind_quantity}"/></td>
			<td><c:out value="${indentview.from_dept_name}"/></td> 
				<td><c:out value="${indentview.to_dept_name}"/></td>
				<td><c:out value="${indentview.ind_date}"/></td> 
					<td> <a href="toapprove.html?ind_id=${indentview.ind_id}">Submit For Approval</a> </td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</c:if>

<script>
$(document).ready(function() {
$('#IndentItems').DataTable({
"responsive": true,
"paging":   false,  //paging 1 2 3
"ordering": false,  // sorting
"info":     false,  // showin data count
"searching": false, //search hide
});
$('#IndentItems').DataTable();


});


				</script>
				<div class="pagetitle h4notuse col-sm-12 text-center space-twenty">Receive Indent </div>

<c:if test="${!empty indentview1}">
	 <table id="IndentItems" class="table display row-border hover order-column table-striped" cellspacing="0" width="100%">
		 <thead>
		<tr>
		<th>Indent ID</th> 
			<th>Item Name</th> 
			<th>Item Quantity</th> 
			<th>From Department</th>
			<th>To Department</th> 
			<th>Indent Date</th> 
			<th>Action </th>
		</tr>
</thead>
		<tbody>
		<c:forEach items="${indentview1}" var="indentview1">
			<tr>
			<td><c:out value="${indentview1.ind_id}"/></td> 
			<td><c:out value="${indentview1.item_name}"/></td>
			<td><c:out value="${indentview1.ind_quantity}"/></td>
			<td><c:out value="${indentview1.from_dept_name}"/></td> 
				<td><c:out value="${indentview1.to_dept_name}"/></td>
				<td><c:out value="${indentview1.ind_date}"/></td> 
					<td> <a href="recive.html?ind_id=${indentview1.ind_id}">Receive</a> </td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</c:if>
</body>
</html>