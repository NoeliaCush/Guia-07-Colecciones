/**
 * Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
 * alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
 * con sus 3 notas.
 */
package guia.pkg07.colecciones.ejercicio.pkg03.Entidad;

import java.util.ArrayList;

public class Alumno {

    private String nombreAlumno;
    private ArrayList<Integer> NotasAlumnoArrayList;

    public Alumno() {
    }

    public Alumno(String nombreAlumno, ArrayList<Integer> NotasAlumnoArrayList) {
        this.nombreAlumno = nombreAlumno;
        this.NotasAlumnoArrayList = NotasAlumnoArrayList;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public ArrayList<Integer> getNotasAlumnoArrayList() {
        return NotasAlumnoArrayList;
    }

    public void setNotasAlumnoArrayList(ArrayList<Integer> NotasAlumnoArrayList) {
        this.NotasAlumnoArrayList = NotasAlumnoArrayList;
    }
    
    @Override
    public String toString() {
        return "Alumno{" + "nombreAlumno: " + nombreAlumno + ", NotasAlumnoArrayList: " + NotasAlumnoArrayList + '}';
    }
    
    
    
    
}
