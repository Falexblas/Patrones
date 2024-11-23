package Modelo;

public class Notificacion {

    private int idNotificacion;
    private int idUsuario;
    private String mensaje;
    private boolean leido;
    private String fechaEnvio;

    public Notificacion() {
    }

    public Notificacion(int idNotificacion, int idUsuario, String mensaje, boolean leido, String fechaEnvio) {
        this.idNotificacion = idNotificacion;
        this.idUsuario = idUsuario;
        this.mensaje = mensaje;
        this.leido = leido;
        this.fechaEnvio = fechaEnvio;
    }

    public int getIdNotificacion() {
        return idNotificacion;
    }

    public void setIdNotificacion(int idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isLeido() {
        return leido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    public String getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(String fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }
}
