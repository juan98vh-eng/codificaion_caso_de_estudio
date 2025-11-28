public class Estudiante extends Usuario {

    private String curso;

    public Estudiante(String id, String nombre, String apellido,
                      String correo, String contraseña, String curso) {
        super(id, nombre, apellido, correo, contraseña, "Estudiante");
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    // Métodos de consulta del estudiante
    public String consultarAsignaturas(Docente d) { return d.verAsignaturas(); }

    public String consultarNotas(Docente d) { return d.verNotas(); }

    public String consultarAsistencias(Docente d) { return d.verAsistencias(); }

    public String consultarObservaciones(Docente d) { return d.verObservaciones(); }

    Object consultarAsistencias(Docente docente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
