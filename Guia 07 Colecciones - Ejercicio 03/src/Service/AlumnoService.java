/**
 * En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
 * toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
 * pregunta al usuario si quiere crear otro Alumno o no.
 *
 * Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
 *
 * Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
 * final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
 * del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
 * promedio final, devuelto por el método y mostrado en el main
 */
package Service;

import guia.pkg07.colecciones.ejercicio.pkg03.Entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoService {

    ArrayList<Alumno> ListadoAlumnos = new ArrayList<>();
    Scanner leer = new Scanner(System.in);
    String opcion;
    boolean auxIngresoAlum = true;
    boolean auxBusquedaAlum = false;

    /**
     * En el servicio de Alumno deberemos tener un bucle que crea un objeto
     * Alumno. Se pide toda la información al usuario y ese Alumno se guarda en
     * una lista de tipo Alumno y se le pregunta al usuario si quiere crear otro
     * Alumno o no.
     */
    public void crearAlumno() {

        do {

            System.out.println("Por favor, ingrese el nombre del alumno");
            String nombreAlumno = leer.next();

            System.out.println("Por favor, ingrese las 3 notas del alumno");
            ArrayList<Integer> NotasAlumno = new ArrayList<>();
            NotasAlumno.add(leer.nextInt());
            NotasAlumno.add(leer.nextInt());
            NotasAlumno.add(leer.nextInt());

            ListadoAlumnos.add(new Alumno(nombreAlumno, NotasAlumno));

            System.out.println("¿Desea ingresar otro alumno? ingrese S si desea ingresar otro alumno a la lista o N para no ingresar otro alumno y salir del menu");
            opcion = leer.next();

            if (opcion.equalsIgnoreCase("N") || opcion.equalsIgnoreCase("n")) {
                auxIngresoAlum = false;
            } else {
                auxIngresoAlum = true;
            }

        } while (auxIngresoAlum == true);

        for (Alumno lista : ListadoAlumnos) {
            System.out.println(lista);
        }

    }

    /**
     * Método notaFinal(): El usuario ingresa el nombre del alumno que quiere
     * calcular su nota final y se lo busca en la lista de Alumnos. Si está en
     * la lista, se llama al método. Dentro del método se usará la lista notas
     * para calcular el promedio final de alumno. Siendo este promedio final,
     * devuelto por el método y mostrado en el main
     */
    public void buscarAlumno() {

        System.out.println("Por favor, ingrese el nombre del alumno que desea buscar en la lista");
        String nombreAlumno = leer.next();
        for (int i = 0; i < ListadoAlumnos.size(); i++) {

            if (ListadoAlumnos.get(i).getNombreAlumno().equals(nombreAlumno)) {
                auxBusquedaAlum = true;
                notaFinal();
            } else {
                auxBusquedaAlum = false;
            }
        }
        if(auxBusquedaAlum == false){
            System.out.println("El nombre ingresado no se encuentra registrado en la lita");
        }
       
    }

    public void notaFinal(){
        System.out.println("El promedio final del alumno es");
     
            
        
        
    }

}
