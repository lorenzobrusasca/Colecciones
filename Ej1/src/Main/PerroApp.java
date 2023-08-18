/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Servicio.PerroService;
import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class PerroApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Scanner leer = new Scanner (System.in);
        PerroService PS = new PerroService();
        String x;
        
        do{
        System.out.println("Introduzca una raza de perro");
        String raza = leer.next();
        
        PS.guardarRazas(raza);
        
        System.out.println("Desea guardar más razas? S/N");
        x = leer.next();
        }
        while("S".equalsIgnoreCase(x));
        
        PS.mostrarRazas();
        
        System.out.println("\nIntroduzca una raza a eliminar:");
        String var = leer.next();
        
        PS.eliminarPerro(var);
        
    }
    
}
