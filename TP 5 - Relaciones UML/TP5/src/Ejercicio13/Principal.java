/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio13;

/**
 *
 * @author Nacho
 */
public class Principal {
    
    public static void main(String[] args) {
     
        // Creamos un usuario
        Usuario usuario1 = new Usuario("Ignacio Herbel", "nacho@mail.com");
        
        // Creamos un generador de QR
        GeneradorQR generador = new GeneradorQR();
        
        // Generamos un código QR para el usuario
        System.out.println("--- NUEVO QR GENERADO ---");
        generador.generar("QR123456", usuario1);        
    }
}