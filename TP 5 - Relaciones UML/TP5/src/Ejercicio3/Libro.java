/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Nacho
 */
public class Libro {
    
    private String titulo;
    private String isbn;
    private Editorial editorial;    // Agregación
    private Autor autor;            // Asociación unidireccional
    
    
    // Constructor
    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }
    
    // Getters y setter
    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public Autor getAutor() {
        return autor;
    }
    
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        String autorInfo;       // Variable interna
        if (autor != null) {
            autorInfo = autor.toString();   // Si el libro tiene autor 
        } else {
            autorInfo = "Sin autor";        // Si el libro no tiene autor
        }
        return "Libro {titulo= " + titulo + ", ISBN: " + isbn + ", editorial= " + editorial + ", autor= " + autorInfo + "}";
    }  
}
