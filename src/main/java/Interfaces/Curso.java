package Interfaces;

public class Curso extends javax.swing.JPanel {

    public Curso() {
        initComponents();
    }

    // Método para establecer el nombre del curso
    public void setNombreCurso(String nombre) {
        lblCurso.setText(nombre);
    }

// Método para establecer el nombre del docente
    public void setDocente(String docente) {
        lblDocente.setText(docente);
    }

// Método para establecer la imagen del curso
    public void setImagenCurso(String rutaImagen) {
        imgCurso.setIcon(new javax.swing.ImageIcon(rutaImagen));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCurso = new javax.swing.JLabel();
        lblDocente = new javax.swing.JLabel();
        imgCurso = new javax.swing.JLabel();

        jLabel1.setText("CURSO");

        jLabel2.setText("DOCENTE");

        lblCurso.setText("---");

        lblDocente.setText("---");

        imgCurso.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alezxin\\Documents\\NetBeansProjects\\AprendizajeLinea\\src\\main\\java\\Imagenes\\curso.jpg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDocente))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel1)
                            .addGap(38, 38, 38)
                            .addComponent(lblCurso)))
                    .addComponent(imgCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(imgCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblCurso))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblDocente))
                .addGap(84, 84, 84))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblDocente;
    // End of variables declaration//GEN-END:variables
}
