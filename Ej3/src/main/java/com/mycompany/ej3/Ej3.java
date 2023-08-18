/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej3;

import Servicio.AlumnoService;
import java.util.ArrayList;

/**
 *
 * @author Lorenzo
 */
public class Ej3 {

    public static void main(String[] args) {
       
        AlumnoService AS = new AlumnoService();
        
        AS.crearAlumno();
        AS.mostrarAlumnosNotas();
        AS.notaFinal();
        
          /*Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.*/
    
         
          
    }
}
