const formulario = document.getElementById('formulario');
const resultado = document.getElementById('resultado');

function calcularIMC(event) {
  event.preventDefault();

  const altura = parseFloat(document.getElementById('altura').value);
  const peso = parseFloat(document.getElementById('peso').value);

  const imc = peso / (altura ** 2);

  resultado.textContent = `Tu IMC es: ${imc.toFixed(2)}`;

  formulario.reset();
}

formulario.addEventListener('submit', calcularIMC);

