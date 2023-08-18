/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Libro;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Lorenzo
 */
/*Implemente un programa para una Librería haciendo uso de un HashSet para evitar datos
repetidos. Para ello, se debe crear una clase llamada Libro que guarde la información de
cada uno de los libros de una Biblioteca. La clase Libro debe guardar
el título del libro, autor, número de ejemplares y número de ejemplares prestados.
También se creará en el main un HashSet de tipo Libro que guardará todos los libros
creados.
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos sus
datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y se le
pregunta al usuario si quiere crear otro Libro o no.
La clase Librería contendrá además los siguientes métodos:
Constructor por defecto.
Constructor con parámetros.
Métodos Setters/getters
Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo busca
en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al método. El
método se incrementa de a uno, como un carrito de compras, el atributo ejemplares
prestados, del libro que ingresó el usuario. Esto sucederá cada vez que se realice un
préstamo del libro. No se podrán prestar libros de los que no queden ejemplares
disponibles para prestar. Devuelve true si se ha podido realizar la operación y false en
caso contrario.
Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método. El
método decrementa de a uno, como un carrito de compras, el atributo ejemplares
prestados, del libro seleccionado por el usuario. Esto sucederá cada vez que se
produzca la devolución de un libro. No se podrán devolver libros donde que no tengan
ejemplares prestados. Devuelve true si se ha podido realizar la operación y false en
caso contrario.
Método toString para mostrar los datos de los libros.*/

public class LibroService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashSet <Libro> listadoLibros = new HashSet <>();

    /*En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos sus
datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y se le
pregunta al usuario si quiere crear otro Libro o no.*/
    public void cargarLibros()
    {
        int opc;
        
        do{
        Libro L = new Libro();    
        System.out.println("Introduzca el nombre del libro:");
        L.setTitulo(leer.next());
        System.out.println("Introduzca el autor del libro");
        L.setAutor(leer.next());
        System.out.println("Introduzca el número de ejemplares:");
        L.setNumEjem(leer.nextInt());
        System.out.println("Introduzca el número de ejemplares prestados:"); 
        L.setNumEjemPrest(leer.nextInt());
        
        listadoLibros.add(L);
        
            System.out.println("Desea introducir más libros? \n1.SI\n2.NO\n");
            opc = leer.nextInt();
        }
        while(opc==1);
        
        
    }
    
/*Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo busca
en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al método. El
método se incrementa de a uno, como un carrito de compras, el atributo ejemplares
prestados, del libro que ingresó el usuario. Esto sucederá cada vez que se realice un
préstamo del libro. No se podrán prestar libros de los que no queden ejemplares
disponibles para prestar. Devuelve true si se ha podido realizar la operación y false en
caso contrario.
*/

public boolean prestamo()
{
    boolean X=false;
    System.out.println("Introduzca el título del libro:");
    String titulo = leer.next();
    for (Libro aux : listadoLibros) {
        
        if (titulo.equalsIgnoreCase(aux.getTitulo())) {
            
            if (aux.getNumEjem()>=1) {
                
                aux.setNumEjemPrest(aux.getNumEjemPrest()+1);
                aux.setNumEjem(aux.getNumEjem()-1);
                X=true;
                
            }
            else{X=false;}
                   
            
        }
    }
        
        return X;
    
    

}
    

/*Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método. El
método decrementa de a uno, como un carrito de compras, el atributo ejemplares
prestados, del libro seleccionado por el usuario. Esto sucederá cada vez que se
produzca la devolución de un libro. No se podrán devolver libros donde que no tengan
ejemplares prestados. Devuelve true si se ha podido realizar la operación y false en
caso contrario.*/

public boolean devolucion()
{
    boolean X=false;
    System.out.println("Ingrese el título del libro:");
    String titulo = leer.next();
    
    for (Libro aux : listadoLibros) {
        
        if (aux.getTitulo().equalsIgnoreCase(titulo)) {
            
            if (aux.getNumEjemPrest()>=1) {
                
               aux.setNumEjemPrest(aux.getNumEjemPrest()-1);
               aux.setNumEjem(aux.getNumEjem()+1);
              X=true;  
            }
            else{X=false;}           
        }
        
        
        
    }

    return X;
}




public void mostrarLibros()
{

     for (Libro aux : listadoLibros) {
         System.out.println(aux.toString());
    }


}



    
}
