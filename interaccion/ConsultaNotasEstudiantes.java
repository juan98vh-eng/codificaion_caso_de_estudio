/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interaccion;

/**
 *
 * @author Microsoft
 */
public class ConsultaNotasEstudiantes {
    public ConsultaNotasEstudiantes() {
    }
}

/*Clase: ESTUDIANTE */
class Estudiante {

    private int idEstudiante;
    private String nombre;

    public Estudiante() {
    }

    public Estudiante(int idEstudiante, String nombre) {
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

/* clase: CALIFICACION */
class Calificacion {

    private int idCalificacion;
    private int idEstudiante;
    private String asignatura;
    private double nota;

    public Calificacion() {
    }

    public Calificacion(int idCalificacion, int idEstudiante, String asignatura, double nota) {
        this.idCalificacion = idCalificacion;
        this.idEstudiante = idEstudiante;
        this.asignatura = asignatura;
        this.nota = nota;
    }

    public int getIdCalificacion() {
        return idCalificacion;
    }

    public void setIdCalificacion(int idCalificacion) {
        this.idCalificacion = idCalificacion;
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

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}

/*  clase: OBSERVACION */
class Observacion {

    private int idObservacion;
    private int idEstudiante;
    private String texto;

    public Observacion() {
    }

    public Observacion(int idObservacion, int idEstudiante, String texto) {
        this.idObservacion = idObservacion;
        this.idEstudiante = idEstudiante;
        this.texto = texto;
    }

    public int getIdObservacion() {
        return idObservacion;
    }

    public void setIdObservacion(int idObservacion) {
        this.idObservacion = idObservacion;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
