/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author ignac
 */
public class Mascota {
    
    private String nombre;
    private String especie;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {     // setEdad(): se usa para cargar o corregir la edad manualmente.
        if (edad > 0) {                 // Solo acepta valores positivos
            this.edad = edad;
        } else { 
            System.out.println("ERROR. La edad no puede ser negativa.");
        } /* Nota: 
                - Si se ingresa un número negativo, no se actualiza la edad, y seguirá con su valor anterior
                - Si la primer edad ingresada es negativa, el contador comenzará en 0 ya que los integer en Java comienzan allí por defecto */
    }
    
    public void mostrarInfo() {     // Muestra la información
        System.out.println("---- Mi mascota ----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
        System.out.println("--------------------");
    }
    
    public void cumplirAnios() {    // Simula el paso del tiempo aumentando en 1 la edad.
        this.edad ++;
        System.out.println("¡FELICITACIONES! " + nombre + " ha cumplido años. \n Su nueva edad es " + edad + " años.");
    }
}