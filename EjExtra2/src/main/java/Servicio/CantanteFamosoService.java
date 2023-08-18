/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class CantanteFamosoService {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ArrayList <CantanteFamoso> ListaCantantes = new ArrayList <>();
    
     
CantanteFamoso C1 = new CantanteFamoso("Michael Jackson", "Thriller");
CantanteFamoso C2 = new CantanteFamoso("Madonna", "The Immaculate Collection");
CantanteFamoso C3 = new CantanteFamoso("Elvis Presley", "Elvis' Christmas Album");
CantanteFamoso C4 = new CantanteFamoso("The Beatles", "The Beatles (The White Album)");
CantanteFamoso C5 = new CantanteFamoso("Whitney Houston", "The Bodyguard: Original Soundtrack Album");

public void agregarCF()
{
    ListaCantantes.add(C1);
    ListaCantantes.add(C2);
    ListaCantantes.add(C3);
    ListaCantantes.add(C4);
    ListaCantantes.add(C5);
}
        
public void mostrarCantantes()
{
    for (CantanteFamoso aux : ListaCantantes) {
        System.out.println(aux.toString());
    }

}

public void agregarUnoMas()
{
     CantanteFamoso CF = new CantanteFamoso();
     
     System.out.println("Introduzca el nombre:");
     CF.setNombre(leer.next()); 
     System.out.println("Introduzca el disco:");
     CF.setDiscoConMasVentas(leer.next());

     ListaCantantes.add(CF);
     
}
    
public void eliminarCant()
{
    System.out.println("Introduzca el nombre:");
    String nombre=leer.next();
            
   Iterator<CantanteFamoso> it = ListaCantantes.iterator();
  while (it.hasNext())
  {
      CantanteFamoso aux = it.next();
      if (aux.getNombre().equalsIgnoreCase(nombre)) {
          it.remove();
      }
  
  }
            
}
}
