/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Nacho
 */
public class Cliente {
    
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta;   //Asociació bidireccional
    
    // Constructor
    public Cliente(String nombre, String dni) {
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

    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }
    
    public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
        if (tarjeta != null && tarjeta.getCliente() != this) {
            tarjeta.setCliente(this);
        }
    }

    @Override
    public String toString() {
        String tarjetaInfo;
    if (tarjeta != null) {
        tarjetaInfo = tarjeta.getNumero();
    } else {
        tarjetaInfo = "Sin tarjeta";
    }
    return "Cliente {nombre= " + nombre + ", DNI= " + dni + ", tarjeta= " + tarjetaInfo + "}";
    }
}