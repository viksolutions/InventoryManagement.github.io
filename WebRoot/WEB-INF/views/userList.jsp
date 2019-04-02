<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>All Users</title>
</head>
<body>
<h1>List Users</h1>


<c:if test="${!empty usersss}">
	<table align="left" border="1">
		<tr>
			<th>Employee ID</th> 
			<th>User Pwd</th>
			
		</tr>

		<c:forEach items="${usersss}" var="userss">
			<tr>
				<td><c:out value="${userss.login_id}"/></td> 
				<td><c:out value="${userss.login_password}"/></td>
				
			</tr>
		</c:forEach>
	</table>
</c:if>
</body>
</html>