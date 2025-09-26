/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Nacho
 */
public class Principal {
    
    public static void main(String[] args) {
        
        // Creamos una editorial independiente
        Editorial editorial1 = new Editorial("Editorial Mundo", "Calle Falsa 123");
                
        // Creamos un autor
        Autor autor1 = new Autor("Stieg Larsson", "Sueco");
        
        // Creamos un libro 
        Libro libro1 = new Libro("Los hombres que no amaban a las mujeres", "1234567891234", editorial1);
        
        // Seteamos el libro con su autor
        libro1.setAutor(autor1);
        
        // Creamos un segundo libro
        Libro libro2 = new Libro("El alquimista", "2222222222222", editorial1);
        
        // Mostramos los libros por pantalla
        System.out.println("--- LIBRO CON AUTOR ---");
        System.out.println(libro1);

        System.out.println("\n--- LIBRO SIN AUTOR ---");
        System.out.println(libro2);
    }
}
