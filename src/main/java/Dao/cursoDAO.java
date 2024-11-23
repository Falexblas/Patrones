package Dao;

import Conexion.conexion;
import Modelo.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class cursoDAO {

    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    public List<Curso> obtenerCursos() {
        List<Curso> cursos = new ArrayList<>();
        // No cerramos la conexión prematuramente
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = conexion.getInstancia().getConexion(); // Obtener la conexión del Singleton

            // Asegúrate de que la conexión está abierta antes de realizar la consulta
            if (conn == null || conn.isClosed()) {
                throw new SQLException("La conexión a la base de datos no está disponible.");
            }

            String query = "SELECT * FROM cursos";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                Curso curso = new Curso();
                curso.setIdCurso(rs.getInt("id_curso"));  // Nombre de la columna en la base de datos
                curso.setNombreCurso(rs.getString("nombre_curso"));  // Nombre de la columna en la base de datos
                curso.setDescripcion(rs.getString("descripcion"));
                curso.setIdDocente(rs.getInt("id_docente"));  // Nombre de la columna en la base de datos
                curso.setFechaCreacion(rs.getString("fecha_creacion"));  // Nombre de la columna en la base de datos
                cursos.add(curso);
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener los cursos: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                System.err.println("Error al cerrar los recursos: " + e.getMessage());
            }
        }

        return cursos;
    }

}
