package Dao;

import Conexion.conexion;
import Modelo.Curso;
import Modelo.Matricula;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MatriculaDAO {

    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    // Método para obtener los cursos en los que un usuario está matriculado
    public List<Curso> obtenerCursosPorUsuario(int idUsuario) {
        List<Curso> cursos = new ArrayList<>();
        String sql = "SELECT c.* FROM cursos c "
                + "JOIN matriculas m ON c.id_curso = m.id_curso "
                + "WHERE m.id_usuario = ?";

        try {
            con = conexion.getInstancia().getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idUsuario);
            rs = ps.executeQuery();

            while (rs.next()) {
                Curso curso = new Curso();
                curso.setIdCurso(rs.getInt("id_curso"));
                curso.setNombreCurso(rs.getString("nombre_curso"));
                curso.setDescripcion(rs.getString("descripcion"));
                curso.setIdDocente(rs.getInt("id_docente"));
                curso.setFechaCreacion(rs.getString("fecha_creacion"));
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
                System.err.println("Error al cerrar recursos: " + e.getMessage());
            }
        }

        return cursos;
    }

    // Método para insertar una nueva matrícula
    public boolean insertarMatricula(Matricula matricula) {
        String sql = "INSERT INTO matriculas (id_usuario, id_curso) VALUES (?, ?)";
        try {
            con = conexion.getInstancia().getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, matricula.getIdUsuario());
            ps.setInt(2, matricula.getIdCurso());

            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            System.err.println("Error al insertar matrícula: " + e.getMessage());
            return false;
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                System.err.println("Error al cerrar recursos: " + e.getMessage());
            }
        }
    }
}
