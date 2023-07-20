<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Cálculo del IMC</title>
  <link rel="stylesheet" href="styles.css">
</head>
<body>
  <div class="container">
    <h1>Cálculo del IMC</h1>
    <form id="formulario">
      <div class="form-group">
        <label for="altura">Altura (m):</label>
        <input type="number" id="altura" step="0.01" required>
      </div>
      <div class="form-group">
        <label for="peso">Peso (kg):</label>
        <input type="number" id="peso" step="0.01" required>
      </div>
      <button type="submit" class="button">Calcular IMC</button>
    </form>
    <div id="resultado"></div>
  </div>
  <script src="script.js"></script>
</body>
</html>
