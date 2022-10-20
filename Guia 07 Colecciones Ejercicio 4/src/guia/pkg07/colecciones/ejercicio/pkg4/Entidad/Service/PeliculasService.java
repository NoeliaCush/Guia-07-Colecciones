package guia.pkg07.colecciones.ejercicio.pkg4.Entidad.Service;

import guia.pkg07.colecciones.ejercicio.pkg4.Entidad.Peliculas;
import static guia.pkg07.colecciones.ejercicio.pkg4.Entidad.Peliculas.ordenDuracion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.ToDoubleFunction;

public class PeliculasService {

    Scanner leer = new Scanner(System.in);
    ArrayList<Peliculas> ListaDePeliculas = new ArrayList<>();

    public void cargarPelicula() {

        String eleccion;
        
        /**
         * En el servicio deberemos tener un bucle que crea un objeto Pelicula
         * pidiéndole al usuario todos sus datos y guardándolos en el objeto
         * Pelicula.
         */
        do {
            
            System.out.println("¡Bienvenido! por favor complete los siguientes datos");
            System.out.println("Título de la película: ");
            String titulo = leer.next();
            System.out.println("Director de la pelicula: ");
            String director = leer.next();
            System.out.println("Duración de la película: ");
            Double duracion = leer.nextDouble();
                        
            /**
             * Después, esa Pelicula se guarda una lista de Peliculas y se le
             * pregunta al usuario si quiere crear otra Pelicula o no.
             */
            
            ListaDePeliculas.add( new Peliculas(titulo, director, duracion));
            
            System.out.println("");
            System.out.println("¿Desea agregar otra película a la lista? De ser así oprima la letra <S>. En caso de salir de la lista de películas, oprima la letra <N>");
            eleccion = leer.next();
       
        } while (eleccion.equals("S") || eleccion.equals("s"));

    }
    
    //Mostrar en pantalla todas las películas.
    public void mostrarListaPeliculas(){
        for(Peliculas lista : ListaDePeliculas){
            System.out.println(lista);
        }
    }

    //Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    public void pelisDuracionMayor1Hs(){
        System.out.println("Las películas que tienen una duración de una hora o más son las siguientes: ");
        for(Peliculas aux : ListaDePeliculas){
            if(aux.getDuracionPelicula()>=1){
                System.out.println(aux);
            }
        }
    }

      private static abstract class ComparatorDuración implements Comparator <Peliculas>{

          public C
          
      }
    
    //Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
    public void DuraciónMayorAMenor(){
        
       Collections.sort(ListaDePeliculas, ordenDuracion);
       Collections.reverse(ListaDePeliculas);
       System.out.println("El orden de las películas de acuerdo a su duración <De mayor a menor> es: ");
       mostrarListaPeliculas();
    }
        
    //Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
    public void DuracionMenorAMayor(){
        Collections.sort(ListaDePeliculas, ordenDuracion);
        System.out.println("");
    }
    
    
    
    //Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    
    //Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
}
