/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author ignac
 */
public class Usuario {
    
    private String nombre;
    private String dni;
    private Celular celu;   // Asociación bidireccional

    // Constructor
    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    // Getters y setter
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Celular getCelu() {
        return celu;
    }

    public void setCelu(Celular celu) {
        this.celu = celu;
        /* Sincronización: si el celular aún no se relaciona con este usuario,
        se lo asignamos*/
        if (celu != null && celu.getUsuario() != this) {
            celu.setUsuario(this);
        }
    }

    @Override
    public String toString() {
        String celularInfo;         // Variable local
        if (celu != null) {
            celularInfo = celu.getModelo();
        } else {
            celularInfo = "Sin celular";
        }
        return "Usuario {nombre= " + nombre + ", DNI= " + dni + ", celular= " 
                + celularInfo + "}";
    }
}