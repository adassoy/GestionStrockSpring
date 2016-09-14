<%@ include file="/WEB-INF/views/include.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title><fmt:message key="insertPersona.title" /></title>
<style>
.error {
	color: red;
}
</style>
</head>
<body>
	<h1>
		<fmt:message key="insertPersona.heading" />
	</h1>
	<form:form method="post" commandName="isertarPersona">
		<table>
			<tr>
				<td>
					<fmt:message key="nombre" />
				</td>
				<td>
					<form:input path="nombre" />
				</td>
				<td>
					<fmt:message key="edad" />
				</td>
				<td >
					<form:input path="edad" />
				</td>
				<td >
					<form:errors path="" cssClass="error" />
				</td>
				
				
				<td width="60%"><form:errors path="porcentaje" cssClass="error" />
				</td>
			</tr>
		</table>
		<br>
		<input type="submit" value="Ejecutar">
	</form:form>
	<a href="<c:url value="hello.htm"/>">Home</a>
</body>
</html>