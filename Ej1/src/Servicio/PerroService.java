/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Perro;
import java.util.ArrayList;

/**
 *
 * @author Lorenzo
 */
/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.*/

public class PerroService {
        
     public ArrayList<Perro> listaDeRazas = new ArrayList<>();
    
    
    public void guardarRazas(String raza)
    {
        Perro P = new Perro();
        P.setRaza(raza);
        listaDeRazas.add(P);
        
        
           
    }
    
    public void mostrarRazas()
    {
        System.out.println(listaDeRazas.toString());
        
        
    }
    
    public void eliminarPerro(String perro)
            
            
    {
        
        
        for (int i = 0; i < listaDeRazas.size(); i++) {
            
            Perro p = listaDeRazas.get(i);
            if (p.getRaza().equals(perro)) {
                listaDeRazas.remove(i);
            }
            
            
        }
        
        System.out.println(listaDeRazas.toString());
    };
    
    
}
