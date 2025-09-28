public class Sesion {
    private int idSesion;
    private String fechaSesion;
    private String tipoSesion;
    private String duracion;

    public Sesion(int idSesion, String fechaSesion, String tipoSesion, String duracion) {
        this.idSesion = idSesion;
        this.fechaSesion = fechaSesion;
        this.tipoSesion = tipoSesion;
        this.duracion = duracion;
    }

    // Getters
    public int getIdSesion() {
        return idSesion;
    }

    public String getFechaSesion() {
        return fechaSesion;
    }

    public String getTipoSesion() {
        return tipoSesion;
    }

    public String getDuracion() {
        return duracion;
    }
}
