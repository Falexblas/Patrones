package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexion {

    private static conexion instancia;
    private Connection conectar;

    private String usuario = "root";
    private String pass = "1234";
    private String bd = "PlataformaAprendizaje";
    private String ip = "127.0.0.1";
    private String puerto = "3306";

    private String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;

    private conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, pass);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se conectó a la BD: " + e.toString());
        }
    }

    public static conexion getInstancia() {
        if (instancia == null) {
            instancia = new conexion();
        }
        return instancia;
    }

    public Connection getConexion() {
        return conectar;
    }

    public void cerrarConexion() {
        try {
            if (conectar != null && !conectar.isClosed()) {
                conectar.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo cerrar la conexión");
        }
    }
}
