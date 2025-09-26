/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11;

/**
 *
 * @author Nacho
 */
public class Principal {
    
    public static void main(String[] args) {
    
        // Creamos un artista
        Artista artista1 = new Artista("Lisandro Aristimuño", "Rock alternativo");
        
        // Creamos una cancion asociada al artista
        Cancion cancion1 = new Cancion("Azucar del Estero", artista1);
        
        // Creamos un reproductor
        Reproductor reproductor = new Reproductor();
        
        // Reproducimos la cancion por medio de la dependencia de uso
        reproductor.reproducir(cancion1);
    }
}