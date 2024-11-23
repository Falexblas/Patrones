package project.aprendizajelinea;

import Interfaces.Login;
import Interfaces.VistaAlumno;

public class AprendizajeLinea {

   public static void main(String[] args) {
        // Crear y mostrar la ventana de Login
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null); // Centrar la ventana
    }
}
