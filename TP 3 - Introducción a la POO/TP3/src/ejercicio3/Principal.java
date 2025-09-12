/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.time.Year;

/**
 *
 * @author ignac
 */
public class Principal {
    
    public static void main(String[] args) {
        
        // Instanciamos un nuevo libro
        Libro libro1 = new Libro();
        libro1.setTitulo("Mi planta de naranja-lima");
        libro1.setAutor("José Mauro de Vasconcelos");
        libro1.setAnioPublicacion(1968);    
        
        // Mostramos su información
        libro1.mostrarInfo();
        
        // Intentamos actualizar fecha de publicación con fechas fuera del rango
        libro1.setAnioPublicacion(1850);
        libro1.setAnioPublicacion(2030);
        
        // Intentamos 
        libro1.setAnioPublicacion(1966);
        
        // Mostramos la información actualizada
        libro1.mostrarInfo();
    }        
}