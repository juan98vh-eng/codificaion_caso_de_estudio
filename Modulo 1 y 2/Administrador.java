public class Administrador extends Usuario {

    public Administrador(String id, String nombre, String apellido,
                         String correo, String contraseña) {
        super(id, nombre, apellido, correo, contraseña, "Administrador");
    }

    public void registrarUsuario(String nombreUsuario) {
        System.out.println("Usuario registrado: " + nombreUsuario);
    }

    public void eliminarUsuario(String usuario) {
        System.out.println("Usuario eliminado: " + usuario);
    }

    public void asignarRol(String usuario, String nuevoRol) {
        System.out.println("Rol asignado: " + nuevoRol + " a " + usuario);
    }
}
