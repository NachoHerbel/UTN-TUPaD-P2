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
public class Libro {
    
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        
        int anioActual= Year.now().getValue();  // Obtenemos el año actual
        
        if (anioPublicacion >= 1900 && anioPublicacion <= anioActual) {     // Validamos que el año de publicacion sea mayor o igual a 1900 y menor o igual al año actual.
            this.anioPublicacion = anioPublicacion;
            System.out.println("Año de publicación actualizado correctamente.");
        } else {
            System.out.println("ERROR. El año de publicación no puede ser inferior a 1900 ni mayor a " + anioActual + ".");
        }
    }
    
    public void mostrarInfo() {     // Muestra la información
        System.out.println("---- Libro ----");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año publicación: " + anioPublicacion);
        System.out.println("--------------------");
    }
}
