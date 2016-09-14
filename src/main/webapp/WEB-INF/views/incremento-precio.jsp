<%@ include file="/WEB-INF/views/include.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title><fmt:message key="priceincrease.title" /></title>
<style>
.error {
	color: red;
}
</style>
</head>
<body>
	<h1>
		<fmt:message key="priceincrease.heading" />
	</h1>
	<form:form method="post" commandName="priceIncrease">
		<table>
			<tr>
				<td align="right" width="20%">
					<fmt:message key="increase" />
				</td>
				<td width="20%">
					<form:input path="porcentaje" />
				</td>
				<!-- checkBox -->
				<td >
					<form:checkbox path="confirmar" />
				</td>
				<td >
					<form:errors path="confirmar" cssClass="error" />
				</td>
				<td align="right" width="10%">
					<fmt:message key="conforme" />
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