/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author Nacho
 */
public class Principal {
    
    public static void main(String[] args) {
        
        // Creamos un cliente 
        Cliente cliente1 = new Cliente("Nacho Herbel", "123456789");
        // Creamos una mesa
        Mesa mesa1 = new Mesa(5, 4);
        // Creamos una reserva asociada al cliente y la mesa
        Reserva reserva1 = new Reserva("24-09-2025", "21:00", cliente1, mesa1);

        // Mostramos la información de la reserva
        System.out.println("\n--- SU RESERVA ---");
        System.out.println(reserva1);
    }
}
