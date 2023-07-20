
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HistoricoIMC {
    private int id;
    private String fecha;
    private double imc;
    private String nombreUsuario;

    // Constructor vacío
    public HistoricoIMC() {}

    // Constructor con parámetros
    public HistoricoIMC(int id, String fecha, double imc, String nombreUsuario) {
        this.id = id;
        this.fecha = fecha;
        this.imc = imc;
        this.nombreUsuario = nombreUsuario;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    // Métodos para interactuar con la base de datos

    // Método para obtener el historial de cálculos de un usuario específico
    public static List<HistoricoIMC> obtenerHistorialPorUsuario(String nombreUsuario) {
        List<HistoricoIMC> historial = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = ConexionDB.obtenerConexion();
            String query = "SELECT id, fecha, imc, nombre_usuario FROM historico_imc WHERE nombre_usuario = ?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, nombreUsuario);
            rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String fecha = rs.getString("fecha");
                double imc = rs.getDouble("imc");
                String usuario = rs.getString("nombre_usuario");

                HistoricoIMC registro = new HistoricoIMC(id, fecha, imc, usuario);
                historial.add(registro);
            }
        } catch (SQLException e) {
        } finally {
            ConexionDB.cerrarRecursos(conn, stmt, rs);
        }

        return historial;
    }

    // Método para guardar un nuevo registro de cálculo de IMC en la base de datos
    public static boolean guardarRegistroHistorico(HistoricoIMC registro) {
        boolean exito = false;
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = ConexionDB.obtenerConexion();
            String query = "INSERT INTO historico_imc (fecha, imc, nombre_usuario) VALUES (?, ?, ?)";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, registro.getFecha());
            stmt.setDouble(2, registro.getImc());
            stmt.setString(3, registro.getNombreUsuario());
            stmt.executeUpdate();
            exito = true;
        } catch (SQLException e) {
        } finally {
            ConexionDB.cerrarRecursos(conn, stmt);
        }

        return exito;
    }
}
