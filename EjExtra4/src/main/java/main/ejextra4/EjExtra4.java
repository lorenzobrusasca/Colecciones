/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.ejextra4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
/*Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el
número.
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
• Muestra por pantalla los datos*/


public class EjExtra4 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        HashMap <Integer,String> listaCodPost = new HashMap <>();
        boolean valida=false;
        
        //carga las cuidades y codigos
        listaCodPost.put(10115, "Berlín");
        listaCodPost.put(20095, "Hamburgo");
        listaCodPost.put(50667, "Colonia");
        listaCodPost.put(60311, "Fráncfort");
        listaCodPost.put(80331, "Múnich");
        listaCodPost.put(45127, "Essen");
        listaCodPost.put(30159, "Hannover");
        listaCodPost.put(40213, "Düsseldorf");
        listaCodPost.put(70173, "Stuttgart");
        listaCodPost.put(01067, "Dresde");
        
        //muestra el hasmap
        listaCodPost.forEach((Integer codigo,String ciudad)->
        {
            System.out.println("Código:"+codigo+" Ciudad:"+ciudad);
        } 
        );
        
        //Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario.
        System.out.println("Introduzca un código postal:");
        int cod = leer.nextInt();
        
        for (Map.Entry<Integer,String> entry:listaCodPost.entrySet()) {
            
            int clave = entry.getKey();
            String ciudad = entry.getValue();
            
            if (cod==clave) {
                System.out.println("Codigo= "+clave+"Ciudad= "+ciudad);
                valida = true;
            }
            
            
        }
         
        if (valida==false) {
            System.out.println("No se encontró la ciudad");
        }
       
        //Agregar una ciudad con su código postal correspondiente más al HashMap.
        
        System.out.println("Introduzca el codigo postal de la ciudad a agregar:");
        int cx = leer.nextInt();
        System.out.println("Introduzca el nombre de la ciudad a agregar:");
        String nom = leer.next();
        
        listaCodPost.put(cx, nom);
        
            //Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.

            System.out.println("Introduzca el código de las 3 ciudades a eliminar:");
            int cod1 = leer.nextInt();
            int cod2 = leer.nextInt();
            int cod3 = leer.nextInt();

            for (Map.Entry<Integer,String> entry:listaCodPost.entrySet()) {

                int clave = entry.getKey();
                String ciudad = entry.getValue();

                //estamallll
                if (cod1==clave) {
                    listaCodPost.remove(clave);
                }


            }
        
        
        
        
    }
}
