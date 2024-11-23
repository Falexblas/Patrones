package Modelo;

public class Leccion {

    private int idLeccion;
    private int idCurso;
    private String titulo;
    private String contenido;
    private String multimediaUrl;
    private int orden;

    public Leccion() {
    }

    public Leccion(int idLeccion, int idCurso, String titulo, String contenido, String multimediaUrl, int orden) {
        this.idLeccion = idLeccion;
        this.idCurso = idCurso;
        this.titulo = titulo;
        this.contenido = contenido;
        this.multimediaUrl = multimediaUrl;
        this.orden = orden;
    }

    public int getIdLeccion() {
        return idLeccion;
    }

    public void setIdLeccion(int idLeccion) {
        this.idLeccion = idLeccion;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getMultimediaUrl() {
        return multimediaUrl;
    }

    public void setMultimediaUrl(String multimediaUrl) {
        this.multimediaUrl = multimediaUrl;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }
}
