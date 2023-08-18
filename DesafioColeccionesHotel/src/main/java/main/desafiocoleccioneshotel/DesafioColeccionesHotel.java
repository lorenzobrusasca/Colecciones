/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.desafiocoleccioneshotel;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class DesafioColeccionesHotel {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opc;
        int numHab,cantPers;
        LocalDate fechaOcup;
        
        do {
            
            System.out.println("Introduzca la opción deseada:\n1.Reservar Habitación\n2.Mostrar reservas\n3.Mostrar alojamientos\n4.Salir");
            opc = leer.nextInt();
            
            switch (opc)
            {
                case 1:
                    System.out.println("Introduzca el número de habitación:");
                    numHab = leer.nextInt();
                    System.out.println("Introduzca la cantidad de personas:");
                    cantPers = leer.nextInt();
                    System.out.println("Introduzca la fecha de ocupación en el siguiente formato (DD-MM-AAAA):");
                    String fechaO = leer.next(); 
                    // quedé acá, ahora hay que tomar esa fecha, desmenuzarla con substring y pasarla abajo con localdate
                    fechaOcup = LocalDate.
            }
            
        } while (true);
         
        
        
        
    }
}
