/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.ejextra2;

import Entidad.CantanteFamoso;
import Servicio.CantanteFamosoService;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
/*Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 objetos
de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada cantante
y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario
elija o de salir del programa. Al final se deberá mostrar la lista con todos los cambios*/

public class EjExtra2 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        CantanteFamosoService CF = new CantanteFamosoService();
        CF.agregarCF();
        int opc;
        
        
        do{
            
        System.out.println("Seleccione la opción deseada:\n1. Agregar un cantante más\n2. Mostrar todos los cantantes\n3. Eliminar un cantante"
                + "\n4. Salir");
         opc = leer.nextInt();
         
        
         switch(opc)
         {
             case 1: CF.agregarUnoMas();
             break;
             case 2: CF.mostrarCantantes();
             break;
             case 3: CF.eliminarCant();
             break;
             case 4: System.out.println("FIN");
             break;
             
             default: System.out.println("Introdujo opc incorrecta");
                  
         
         }
        
        }
        while(opc!=4);
        
    
        
    }
}
