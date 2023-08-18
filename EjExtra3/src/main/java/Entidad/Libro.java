/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Objects;

/**
 *
 * @author Lorenzo
 */
/*se debe crear una clase llamada Libro que guarde la información de
cada uno de los libros de una Biblioteca. La clase Libro debe guardar
el título del libro, autor, número de ejemplares y número de ejemplares prestados.*/

public class Libro {
    
      private String titulo, autor;
      private int numEjem, numEjemPrest;

    public Libro() {
    }

    public Libro(String titulo, String autor, int numEjem, int numEjemPrest) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjem = numEjem;
        this.numEjemPrest = numEjemPrest;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumEjem() {
        return numEjem;
    }

    public void setNumEjem(int numEjem) {
        this.numEjem = numEjem;
    }

    public int getNumEjemPrest() {
        return numEjemPrest;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.titulo);
        hash = 67 * hash + Objects.hashCode(this.autor);
        hash = 67 * hash + this.numEjem;
        hash = 67 * hash + this.numEjemPrest;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (this.numEjem != other.numEjem) {
            return false;
        }
        if (this.numEjemPrest != other.numEjemPrest) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return Objects.equals(this.autor, other.autor);
    }

    public void setNumEjemPrest(int numEjemPrest) {
        this.numEjemPrest = numEjemPrest;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", numEjem=" + numEjem + ", numEjemPrest=" + numEjemPrest + '}';
    }
      
      
    
}
