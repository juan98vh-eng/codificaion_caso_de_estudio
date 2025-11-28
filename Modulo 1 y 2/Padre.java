public class Padre extends Usuario {

    private String hijo;

    public Padre(String id, String nombre, String apellido,
                 String correo, String contraseña, String hijo) {
        super(id, nombre, apellido, correo, contraseña, "Padre");
        this.hijo = hijo;
    }

    public String getHijo() {
        return hijo;
    }
}
