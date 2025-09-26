/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author Nacho
 */
public class Cliente {
    
    private String nombre;
    private String telefono;

    // Constructor
    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // Getters
    public String getNombre() { 
        return nombre; 
    }
    
    public String getTelefono() {
        return telefono; 
    }

    @Override
    public String toString() {
        return "Cliente {nombre=" + nombre + ", telefono=" + telefono + "}";
    }
}
