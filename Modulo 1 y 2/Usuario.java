public class Usuario {

    private String idUsuario;
    private String nombre;
    private String apellido;
    private String correo;
    private String contraseña;
    private String rol;

    public Usuario(String idUsuario, String nombre, String apellido,
                   String correo, String contraseña, String rol) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }
}
