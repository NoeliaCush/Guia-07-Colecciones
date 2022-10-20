package guia.pkg07.colecciones.ejercicio.pkg4;

import guia.pkg07.colecciones.ejercicio.pkg4.Entidad.Service.PeliculasService;

public class Guia07ColeccionesEjercicio4 {

    public static void main(String[] args) {
      
        PeliculasService s1 = new PeliculasService();
        
        s1.cargarPelicula();
        System.out.println("");
        s1.mostrarListaPeliculas();
        System.out.println("");
        s1.pelisDuracionMayor1Hs();
        System.out.println("");
        s1.DuraciónMayorAMenor();
        
    }
    
}
