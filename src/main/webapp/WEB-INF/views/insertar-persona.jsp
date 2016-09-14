<%@ include file="/WEB-INF/views/include.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title>titulo</title>
<style>
.error {
	color: red;
}
</style>
</head>
<body>
	<h1>
		Insertar persona
	</h1>
	<form:form method="post" commandName="persona">
		<table>
			<tr>
				<td>
					<fmt:message key="nombre" />
				</td>
				<td>
					<form:input path="nombre" />
				</td>
				<td >
					<form:errors path="nombre" cssClass="error" />
				</td>
			</tr>
			<tr>
				<td>
					<fmt:message key="edad"/>
				</td>				
				<td >
					<form:input path="edad"/>
				</td>
				<td >
					<form:errors path="edad" cssClass="error" />
				</td>
				
							
			</tr>
		</table>
		<br>
		<input type="submit" value="Ejecutar">
	</form:form>
	
</body>
</html>