/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author Nacho
 */
public class Propietario {
    
    private String nombre;
    private String dni;
    private Computadora computadora;     //Asociación bidireccional

    // Constructor
    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Getters y setter
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Computadora getComputadora() {
        return computadora;
    }
    
    public void setComputadora(Computadora pc) {
        this.computadora = computadora;
        if (computadora != null && computadora.getPropietario() != this) {
            computadora.setPropietario(this);
        }
    }
    
    @Override
    public String toString() {
        String compuInfo;
        if (computadora != null) {
            compuInfo = computadora.getNumeroSerie();
        } else {
            compuInfo = "Sin computadora";
        }
        return "Propietario {nombre= " + nombre + ", dni= " + dni + ", computadora= " + compuInfo + "}";
    }
}