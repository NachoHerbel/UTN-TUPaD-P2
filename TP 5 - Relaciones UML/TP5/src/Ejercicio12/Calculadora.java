/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio12;

/**
 *
 * @author Nacho
 */
public class Calculadora {
    
    public void calcular(Impuesto impuesto){
        // Dependencia de uso: utiliza impuesto
        // sin mantener referencia
        System.out.println("Calculando impuesto...");
        System.out.println("Contribuyente: " + impuesto.getContribuyente().getNombre());
        System.out.println("Monto a pagar: " + impuesto.getMonto());
    }
}