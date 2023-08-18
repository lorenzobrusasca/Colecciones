/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class PeliculaService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public ArrayList <Pelicula>  listaPeliculas = new ArrayList<>();
    int opc;
    
    
    public void agregarPeliculas(){
          
                            //(String titulo, String director, double duracion);
    Pelicula P1 = new Pelicula("Avatar","James Cameron", 2.5);
    Pelicula P2 = new Pelicula("101 Dálmatas","Jonny D", 1.5);
    Pelicula P3 = new Pelicula("Titanic","Alalnog", 0.8);
    Pelicula P4= new Pelicula("Iron Man","Crack B", 0.9);
    Pelicula P5 = new Pelicula("Avengers","Ernesto Sosa", 1.2);
            
           listaPeliculas.add(P1);
           listaPeliculas.add(P2);
           listaPeliculas.add(P3);
           listaPeliculas.add(P4);
           listaPeliculas.add(P5);
           
    }

    public void mostrarPeliculas()
    {
        for (Pelicula aux : listaPeliculas) {
            System.out.println(aux.toString());
        }
    
    }
    
    public void mostrarPeliculasMayores()
    {
        
        System.out.println("\nPelículas mayores a 1hs:");
        for (Pelicula pel : listaPeliculas) {
            if (pel.getDuracion()>1) {
                System.out.println(pel.toString());
            }
            
        }
    
    }
    
    
}
