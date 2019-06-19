<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="fr" %>
<html>
<body>
	<h3>Student-Entry-Form</h3>
	
		<fr:form action="savestudent" modelAttribute="studentModel">
			<pre>
			RollNo	<fr:input path="rno"/>
			SName	<fr:input path="name"/>
			Branch	<fr:radiobuttons path="branch" items="${branchvalues}" />
			Semestr	<fr:select path="sem" items="${semestervalues}"/>
				<input type="submit" value="SaveRecord"/>
		</pre>				
		</fr:form>
</body>
</html>