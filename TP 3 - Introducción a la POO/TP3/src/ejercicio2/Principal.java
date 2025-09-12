/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author ignac
 */
public class Principal {
    
    
    public static void main(String[] args) {
    
        // Instanciamos una mascota
        Mascota mascota1 = new Mascota(); 
        mascota1.setNombre("Rocky");
        mascota1.setEspecie("Hurón");
        mascota1.setEdad(1);
        
        // Mostramos su información
        mascota1.mostrarInfo();
        
        // La hacemos cumplir años
        mascota1.cumplirAnios();
        
        // Simulamos que hubo un error en la carga e intentamos cargar un número negativo
        mascota1.setEdad(-2);
        
        // Mostramos su información nuevamente
        mascota1.mostrarInfo();
    }
}