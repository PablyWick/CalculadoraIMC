<!DOCTYPE html>
<html>
<head>
    <title>Historial de C�lculos de IMC</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
    <div class="container">
        <h1>Historial de C�lculos de IMC</h1>
        <table>
            <thead>
                <tr>
                    <th>Fecha</th>
                    <th>IMC</th>
                </tr>
            </thead>
            <tbody>
                <%-- Aqu� insertaremos los registros de c�lculos de IMC --%>
                <c:forEach var="registro" items="${historial}">
                    <tr>
                        <td>${registro.fecha}</td>
                        <td>${registro.imc}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <a href="calcular_imc.jsp">Calcular IMC</a>
        <a href="logout">Cerrar Sesi�n</a>
    </div>
</body>
</html>

