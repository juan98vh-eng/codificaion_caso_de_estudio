public class Docente extends Usuario {

    private String[] asignaturas = new String[10];
    private int totalAsignaturas = 0;

    private double[] notas = new double[4];
    private int totalNotas = 0;

    private String[] asistencias = new String[20];
    private int totalAsistencias = 0;

    private String[] observaciones = new String[20];
    private int totalObservaciones = 0;

    public Docente(String id, String nombre, String apellido,
                   String correo, String contraseña) {
        super(id, nombre, apellido, correo, contraseña, "Docente");
    }

    public void registrarAsignatura(String nombre) {
        asignaturas[totalAsignaturas] = nombre;
        totalAsignaturas++;
    }

    public String verAsignaturas() {
        String txt = "Asignaturas:\n";
        for (int i = 0; i < totalAsignaturas; i++) {
            txt += "- " + asignaturas[i] + "\n";
        }
        return txt;
    }
    
    public void registrarNota(double nota) {
        notas[totalNotas] = nota;
        totalNotas++;
    }

    public String verNotas() {
        String txt = "Notas:\n";
        for (int i = 0; i < totalNotas; i++) {
            txt += "Periodo " + (i + 1) + ": " + notas[i] + "\n";
        }
        return txt;
    }

    public void registrarAsistencia(String registro) {
        asistencias[totalAsistencias] = registro;
        totalAsistencias++;
    }

    public String verAsistencias() {
        String txt = "Asistencias:\n";
        for (int i = 0; i < totalAsistencias; i++) {
            txt += "- " + asistencias[i] + "\n";
        }
        return txt;
    }

    public void registrarObservacion(String obs) {
        observaciones[totalObservaciones] = obs;
        totalObservaciones++;
    }

    public String verObservaciones() {
        String txt = "Observaciones:\n";
        for (int i = 0; i < totalObservaciones; i++) {
            txt += "- " + observaciones[i] + "\n";
        }
        return txt;
    }
}
