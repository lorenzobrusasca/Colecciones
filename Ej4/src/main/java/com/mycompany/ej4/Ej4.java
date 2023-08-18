/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej4;

import Servicio.PeliculaService;
import Utilidades.Comparadores;
import java.util.Collections;

/**
 *
 * @author Lorenzo
 */
public class Ej4 {
    
    /*Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.*/

    public static void main(String[] args) {
        PeliculaService PS = new PeliculaService();
                
        PS.agregarPeliculas();
        
        //Mostrar en pantalla todas las películas.
        PS.mostrarPeliculas();
        
        //Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
        PS.mostrarPeliculasMayores();
        
        System.out.println("\nPeliculas desordenadas:");
        PS.mostrarPeliculas();
        
        /*Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.*/
        Collections.sort(PS.listaPeliculas, Comparadores.ordenarPorDuracDesc);
        System.out.println("\nPeliculas ordenadas por duración descendente");
        PS.mostrarPeliculas();
        
        /*Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.*/
        
        Collections.sort(PS.listaPeliculas, Comparadores.ordenarPorDuracAsc);
        System.out.println("\nPelículas ordenadas por duración ascendente:");
        PS.mostrarPeliculas();
        
        /*Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.*/
        
        Collections.sort(PS.listaPeliculas,Comparadores.ordenarPorTitulo);
        System.out.println("\nPelículas ordenadas por título Alfabéticamente:");
        PS.mostrarPeliculas();
        
        /*Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.*/
        System.out.println("\nPeliculas ordenadas por director alfabéticamente:");
        Collections.sort(PS.listaPeliculas,Comparadores.ordenarPorDirector);
        PS.mostrarPeliculas();
    }
}
