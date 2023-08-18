/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej5;

import Entidad.Pais;
import Servicio.PaisService;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Lorenzo
 */
public class Ej5 {

    
    /*Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.*/
    
    
    public static void main(String[] args) {
        
        PaisService PS = new PaisService();
        
        PS.cargaPaises();
        PS.mostrarPaises();
        
        //Se pasa HashSet a Arraylist para poder ordenarlo
        ArrayList<Pais> listaPaises = new ArrayList(PS.listaPaises);
        
        
        //Ordena alfabeticamente y los muestra
        System.out.println("\nOrdenados Alfabeticamente");
        Collections.sort(listaPaises, Comparadores.ordenarAlfabet);
        
        for (Pais aux : listaPaises) {
            System.out.println(aux);
        }
        
        PS.eliminarPais();
        //muestra ArrayList ordenado con el país eliminado
        
        System.out.println("");
        for (Pais aux : PS.listaPaises) {
            System.out.println(aux);
        }
        
        
    }
}
