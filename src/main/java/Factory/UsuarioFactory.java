package Factory;

import Modelo.Usuario;

public class UsuarioFactory {

    public static Usuario crearUsuario(String tipo, String nombre, String apellido, String correo, String contrasena) {
        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setApellido(apellido);
        usuario.setCorreo(correo);
        usuario.setContraseña(contrasena);

        if ("estudiante".equalsIgnoreCase(tipo)) {
            usuario.setTipo("estudiante");
        } else if ("docente".equalsIgnoreCase(tipo)) {
            usuario.setTipo("docente");
        } else {
            throw new IllegalArgumentException("Tipo de usuario no válido");
        }

        return usuario;
    }
}
