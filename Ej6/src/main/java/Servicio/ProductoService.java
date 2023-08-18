/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Producto;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
/*Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.*/


public class ProductoService {
    
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    HashMap <String,Double> listaProductos = new HashMap();
    
    public void introducirProductos()
    {
        int opc;
        do {
        Producto P = new Producto();
        System.out.println("Introduzca un nombre de producto:");
        P.setNombre(leer.next());
        System.out.println("Introduzca el precio:");
        P.setPrecio(leer.nextDouble());
        
        listaProductos.put(P.getNombre(),P.getPrecio());
        
            System.out.println("Desea introducir más productos? 1.SI 2.NO");
            opc = leer.nextInt();
            
            } while (opc==1);
            
            }
    
    public void mostrarProductos()
    {
        System.out.println("|||MOSTRAR PRODUCTOS|||");
        for (Map.Entry<String, Double> entry : listaProductos.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            
            System.out.println(key+" "+val);
        }
    
    
    }
    
    public void modificarPrecio()
    {
        System.out.println("|||MODIFICAR PRECIO|||");
        Producto P = new Producto();
        System.out.println("Ingrese el producto:");
        String prod = leer.next();
        System.out.println("Ingrese el nuevo precio:");
        double prec = leer.nextDouble();
        
        listaProductos.replace(prod, prec);
        
        }
         
    public void eliminarProducto()
    {
        System.out.println("|||ELIMINAR PRODUCTO|||");
        System.out.println("Ingrese el producto a eliminar:");
        String prod = leer.next();
        listaProductos.remove(prod);
    
    }
    
    
    
        }
    
    
    

