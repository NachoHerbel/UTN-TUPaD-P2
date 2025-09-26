/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author Nacho
 */
public class Principal {
    
    public static void main(String[] args) {
        
        // Creamos un motor independiente
        Motor motor1 = new Motor("Nafta", "MTR12345");

        // Creamos un vehículo asociado a ese motor
        Vehiculo vehiculo1 = new Vehiculo("AB123CD", "Toyota Corolla", motor1);

        // Creamos un conductor
        Conductor conductor1 = new Conductor("Ignacio Herbel", "LIC98765");

        // Asociamos el conductor al vehículo (sincronización automática en ambos sentidos)
        vehiculo1.setConductor(conductor1);

        // Mostramos los datos completos
        System.out.println("\n--- INFORMACIÓN ---");
        System.out.println(vehiculo1);
    }
}
