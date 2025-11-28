

public class PanelSeguimiento extends Usuario {

    private String curso;
    private double promedioCurso;

    public PanelSeguimiento() {}

    public PanelSeguimiento(String idUsuario, String nombre, String correo,
                            String curso, double promedioCurso) {
        super(idUsuario, nombre, correo, "PanelSeguimiento");
        this.curso = curso;
        this.promedioCurso = promedioCurso;
    }
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getPromedioCurso() {
        return promedioCurso;
    }

    public void setPromedioCurso(double promedioCurso) {
        this.promedioCurso = promedioCurso;
    }
}
