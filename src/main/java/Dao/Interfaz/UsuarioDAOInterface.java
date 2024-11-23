
package Dao.Interfaz;

import Modelo.Usuario;


public interface UsuarioDAOInterface {
    Usuario verificarUsuario(String correo, String contrasena);
}
