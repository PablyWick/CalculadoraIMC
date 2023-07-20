<!DOCTYPE html>
<html>
<head>
    <title>Registro de Usuario</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
    <div class="container">
        <h1>Registro de Usuario</h1>
        <form id="formulario" action="RegistroServlet" method="POST">
            <div class="form-group">
                <label for="nombreCompleto">Nombre Completo:</label>
                <input type="text" id="nombreCompleto" name="nombreCompleto" required>
            </div>
            <div class="form-group">
                <label for="edad">Edad:</label>
                <input type="number" id="edad" name="edad" min="15" required>
            </div>
            <div class="form-group">
                <label for="sexo">Sexo:</label>
                <select id="sexo" name="sexo" required>
                    <option value="Masculino">Masculino</option>
                    <option value="Femenino">Femenino</option>
                </select>
            </div>
            <div class="form-group">
                <label for="estatura">Estatura (m):</label>
                <input type="number" id="estatura" name="estatura" step="0.01" min="1" max="2.5" required>
            </div>
            <div class="form-group">
                <label for="nombreUsuario">Nombre de Usuario:</label>
                <input type="text" id="nombreUsuario" name="nombreUsuario" required>
            </div>
            <div class="form-group">
                <label for="contrasena">Contraseña:</label>
                <input type="password" id="contrasena" name="contrasena" required>
            </div>
            <button type="submit" class="button">Registrarse</button>
        </form>
    </div>
</body>
</html>
