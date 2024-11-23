package Interfaces;

import Dao.usuarioDAO;
import Modelo.Usuario;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCorreo = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        btnIniciarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        iam = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnIniciarSesion.setText("INICIAR SESION");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        jLabel1.setText("CORREO:");

        jLabel2.setText("CONTRASEÑA:");

        iam.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alezxin\\Documents\\NetBeansProjects\\AprendizajeLinea\\src\\main\\java\\Imagenes\\login.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(157, 157, 157))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(iam)
                        .addGap(186, 186, 186))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(iam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(69, 69, 69)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        String correo = txtCorreo.getText();
        String contrasena = new String(txtContraseña.getPassword()); // Convertir el char[] a String

        // Verificar si los campos están vacíos
        if (correo.isEmpty() || contrasena.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Advertencia", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Crear una instancia del DAO
        usuarioDAO dao = new usuarioDAO();

        // Llamar al método verificarUsuario
        Usuario usuario = dao.verificarUsuario(correo, contrasena);

        if (usuario != null) {
            // Usuario válido
            javax.swing.JOptionPane.showMessageDialog(this, "¡Inicio de sesión exitoso!", "Éxito", javax.swing.JOptionPane.INFORMATION_MESSAGE);

            // Redirigir a la vista correspondiente pasando el objeto Usuario
            if (usuario.getTipo().equals("docente")) {
                VistaDocente vistaDocente = new VistaDocente(usuario); // Pasar el usuario al constructor
                vistaDocente.setVisible(true);
            } else if (usuario.getTipo().equals("estudiante")) {
                VistaAlumno vistaEstudiante = new VistaAlumno(usuario); // Pasar el usuario al constructor
                vistaEstudiante.setVisible(true);
            }

            this.dispose(); // Cerrar la ventana de login
        } else {
            // Usuario inválido
            javax.swing.JOptionPane.showMessageDialog(this, "Correo o contraseña incorrectos.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JLabel iam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}
