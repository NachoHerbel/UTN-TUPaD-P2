/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author ignac
 */
public class Titular {
    
    private String nombre;
    private String dni;
    private Pasaporte pasaporte;    // Asociación bidireccional
    
    // Constructor
    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    // Getters y Setter
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        /* Sincronización: Si el pasaporte aún no conoce este titular,
        se lo asignamos*/
        if (pasaporte != null && pasaporte.getTitular() != this) {
            pasaporte.setTitular(this);
        }
    }

    @Override
    public String toString() {
        return "Titular {nombre='" + nombre + "', dni= '" + dni + "'}";
    }
}