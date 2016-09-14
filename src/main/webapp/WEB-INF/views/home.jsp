<%@ include file="/WEB-INF/views/include.jsp" %>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<h2><a href="info">Datos Request 'info'</a></h2>

<h2><a href="inventario">Ver inventario</a></h2>

<h3><a href="personas">Ver Personas</a></h3>

<h3><a href="<c:url value="insertar-persona.html"/>">Insertar Persona</a></h3>

<!-- Aqui redirigimos a un controlador 'incremento-precio.html': -->
<h3><a href="<c:url value="incremento-precio.html"/>">INCREMENTO DE PRECIO</a></h3>
<!--incremento-precio.html es un @RequestMapping(value = "") que se encuentra en el controlador PriceIncreaseFormController -->

<ul>
<li>IP:${requestIP}</li>
<li>UserAgent:${requestUA}</li>
</ul>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
