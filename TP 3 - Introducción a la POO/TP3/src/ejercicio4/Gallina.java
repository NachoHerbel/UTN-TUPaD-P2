/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author ignac
 */
public class Gallina {
    
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
        this.edad = edad;
    } else {
            System.out.println("ERROR. La edad no puede ser negativa.");
        }
    }    

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        if (huevosPuestos >= 0){
            this.huevosPuestos = huevosPuestos;
        } else {
            System.out.println("ERROR. Los huevos puestos no pueden ser negativos.");
        }
    }
    
        // Método envejecer: +1 año
    public void envejecer() {
        this.edad ++;
        System.out.println("La gallina ID " + idGallina + " ha cumplido un año. Ahora tiene " + edad + " años.");
    }
    
        // Método ponerHuevo: +1 huevo
    public void ponerHuevo() {
        this.huevosPuestos ++;
        System.out.println("La gallina ID " + idGallina + " ha puesto un huevo. Total: " + huevosPuestos);
    }
       
        // Método para mostrar estado general
    public void mostrarEstado() {
        System.out.println("ID Gallina: " + idGallina);
        System.out.println("Edad: " + edad);
        System.out.println("Huevos puestos: " + huevosPuestos);
        System.out.println("--------------------");
    }
}