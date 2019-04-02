<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
      
    </ul>
 
  </nav>
 <div class="pagetitle h4notuse col-sm-12 text-center space-twenty">Approvals </div>
<form:form method="POST" >
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
			
<c:if test="${!empty approvalview}">
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
		
		<c:forEach items="${approvalview}" var="approvalv">
			<tr>
			<td><c:out value="${approvalv.ind_id}"/></td> 
			<td><c:out value="${approvalv.item_name}"/></td>
			<td><c:out value="${approvalv.ind_quantity}"/></td>
			<td><c:out value="${approvalv.from_dept_name}"/></td> 
				<td><c:out value="${approvalv.to_dept_name}"/></td>
				<td><c:out value="${approvalv.ind_date}"/></td> 
				<td> <a href="approve.html?ind_id=${approvalv.ind_id}">Approve</a> </td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</c:if>
</form:form>

</body>
</html>