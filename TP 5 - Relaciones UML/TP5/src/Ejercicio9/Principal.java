/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

/**
 *
 * @author Nacho
 */
public class Principal {
    
    public static void main(String[] args) {
        
        // Creamos un paciente
        Paciente paciente1 = new Paciente("Lucía", "OSDE");

        // Creamos un profesional
        Profesional profesional1 = new Profesional("Dr. López", "Cardiología");

        // Creamos la cita médica
        CitaMedica cita1 = new CitaMedica("25-09-2025", "10:30", paciente1, profesional1);

        // Mostramos por pantalla la cita
        System.out.println("\n--- SU CITA ---");
        System.out.println(cita1);
    }
}
