/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author Nacho
 */
public class Mesa {
    
    private int numero;
    private int capacidad;

    // Constructor
    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    // Getters
    public int getNumero() { 
        return numero; 
    }
    
    public int getCapacidad() {
        return capacidad; 
    }

    @Override
    public String toString() {
        return "Mesa {numero=" + numero + ", capacidad=" + capacidad + "}";
    }
}
