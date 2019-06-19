<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="fr" %>
<html>
<body>
	<h3>Student-Entry-Form</h3>
	
		<fr:form action="savestudentchanges" modelAttribute="student">
			<pre>
			RollNo	<fr:input path="rno"/>
			SName	<fr:input path="name"/>
			Branch	<fr:input path="branch"/>
			Semestr	<fr:input path="sem"/>
				<input type="submit" value="SaveChanges"/>
		</pre>				
		</fr:form>
</body>
</html>