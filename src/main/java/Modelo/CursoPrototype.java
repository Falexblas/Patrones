package Modelo;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CursoPrototype implements Cloneable {

    private JLabel lblNombreCurso;
    private JLabel lblDocente;
    private JLabel imgCurso; // Agregado para la imagen del curso
    private JPanel pnlCurso;

    public CursoPrototype(JLabel lblNombreCurso, JLabel lblDocente, JLabel imgCurso, JPanel pnlCurso) {
        this.lblNombreCurso = lblNombreCurso;
        this.lblDocente = lblDocente;
        this.imgCurso = imgCurso;
        this.pnlCurso = pnlCurso;
    }

    @Override
    public CursoPrototype clone() {
        try {
            return (CursoPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Error al clonar el prototipo del curso", e);
        }
    }

    // Getters y setters para los componentes
    public JLabel getLblNombreCurso() {
        return lblNombreCurso;
    }

    public void setLblNombreCurso(String nombreCurso) {
        this.lblNombreCurso.setText("Curso: " + nombreCurso);
    }

    public JLabel getLblDocente() {
        return lblDocente;
    }

    public void setLblDocente(String docente) {
        this.lblDocente.setText("Docente: " + docente);
    }

    public JLabel getImgCurso() {
        return imgCurso;
    }

    public void setImgCurso(String rutaImagen) {
        this.imgCurso.setIcon(new javax.swing.ImageIcon(rutaImagen));
    }

    public JPanel getPnlCurso() {
        return pnlCurso;
    }
}
