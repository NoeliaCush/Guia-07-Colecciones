package guia.pkg07.colecciones.ejercicio.pkg03;

import Service.AlumnoService;
import guia.pkg07.colecciones.ejercicio.pkg03.Entidad.Alumno;
import java.util.Scanner;

public class Guia07ColeccionesEjercicio03 {

    public static void main(String[] args) {

        AlumnoService as = new AlumnoService();
        Scanner leer = new Scanner(System.in);

        Alumno a = new Alumno();
        
        as.crearAlumno();
        boolean auxNotaFinal = true;
        
        do{
            as.buscarAlumno();
            System.out.println("¿Desea conocer la nota final de otro alumno? S para conocer la nota final de otro alumno o N para salir ");
            String opcion = leer.next();
            if(opcion.equalsIgnoreCase("n") || opcion.equalsIgnoreCase("N")){
                auxNotaFinal = false;
            } else {
                auxNotaFinal = true;
            }
            
        }while(auxNotaFinal == true);
        

    }

}
