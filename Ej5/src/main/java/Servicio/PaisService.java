/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Pais;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
/*   /*Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
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

public class PaisService {
        
        Scanner leer = new Scanner(System.in);
        public HashSet <Pais> listaPaises = new HashSet <> ();
        
        
        
    public void cargaPaises()
    {
          
          int aux;
          
        do {
            Pais P1 = new Pais();
            System.out.println("Ingrese un país:");
            String p = leer.next();
            P1.setNombrePais(p);
            listaPaises.add(P1);
            
            System.out.println("\nIntroduzca la opción deseada:\n1. Cargar otro país\n2. Salir");
            aux = leer.nextInt();
            
        } while (aux==1);
    
        if (aux==2) {
            System.out.println("Usted terminó de cargar países");
        }
        else if (aux!=1||aux!=2) {
            System.out.println("Error, introdujo una opción incorrecta");
        }
        
        
    
    }

    public void mostrarPaises()
    {
        System.out.println("");
        for (Pais aux : listaPaises) {
            System.out.println(aux);
        }
    
    }

    public void eliminarPais()
    {
        System.out.println("\nIngrese el país a eliminar:");
        String paisIng = leer.next();
        int existeP=0;
        
        for (Pais aux : listaPaises) {
            if (aux.getNombrePais().equalsIgnoreCase(paisIng)) {
                existeP++;
            }
        }
        
    Iterator<Pais> it = listaPaises.iterator();
    while(it.hasNext()  )
    {
        if (it.next().getNombrePais().equals(paisIng)) {
            it.remove();
        }
      
    }
    
        
            if (existeP==0) {
                System.out.println("El país ingresado no existe");
            }
            
        }
      
    
    }





    

