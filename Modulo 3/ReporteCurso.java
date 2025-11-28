
public class ReporteCurso extends Reporte {

    private String curso;
    private double promedioGeneral;

    public ReporteCurso() {}

    public ReporteCurso(String idUsuario, String nombre, String correo,
                        String curso, double promedioGeneral) {
        super(idUsuario, nombre, correo, "Curso");
        this.curso = curso;
        this.promedioGeneral = promedioGeneral;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getPromedioGeneral() {
        return promedioGeneral;
    }

    public void setPromedioGeneral(double promedioGeneral) {
        this.promedioGeneral = promedioGeneral;
    }
}
