/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio14;

/**
 *
 * @author ignac
 */
public class Principal {
    
    public static void main(String[] args) {
        
        // Creamos un proyecto
        Proyecto proyecto1 = new Proyecto("Vacaciones 2025", 15);
        
        // Creamos un editor de video
        EditorVideo editor1= new EditorVideo();
        
        // Exportamos el video en diferentes formatos
        System.out.println("--- NUEVO VIDEO ---");
        editor1.exportar("MP4", proyecto1);
        editor1.exportar("AVI", proyecto1);
    }
}