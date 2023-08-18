/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.ArrayList;

/**
 *
 * @author Lorenzo
 */
/*Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y
los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).*/

public class NumeroService {
    
    
    ArrayList <Integer> listaNum = new ArrayList <>(); 
    
    public void IngresaNum(int num)
    {
        
        if (num!=-99) {
            listaNum.add(num);
        }
        
       
    }
    
    public void MostrarNum()
    {
    
        for (Integer aux : listaNum) {
            System.out.println(aux);
        }
        
    }
    
    public void SumaNumyProm()
    {
        int suma=0;
        int cont=0;
        
        for (Integer aux : listaNum) {
            suma = suma+aux;
            cont++;
        }
        System.out.println("La suma total es: "+suma);
        System.out.println("El promedio es: "+((double)suma/cont));
    }
    

            
    
}
