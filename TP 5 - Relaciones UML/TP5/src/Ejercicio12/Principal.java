/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio12;

/**
 *
 * @author Nacho
 */
public class Principal {
    
    public static void main(String[] args) {
    
    // Creamos un contribuyente
    Contribuyente contribuyente1 = new Contribuyente("Ignacio Herbel", "20-12345678-8");
    
    // Creamos un impuesto
    Impuesto impuesto1 = new Impuesto(16500, contribuyente1);
    
    // Creamos una calculadora
    Calculadora calculadora = new Calculadora();
    
    // Usamos la dependencia de uso: pasamos el objeto impuesto al método
    calculadora.calcular(impuesto1);    
    }
}