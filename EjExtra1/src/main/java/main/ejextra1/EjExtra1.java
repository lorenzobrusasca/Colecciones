/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.ejextra1;

import Servicio.NumeroService;
import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
/*Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y
los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).*/


public class EjExtra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        NumeroService NS = new NumeroService();
        
        int num;
        
        do{
        System.out.println("Ingrese un número entero:");
         num = leer.nextInt();
         NS.IngresaNum(num);
        }
        while(num!=-99);
        
        NS.MostrarNum();
        NS.SumaNumyProm();
        
        
        
    }
}
