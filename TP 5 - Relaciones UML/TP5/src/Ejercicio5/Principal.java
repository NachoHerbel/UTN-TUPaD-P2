/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author Nacho
 */
public class Principal {
    
    public static void main(String[] args) {

        // Creamos un propietario
        Propietario propietario1 = new Propietario("Ignacio Herbel", "36485704");
        
        // Creamos una computadora (con composición: placa madre incluida)
        Computadora computadora1 = new Computadora("Lenovo", "SN12345", "B450M", "AMD B450");
        
        // Asociamos propietario y computadora (solo un setter es necesario)
        propietario1.setComputadora(computadora1);
        
        // Mostramos información
        System.out.println("--- COMPUTADORA ---");
        System.out.println(computadora1);
        
        System.out.println("\n--- PROPIETARIO ---");
        System.out.println(propietario1);
    }
}