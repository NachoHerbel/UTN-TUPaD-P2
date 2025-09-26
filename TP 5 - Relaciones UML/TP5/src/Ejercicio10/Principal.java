/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author Nacho
 */
public class Principal {
    
    public static void main(String[] args) {
        
        // Creamos un titular
        Titular titular1 = new Titular("Ignacio Herbel", "36485704");

        // Creamos una cuenta bancaria con su clave de seguridad
        CuentaBancaria cuenta1 = new CuentaBancaria("1234567890123456789012", 50000.0, "CLAVE123", "2025-09-16");

        // Asociamos titular y cuenta (sincronización automática en ambos sentidos)
        titular1.setCuenta(cuenta1);

        // Mostramos la cuenta con toda su información
        System.out.println("--- INFORMACIÓN BANCARIA ---");
        System.out.println(cuenta1);
        System.out.println(cuenta1.getTitular());
    }
}
