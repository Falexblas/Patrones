package Modelo;

public class Pregunta {

    private int idPregunta;
    private int idEvaluacion;
    private String pregunta;
    private String tipo;

    public Pregunta() {
    }

    public Pregunta(int idPregunta, int idEvaluacion, String pregunta, String tipo) {
        this.idPregunta = idPregunta;
        this.idEvaluacion = idEvaluacion;
        this.pregunta = pregunta;
        this.tipo = tipo;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public int getIdEvaluacion() {
        return idEvaluacion;
    }

    public void setIdEvaluacion(int idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
