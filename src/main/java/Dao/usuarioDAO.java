package Dao;

import Conexion.conexion;
import Dao.Interfaz.UsuarioDAOInterface;
import Factory.UsuarioFactory;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class usuarioDAO implements UsuarioDAOInterface {

    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    @Override
    public Usuario verificarUsuario(String correo, String contrasena) {
        Usuario usuario = null;
        String sql = "SELECT * FROM usuarios WHERE correo = ?";

        try {
            // Conexión desde el Singleton
            con = conexion.getInstancia().getConexion();

            ps = con.prepareStatement(sql);
            ps.setString(1, correo);
            rs = ps.executeQuery();

            if (rs.next()) {
                String contrasenaGuardada = rs.getString("contraseña");

                if (contrasena.equals(contrasenaGuardada)) {
                    // Crear usuario utilizando Factory
                    usuario = UsuarioFactory.crearUsuario(
                            rs.getString("tipo"),
                            rs.getString("nombre"),
                            rs.getString("apellido"),
                            rs.getString("correo"),
                            contrasenaGuardada
                    );
                    usuario.setIdUsuario(rs.getInt("id_usuario"));
                } else {
                    System.err.println("Contraseña incorrecta.");
                }
            } else {
                System.err.println("Usuario no encontrado.");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error durante la verificación del usuario: " + e.getMessage());
        }

        // No cerramos la conexión aquí para evitar que se cierre antes de tiempo
        return usuario;
    }
}
