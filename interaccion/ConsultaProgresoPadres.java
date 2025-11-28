/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interaccion;

/**
 *
 * @author Microsoft
 */
public class ConsultaProgresoPadres {
        // Constructor vacío
    public ConsultaProgresoPadres() {
    }
}

/* 
Clase: ASIGNATURA */
class Asignatura {

    private int idAsignatura;
    private String nombre;
    private double nota;

    public Asignatura() {
    }

    public Asignatura(int idAsignatura, String nombre, double nota) {
        this.idAsignatura = idAsignatura;
        this.nombre = nombre;
        this.nota = nota;
    }

    public int getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}

/* 
Clase: HIJO
*/
class Hijo {

    private int idHijo;
    private String nombre;

    public Hijo() {
    }

    public Hijo(int idHijo, String nombre) {
        this.idHijo = idHijo;
        this.nombre = nombre;
    }

    public int getIdHijo() {
        return idHijo;
    }

    public void setIdHijo(int idHijo) {
        this.idHijo = idHijo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

/* 
Clase: PADRE
 */
class Padre {

    private int idPadre;
    private String nombre;

    public Padre() {
    }

    public Padre(int idPadre, String nombre) {
        this.idPadre = idPadre;
        this.nombre = nombre;
    }

    public int getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(int idPadre) {
        this.idPadre = idPadre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

/* 
   Clase: PROGRESO ACADEMICO
 */
class ProgresoAcademico {

    private int idProgreso;
    private int idHijo;
    private int idAsignatura;

    public ProgresoAcademico() {
    }

    public ProgresoAcademico(int idProgreso, int idHijo, int idAsignatura) {
        this.idProgreso = idProgreso;
        this.idHijo = idHijo;
        this.idAsignatura = idAsignatura;
    }

    public int getIdProgreso() {
        return idProgreso;
    }

    public void setIdProgreso(int idProgreso) {
        this.idProgreso = idProgreso;
    }

    public int getIdHijo() {
        return idHijo;
    }

    public void setIdHijo(int idHijo) {
        this.idHijo = idHijo;
    }

    public int getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
    }
}
