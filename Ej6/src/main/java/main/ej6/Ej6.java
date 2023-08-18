/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.ej6;

import Servicio.ProductoService;
import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Ej6 {

    /*Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.*/
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        ProductoService PS = new ProductoService();
        int opcx;
        
          
        System.out.println("---SUPERMERCADO---\n");
        
        
        
        do
        {
            
            System.out.println("Elija una opción:\n1. INTRODUCIR PRODUCTOS\n2. MOSTRAR PRODUCTOS\n3. MODIFICAR PRECIO\n4. ELIMINAR PRODUCTO\n5. SALIR");
        int opc = leer.nextInt();
        switch (opc)
        {
            case 1: PS.introducirProductos();
            break;
            case 2: PS.mostrarProductos();
            break;
            case 3: PS.modificarPrecio();
            break;
            case 4: PS.eliminarProducto();
            break;
            case 5: System.out.println("FIN");
            break;
            default: System.out.println("Introdujo una opción incorrecta.");
        }
        
            if (opc==5) {
                break;
            }
        
       System.out.println("\nDESEA INTRODUCIR OTRA OPCIÓN?\n1. SI\n2. NO");
       opcx = leer.nextInt();

        
        }
        while(opcx==1);

        
        
              
        
    }
}
