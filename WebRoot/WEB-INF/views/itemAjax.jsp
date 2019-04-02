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
 <%@ include file="/WEB-INF/views/header.jsp" %>

</head>
<form:form>
//private int item_id;
private String item_name;
private int item_type;
private int item_dept;
private int item_org;
private int item_status;//

<div class="pagetitle h4notuse col-sm-12 text-center">Item List</div>
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

<c:if test="${!empty itemAjax}">
	 <table id="IndentItems" class="table display row-border hover order-column table-striped" cellspacing="0" width="100%">
		 <thead>
		<tr>
		<th>Item ID</th> 
			<th>Item Name</th> 
			<th>Item Status</th> 
						
		</tr>
</thead>
		<tbody>
		<c:forEach items="${itemAjax}" var="itemAjax">
			<tr>
			<td><c:out value="${itemAjax.item_id}"/></td> 
			<td><c:out value="${itemAjax.item_name}"/></td>
			<td><c:out value="${itemAjax.item_status}"/></td>
			
				
			</tr>
		</c:forEach>
		</tbody>
	</table>
</c:if>


</form:form>

</body>
</html>