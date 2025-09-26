/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11;

/**
 *
 * @author Nacho
 */
public class Reproductor {
    
    public void reproducir(Cancion song) {
        // Dependencia de uso: utiliza song
        // sin mantener referencia
        System.out.println("Reproduciendo: " + song);       
    }
}