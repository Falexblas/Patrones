package Modelo;

public class Matricula {

    private int idMatricula;
    private int idUsuario;
    private int idCurso;
    private String fechaMatricula;

    public Matricula() {
    }

    public Matricula(int idMatricula, int idUsuario, int idCurso, String fechaMatricula) {
        this.idMatricula = idMatricula;
        this.idUsuario = idUsuario;
        this.idCurso = idCurso;
        this.fechaMatricula = fechaMatricula;
    }

    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(String fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }
}
