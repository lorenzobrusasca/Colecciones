/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.time.LocalDate;

/**
 *
 * @author Lorenzo
 */
public class Habitacion {

    int numero;
    LocalDate fechaOcup, fechaDesocup;

    public Habitacion() {
    }

    public Habitacion(int numero, LocalDate fechaOcup, LocalDate fechaDesocup) {
        this.numero = numero;
        this.fechaOcup = fechaOcup;
        this.fechaDesocup = fechaDesocup;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "numero=" + numero + ", fechaOcup=" + fechaOcup + ", fechaDesocup=" + fechaDesocup + '}';
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getFechaOcup() {
        return fechaOcup;
    }

    public void setFechaOcup(LocalDate fechaOcup) {
        this.fechaOcup = fechaOcup;
    }

    public LocalDate getFechaDesocup() {
        return fechaDesocup;
    }

    public void setFechaDesocup(LocalDate fechaDesocup) {
        this.fechaDesocup = fechaDesocup;
    }
    
    
    
}
