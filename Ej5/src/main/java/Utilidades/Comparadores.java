/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import Entidad.Pais;
import java.util.Comparator;

/**
 *
 * @author Lorenzo
 */
public class Comparadores {
    
    
    public static Comparator<Pais> ordenarAlfabet = new Comparator<Pais>    () {
        @Override
        public int compare(Pais t, Pais t1) {
           return t.getNombrePais().compareTo(t1.getNombrePais());
        }
    };
    
}
