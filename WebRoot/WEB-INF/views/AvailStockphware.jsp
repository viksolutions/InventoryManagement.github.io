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
      <li class="active"><a href="#">WareHouse</a></li>
      <li><a href="#">Departments</a></li>
      
      
    </ul>
 
 </nav> 
<div id="wrap">
<div class="container">
<div class="form-horizontal"  >

<div class="pagetitle  col-sm-12 text-center space-ten">Waraehouse Available Stock </div>



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
			

<c:if test="${!empty availstk_pharWH}">
	 <table id="IndentItems" class="table display row-border hover order-column table-striped" cellspacing="0" width="100%">
		 <thead>
		<tr>
		
			<th>Item Name</th> 
			<th>Item Quantity</th> 
		
			<th> Department</th> 
		
		</tr>
</thead>
		<tbody>
		<c:forEach items="${availstk_pharWH}" var="availstk_phar">
			<tr>
			<td><c:out value="${availstk_phar.item_name}"/></td>
			<td><c:out value="${availstk_phar.ind_quantity}"/></td>
			<td><c:out value="${availstk_phar.to_dept_name}"/></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</c:if>
</div>
</div>
</div>
</body>
</html>