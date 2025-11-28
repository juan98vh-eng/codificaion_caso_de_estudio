/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interaccion;

/**
 *
 * @author Microsoft
 */
public class ActualizarNotasAsistenciaDocentes {
    public ActualizarNotasAsistenciaDocentes() {
    }
}

/* =======================================================
   |                    CLASE: DOCENTE                    |
   ======================================================= */
class Docente {

    private int idDocente;
    private String nombre;

    public Docente() {
    }

    public Docente(int idDocente, String nombre) {
        this.idDocente = idDocente;
        this.nombre = nombre;
    }

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

/* =======================================================
   |                     CLASE: NOTA                      |
   ======================================================= */
class Nota {

    private int idNota;
    private int idEstudiante;
    private String asignatura;
    private double valorNota;

    public Nota() {
    }

    public Nota(int idNota, int idEstudiante, String asignatura, double valorNota) {
        this.idNota = idNota;
        this.idEstudiante = idEstudiante;
        this.asignatura = asignatura;
        this.valorNota = valorNota;
    }

    public int getIdNota() {
        return idNota;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public double getValorNota() {
        return valorNota;
    }

    public void setValorNota(double valorNota) {
        this.valorNota = valorNota;
    }
}

/* clase: ASISTENCIA */
class Asistencia {

    private int idAsistencia;
    private int idEstudiante;
    private String fecha;
    private String estado;  // presente, Ausente, Tarde

    public Asistencia() {
    }

    public Asistencia(int idAsistencia, int idEstudiante, String fecha, String estado) {
        this.idAsistencia = idAsistencia;
        this.idEstudiante = idEstudiante;
        this.fecha = fecha;
        this.estado = estado;
    }

    public int getIdAsistencia() {
        return idAsistencia;
    }

    public void setIdAsistencia(int idAsistencia) {
        this.idAsistencia = idAsistencia;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
