/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class AlumnoService {

    /*En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.*/
    
 
    
    
    Scanner leer = new Scanner (System.in);
    ArrayList <Alumno> ListaAlumnos = new ArrayList <>(); 
    
    
    public void crearAlumno()
    {
        do{
        ArrayList <Integer> notas = new ArrayList();
        Alumno A = new Alumno();
        System.out.println("Ingrese el nombre del alumno:");
        A.setNombre(leer.next());
        System.out.println("Ingrese la primer nota");
        notas.add(leer.nextInt());
        System.out.println("Ingrese la segunda nota");
        notas.add(leer.nextInt());
        System.out.println("Ingrese la tercer nota");
        notas.add(leer.nextInt());
        
        A.setNotas(notas);
        
        ListaAlumnos.add(A);
        
            System.out.println("Desea ingresar otro alumno? S/N");
           
        }
        while ("S".equalsIgnoreCase(leer.next()));
        
        
        
        
    }
    
    
    public void mostrarAlumnosNotas()
    {System.out.println(ListaAlumnos.toString());}
    
      /*Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.*/
    
    
    
    
    public void notaFinal()
    {
            int cont=0;
            int suma=0;
        
         System.out.println("Ingrese el nombre del alumno a buscar");
         String nombre = leer.next();
         
         for (Alumno ListaAlumno : ListaAlumnos) {
             if (ListaAlumno.getNombre().equalsIgnoreCase(nombre)) {
                    
                 for (int i = 0; i < ListaAlumno.notas.size(); i++) {
                     
                    int nota = ListaAlumno.getNotas().get(i);
                    suma = suma+nota;
                    
                     
                 }
                 
                 cont=ListaAlumno.notas.size();
                 }
                 
             
                 }
         
         System.out.println("El promedio del alumno es: "+((double)(suma/cont)));
        
             }
         
  }
        
        

    

