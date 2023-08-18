/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import Entidad.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Lorenzo
 */
public class Comparadores {
    
    public static Comparator<Pelicula> ordenarPorDuracDesc = new Comparator <Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {

            return Double.compare(t1.getDuracion(),t.getDuracion());
            
        }
    };
    
    public static Comparator<Pelicula> ordenarPorDuracAsc = new Comparator <Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
                    
            return Double.compare(t.getDuracion(),t1.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> ordenarPorTitulo = new Comparator <Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
                    
            return t.getTitulo().compareTo(t1.getTitulo());
                    
                    
                   
        }
    };
    
    public static Comparator<Pelicula> ordenarPorDirector = new Comparator <Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
                    
            return t.getDirector().compareTo(t1.getDirector());
                    
                    
                   
        }
    };
    
    
}
