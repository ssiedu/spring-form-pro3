<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h3>List-of-Students-Using-JSTL</h3>
<hr>
	<table border="2">
	
	<tr>
		<th>RollNo</th><th>Name</th><th>Branch</th><th>Sem</th>
	<tr>
	<c:forEach var="student" items="${students}">
		<tr>
			<td>${student.rno}</td>
			<td>${student.name}</td>
			<td>${student.branch}</td>
			<td>${student.sem}</td>
			<td><a href="removestudent?id=${student.rno}">[X]</a></td>
			<td><a href="updatestudent?id=${student.rno}">Change</a></td>
		</tr>
	</c:forEach>
	</table>


<hr>
</body>
</html>