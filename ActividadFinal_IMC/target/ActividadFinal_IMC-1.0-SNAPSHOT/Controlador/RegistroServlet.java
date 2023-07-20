package Controlador;
import Modelo.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/registro")
public class RegistroServlet extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombreCompleto = request.getParameter("nombreCompleto");
        int edad = Integer.parseInt(request.getParameter("edad"));
        String sexo = request.getParameter("sexo");
        double estatura = Double.parseDouble(request.getParameter("estatura"));
        String nombreUsuario = request.getParameter("nombreUsuario");
        String contrasena = request.getParameter("contrasena");

        if (nombreCompleto.isEmpty() || sexo.isEmpty() || nombreUsuario.isEmpty() || contrasena.isEmpty()) {
            request.setAttribute("mensaje", "Todos los campos son obligatorios");
            request.getRequestDispatcher("registro.jsp").forward(request, response);
            return;
        }

        if (edad < 15) {
            request.setAttribute("mensaje", "La edad mínima permitida es 15 años");
            request.getRequestDispatcher("registro.jsp").forward(request, response);
            return;
        }

        if (estatura < 1 || estatura > 2.5) {
            // Si la estatura está fuera del rango, mostrar mensaje de error
            request.setAttribute("mensaje", "La estatura debe estar entre 1 y 2.5 metros");
            request.getRequestDispatcher("registro.jsp").forward(request, response);
            return;
        }

        response.sendRedirect("exito.jsp");
    }
}
