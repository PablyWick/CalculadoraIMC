package Modelo;
public class Usuario {
    private String nombreCompleto;
    private int edad;
    private String sexo;
    private double estatura;
    private String nombreUsuario;
    private String contrasena;

    // Constructor
    public Usuario(String nombreCompleto, int edad, String sexo, double estatura, String nombreUsuario, String contrasena) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.sexo = sexo;
        this.estatura = estatura;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    // Getters y Setters
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public double calcularIMC(double peso) {
        double imc = peso / (estatura * estatura);
        return imc;
    }

    public void cambiarContrasena(String nuevaContrasena) {
        this.contrasena = nuevaContrasena;
    }
}
