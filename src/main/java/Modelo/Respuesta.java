package Modelo;

public class Respuesta {

    private int idRespuesta;
    private int idPregunta;
    private String respuesta;
    private boolean esCorrecta;

    public Respuesta() {
    }

    public Respuesta(int idRespuesta, int idPregunta, String respuesta, boolean esCorrecta) {
        this.idRespuesta = idRespuesta;
        this.idPregunta = idPregunta;
        this.respuesta = respuesta;
        this.esCorrecta = esCorrecta;
    }

    public int getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(int idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public boolean isEsCorrecta() {
        return esCorrecta;
    }

    public void setEsCorrecta(boolean esCorrecta) {
        this.esCorrecta = esCorrecta;
    }
}
