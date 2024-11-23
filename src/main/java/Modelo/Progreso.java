package Modelo;

public class Progreso {

    private int idProgreso;
    private int idUsuario;
    private int idCurso;
    private int idLeccion;
    private boolean completado;
    private String fechaActualizacion;

    public Progreso() {
    }

    public Progreso(int idProgreso, int idUsuario, int idCurso, int idLeccion, boolean completado, String fechaActualizacion) {
        this.idProgreso = idProgreso;
        this.idUsuario = idUsuario;
        this.idCurso = idCurso;
        this.idLeccion = idLeccion;
        this.completado = completado;
        this.fechaActualizacion = fechaActualizacion;
    }

    public int getIdProgreso() {
        return idProgreso;
    }

    public void setIdProgreso(int idProgreso) {
        this.idProgreso = idProgreso;
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

    public int getIdLeccion() {
        return idLeccion;
    }

    public void setIdLeccion(int idLeccion) {
        this.idLeccion = idLeccion;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

    public String getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(String fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }
}
