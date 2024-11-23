package Interfaces;

import Dao.MatriculaDAO;
import Dao.cursoDAO;
import Modelo.Curso;

import Modelo.Usuario;
import java.util.List;

public class VistaAlumno extends javax.swing.JFrame {

    private Usuario usuario;

    public VistaAlumno(Usuario usuario) {
        initComponents();

        this.usuario = usuario;

        cargarCursos();

        if (usuario != null) {
            lblNombre.setText(usuario.getNombre() + " " + usuario.getApellido());
        } else {
            System.err.println("Error: El usuario es null.");
        }
    }

    private void cargarCursos() {
        try {
            MatriculaDAO matriculaDAO = new MatriculaDAO(); 
            
            List<Curso> cursos = matriculaDAO.obtenerCursosPorUsuario(usuario.getIdUsuario());

            pnlCursos.setLayout(new javax.swing.BoxLayout(pnlCursos, javax.swing.BoxLayout.Y_AXIS)); // Layout vertical
            pnlCursos.removeAll(); 

            // Iterar sobre los cursos y mostrarlos en la interfaz
            for (Curso curso : cursos) {
                // Crear una instancia del panel del curso
                Interfaces.Curso panelCurso = new Interfaces.Curso();

                // Personalizar los datos del curso
                panelCurso.setNombreCurso(curso.getNombreCurso());
                panelCurso.setDocente(String.valueOf(curso.getIdDocente())); // Convertir int a String
                panelCurso.setImagenCurso("C:\\Users\\Alezxin\\Documents\\NetBeansProjects\\AprendizajeLinea\\src\\main\\java\\Imagenes\\curso.jpg"); // Ruta de la imagen

                
                pnlCursos.add(panelCurso);
            }

           
            pnlCursos.revalidate();
            pnlCursos.repaint();

        } catch (Exception e) {
            System.err.println("Error al cargar los cursos: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        pnlCursos = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Hola,");

        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("---");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(1249, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNombre)
                .addGap(151, 151, 151))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblNombre))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlCursosLayout = new javax.swing.GroupLayout(pnlCursos);
        pnlCursos.setLayout(pnlCursosLayout);
        pnlCursosLayout.setHorizontalGroup(
            pnlCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1411, Short.MAX_VALUE)
        );
        pnlCursosLayout.setVerticalGroup(
            pnlCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 646, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(pnlCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPanel pnlCursos;
    // End of variables declaration//GEN-END:variables
}
