/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author Nacho
 */
public class Principal {
    
    public static void main(String[] args) {
        
        // Creamos un usuario
        Usuario usuario1 = new Usuario("Nacho", "nacho@example.com");

        // Creamos un documento, que internamente genera su firma digital
        Documento doc1 = new Documento("Contrato", "Contenido del contrato...", "HASH123", "2025-09-16", usuario1);

        // Mostramos el documento con la firma y usuario asociado
        System.out.println("\n--- INFORMACIÓN ---");
        System.out.println(doc1);
    }
}