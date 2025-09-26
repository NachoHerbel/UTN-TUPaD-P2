/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author ignac
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creamos un titular
        Titular titular = new Titular("Ignacio Herbel", "12345678");
        
        // Creamos un pasaporte
        Pasaporte pasaporte = new Pasaporte("AA123456", "16-09-2018", "foto4x4.jpg", "JPG");

        // Establecemos la relacion bidireccional
        titular.setPasaporte(pasaporte);
        
        // Mostramos los datos del titular, pasaporte y foto
        System.out.println("Titular: " + titular.getNombre() + " - DNI: " + titular.getDni());
        System.out.println("Pasaporte: " + titular.getPasaporte().getNumero());
        System.out.println("Foto del pasaporte: " + titular.getPasaporte().getFoto());
    }
}