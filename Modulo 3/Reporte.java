

public class Reporte extends Usuario {

    protected String tipoReporte;

    public Reporte() {}

    public Reporte(String idUsuario, String nombre, String correo, String tipoReporte) {
        super(idUsuario, nombre, correo, "Reporte");
        this.tipoReporte = tipoReporte;
    }
    public String getTipoReporte() {
        return tipoReporte;
    }

    public void setTipoReporte(String tipoReporte) {
        this.tipoReporte = tipoReporte;
    }
}
