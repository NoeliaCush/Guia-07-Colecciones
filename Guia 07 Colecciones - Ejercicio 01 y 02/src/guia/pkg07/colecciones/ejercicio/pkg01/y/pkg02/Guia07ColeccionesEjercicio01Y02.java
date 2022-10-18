package guia.pkg07.colecciones.ejercicio.pkg01.y.pkg02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Guia07ColeccionesEjercicio01Y02 {

    public static void main(String[] args) {

        /**
         * Diseñar un programa que lea y guarde razas de perros en un ArrayList
         * de tipo String. El programa pedirá una raza de perro en un bucle, el
         * mismo se guardará en la lista y después se le preguntará al usuario
         * si quiere guardar otro perro o si quiere salir. Si decide salir, se
         * mostrará todos los perros guardados en el ArrayList.
         *
         */
        ArrayList<String> razasPerros = new ArrayList<>();

        Scanner leer = new Scanner(System.in);

        String opcion;

        //Esto es el bucle 
        do {

            //se pide la raza del perrito y lo guarda en la lista 
            System.out.println("Por favor, indique la raza del perrito");
            razasPerros.add(leer.next());

            //se da la opción de agregar otra raza o salir del bucle
            System.out.println("¿Desea ingresar otra raza o salir del programa? S (si, deseo ingresar otra raza) N (no, deseo salir)");
            opcion = leer.next();

        } while (opcion.equals("s") || opcion.equals("S"));

        //Se muestra la lista
        System.out.println("La lista de razas de perros ha quedado de la siguiente manera");
        for (String perritos : razasPerros) {
            System.out.println(perritos);
        }

        /**
         * Continuando el ejercicio anterior, después de mostrar los perros, al
         * usuario se le pedirá un perro y se recorrerá la lista con un
         * Iterator, se buscará el perro en la lista. Si el perro está en la
         * lista, se eliminará el perro que ingresó el usuario y se mostrará la
         * lista ordenada. Si el perro no se encuentra en la lista, se le
         * informará al usuario y se mostrará la lista ordenada.
         */
        
        //Se pide la raza al usuario
        System.out.println("Ingrese la raza que desea quitar de la lista");
        
        String quitarRaza = leer.next();

        //Se crea el iterator parar recorrer la lista y encontrar la raza
        Iterator<String> razasPerrosIterator = razasPerros.iterator();
        
        Boolean razaEncontrada = false;
        
        while(razasPerrosIterator.hasNext()){
            if(razasPerrosIterator.next().equals(quitarRaza)){
                razasPerros.remove(quitarRaza);
                razaEncontrada = true;
            }
         }
        
        if(!razaEncontrada){
                System.out.println("La raza " + quitarRaza + " no se encontraba en la lista");
            }
        
        System.out.println("La lista de razas se ha actualizado y ha quedado de esta manera");
        for(String perritos : razasPerros){
            System.out.println(perritos);
        }
        
        
    }

}
