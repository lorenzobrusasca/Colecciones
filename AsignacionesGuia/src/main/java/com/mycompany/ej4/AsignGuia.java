/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author Lorenzo
 */
public class AsignGuia {

    public static void main(String[] args) {
        
        String[] nombres = {"Lorenzo", "Marcos", "Juan", "Flor", "Thiago"};
        Integer[] dni = {36983645,36569365,253653698,252525269,458585695};
        //Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno.
        ArrayList<Integer> numerosA = new ArrayList();
        HashSet<Integer> numerosB = new HashSet();
        HashMap<Integer,String> alumnos = new HashMap();
        
        
        for (int i = 0; i < 5; i++) {
            numerosA.add(i);
        }
        
        System.out.println("NumerosA = "+ numerosA.toString());
        
        for (int i = 0; i < 5; i++) {
            numerosB.add(i);
              }
       
        System.out.println("Numeros B = "+numerosB.toString());
        
        for (int i = 0; i < 4; i++) {
           alumnos.put(dni[i],nombres[i] );        
        }
        
        System.out.println("Alumnos = "+alumnos.toString());
        
        /*Toma la Lista, el Conjunto y el Mapa que hiciste previamente y elimina en cada uno un objeto de
cada forma que aprendiste arriba.*/
        
        numerosA.remove(4);
        
        System.out.println("Luego de remover el 4 de NumerosA = "+numerosA.toString());
        
        numerosB.remove(2);
        
        System.out.println("Luego de remover el 2 de Numeros B = "+numerosB.toString());
        
        alumnos.remove(36983645);
        
        System.out.println("Luego de remover Lorenzo con DNI de alumnos = "+alumnos.toString());
        
    }
}
