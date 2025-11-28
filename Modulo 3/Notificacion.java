
public class Notificacion extends Usuario {

    private String mensaje;
    private String tipo;
    private String destinatarioID;

    public Notificacion() {}

    public Notificacion(String idUsuario, String nombre, String correo,
                        String tipo, String mensaje, String destinatarioID) {
        super(idUsuario, nombre, correo, "Notificacion");
        this.tipo = tipo;
        this.mensaje = mensaje;
        this.destinatarioID = destinatarioID;
    }
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDestinatarioID() {
        return destinatarioID;
    }

    public void setDestinatarioID(String destinatarioID) {
        this.destinatarioID = destinatarioID;
    }
}
