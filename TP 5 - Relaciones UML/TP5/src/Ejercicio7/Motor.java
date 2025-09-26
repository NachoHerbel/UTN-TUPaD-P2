/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author Nacho
 */
public class Motor {
    
    private String tipo;        
    private String numeroSerie;
    
    // Constructor
    public Motor(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }
    
    // Getters
    public String getTipo() {
        return tipo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }
    
    @Override
    public String toString() {
        return "Motor {tipo= " + tipo + ", numeroSerie= " + numeroSerie + "}";
    }
}