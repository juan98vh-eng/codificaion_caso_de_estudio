import javax.swing.JOptionPane;

public class MenuPrincipal {

    public static void main(String[] args) {

        Estudiante estudiante = null;
        Docente docente = null;
        Padre padre = null;

        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "===== MENÚ SISTEMA ESCOLAR =====\n"
                    + "1. Registrar Docente\n"
                    + "2. Registrar Estudiante\n"
                    + "3. Registrar Padre\n"
                    + "4. Gestión Académica (Docente)\n"
                    + "5. Consulta de Padres\n"
                    + "6. Consulta de Estudiante\n"
                    + "7. Salir\n"
                    + "Seleccione una opción: "));

            switch (opcion) {

                // --------- REGISTRAR DOCENTE ---------
                case 1:
                    String idD = JOptionPane.showInputDialog("ID Docente:");
                    String nD = JOptionPane.showInputDialog("Nombre:");
                    String aD = JOptionPane.showInputDialog("Apellido:");
                    String cD = JOptionPane.showInputDialog("Correo:");
                    String pD = JOptionPane.showInputDialog("Contraseña:");

                    docente = new Docente(idD, nD, aD, cD, pD);
                    JOptionPane.showMessageDialog(null, "Docente registrado.");
                    break;

                // --------- REGISTRAR ESTUDIANTE ---------
                case 2:
                    String idE = JOptionPane.showInputDialog("ID Estudiante:");
                    String nE = JOptionPane.showInputDialog("Nombre:");
                    String aE = JOptionPane.showInputDialog("Apellido:");
                    String cE = JOptionPane.showInputDialog("Correo:");
                    String pE = JOptionPane.showInputDialog("Contraseña:");
                    String curso = JOptionPane.showInputDialog("Curso:");

                    estudiante = new Estudiante(idE, nE, aE, cE, pE, curso);
                    JOptionPane.showMessageDialog(null, "Estudiante registrado.");
                    break;

                // --------- REGISTRAR PADRE ---------
                case 3:
                    if (estudiante == null) {
                        JOptionPane.showMessageDialog(null, "Primero registre un estudiante.");
                        break;
                    }

                    String idP = JOptionPane.showInputDialog("ID Padre:");
                    String nP = JOptionPane.showInputDialog("Nombre:");
                    String aP = JOptionPane.showInputDialog("Apellido:");
                    String cP = JOptionPane.showInputDialog("Correo:");
                    String pP = JOptionPane.showInputDialog("Contraseña:");

                    padre = new Padre(idP, nP, aP, cP, pP, estudiante.getNombre());
                    JOptionPane.showMessageDialog(null, "Padre registrado.");
                    break;

                // --------- GESTIÓN ACADÉMICA DOCENTE ---------
                case 4:
                    if (docente == null) {
                        JOptionPane.showMessageDialog(null, "Debe registrar un docente.");
                        break;
                    }

                    int opA = Integer.parseInt(JOptionPane.showInputDialog(
                            "--- Gestión Académica ---\n"
                            + "1. Registrar Asignatura\n"
                            + "2. Registrar Nota\n"
                            + "3. Registrar Asistencia\n"
                            + "4. Registrar Observación\n"
                            + "Seleccione: "));

                    switch (opA) {
                        case 1:
                            docente.registrarAsignatura(
                                    JOptionPane.showInputDialog("Asignatura:"));
                            break;

                        case 2:
                            docente.registrarNota(
                                    Double.parseDouble(JOptionPane.showInputDialog("Nota:")));
                            break;

                        case 3:
                            docente.registrarAsistencia(
                                    JOptionPane.showInputDialog("Asistencia (Presente/Ausente):"));
                            break;

                        case 4:
                            docente.registrarObservacion(
                                    JOptionPane.showInputDialog("Observación:"));
                            break;
                    }
                    break;

                // --------- CONSULTA PADRES ---------
                case 5:
                    if (padre == null || docente == null) {
                        JOptionPane.showMessageDialog(null, "Debe registrar padre y docente.");
                        break;
                    }

                    int opP = Integer.parseInt(JOptionPane.showInputDialog(
                            "--- Consulta para Padres ---\n"
                            + "Hijo: " + padre.getHijo() + "\n"
                            + "1. Ver asignaturas\n"
                            + "2. Ver notas\n"
                            + "3. Ver asistencias\n"
                            + "4. Ver observaciones\n"
                            + "Seleccione: "));

                    switch (opP) {
                        case 1: JOptionPane.showMessageDialog(null, docente.verAsignaturas()); break;
                        case 2: JOptionPane.showMessageDialog(null, docente.verNotas()); break;
                        case 3: JOptionPane.showMessageDialog(null, docente.verAsistencias()); break;
                        case 4: JOptionPane.showMessageDialog(null, docente.verObservaciones()); break;
                    }
                    break;

                // --------- CONSULTA ESTUDIANTE ---------
                case 6:
                    if (estudiante == null || docente == null) {
                        JOptionPane.showMessageDialog(null, "Debe registrar estudiante y docente.");
                        break;
                    }

                    int opE = Integer.parseInt(JOptionPane.showInputDialog(
                            "--- Consulta Estudiante ---\n"
                            + "1. Ver mis asignaturas\n"
                            + "2. Ver mis notas\n"
                            + "3. Ver mis asistencias\n"
                            + "4. Ver mis observaciones\n"
                            + "Seleccione: "));

                    switch (opE) {
                        case 1:
                            JOptionPane.showMessageDialog(null,
                                    estudiante.consultarAsignaturas(docente));
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null,
                                    estudiante.consultarNotas(docente));
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null,
                                    estudiante.consultarAsistencias(docente));
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(null,
                                    estudiante.consultarObservaciones(docente));
                            break;
                    }
                    break;
            }

        } while (opcion != 7);

        JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
    }
}
