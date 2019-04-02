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
      <li ><a href="admsnhome.html">Admission Home</a></li>
      <li class="active"><a href="#">Admission View</a></li>
      
      
    </ul>
 
  </nav>
   
<div class="pagetitle h4notuse col-sm-12 text-center">Admitted list </div>
<script>
$(document).ready(function() {
$('#admisionview').DataTable({
"responsive": true,
"paging":   false,  //paging 1 2 3
"ordering": false,  // sorting
"info":     false,  // showin data count
"searching": false, //search hide
});
$('#admisionview').DataTable();


});


				</script>

<c:if test="${!empty admisnview}">
	 <table id="admisionview" class="table display row-border hover order-column table-striped" cellspacing="0" width="100%">
		 <thead>
		<tr>
		<th>Admission ID</th> 
			<th>Patient Name</th> 
			<th>Admitted By</th> 
			<th>Admitted Date</th>
			<th>Admitted Type</th>
			<th>Admitted Bed</th>
			<th>Admission Status</th> 
		
		</tr>
</thead>
		<tbody>
		<c:forEach items="${admisnview}" var="admisnview">
			<tr>
			<td><c:out value="${admisnview.admsn_id}"/></td> 
			<td><c:out value="${admisnview.admsn_pat_id}"/></td>
			<td><c:out value="${admisnview.admsn_by}"/></td>
			<td><c:out value="${admisnview.admsn_date}"/></td> 
			<td><c:out value="${admisnview.admsn_type}"/></td>
			<td><c:out value="${admisnview.admsn_bed}"/></td>
			<td><c:out value="${admisnview.admsn_flg}"/></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</c:if>

</body>
</html>