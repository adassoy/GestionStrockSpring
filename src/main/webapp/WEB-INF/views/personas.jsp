<%@ include file="/WEB-INF/views/include.jsp" %>

<html>
  <head><title><fmt:message key="titulo_personas"/></title></head>
  <body>
    <h1><fmt:message key="heading_personas"/></h1>
    <p><fmt:message key="greeting"/> <c:out value="${fecha}"/></p>
    <h3><fmt:message key="personas.h1"/></h3>
    <c:forEach items="${personas}" var="per">
      <c:out value="${per.nombre}"/> <br><br>
      <c:out value="${per.edad}"/> <br><br>      
    </c:forEach>
    
  </body>
</html>