/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Nacho
 */
public class Principal {
    
    public static void main(String[] args) {
    
        // Creamos un banco independiente (agregación)
        Banco banco1 = new Banco("Banco Birsa", "30-12345678-9");
        
        // Creamos un cliente
        Cliente cliente1 = new Cliente("Ignacio Herbel", "36485704");
        
        // Creamos una tarjeta de crédito asociada al banco
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("1234-5678-9012-3456", "12/2027", banco1);
        
        // Asociamos el cliente con la tarjeta (solo un setter es necesario)
        cliente1.setTarjeta(tarjeta1);
        // Esto llama a tarjeta1.setCliente(cliente1) gracias a la sincronización
        
        // Mostramos la información
        System.out.println("--- CLIENTE ---");
        System.out.println(cliente1);
        
        System.out.println("\n--- TARJETA ---");
        System.out.println(tarjeta1);
        
        System.out.println("\n--- BANCO ---");
        System.out.println(banco1);
    }
}