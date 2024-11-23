package Modelo;

public class Curso {

    private int idCurso;
    private String nombreCurso;
    private String descripcion;
    private int idDocente;
    private String fechaCreacion;

    public Curso() {
    }

    public Curso(int idCurso, String nombreCurso, String descripcion, int idDocente, String fechaCreacion) {
        this.idCurso = idCurso;
        this.nombreCurso = nombreCurso;
        this.descripcion = descripcion;
        this.idDocente = idDocente;
        this.fechaCreacion = fechaCreacion;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
