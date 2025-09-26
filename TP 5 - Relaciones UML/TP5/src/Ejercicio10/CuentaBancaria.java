/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author Nacho
 */
public class CuentaBancaria {
    
    private String cbu;
    private double saldo;
    private final ClaveSeguridad clave;     // Composición
    private Titular titular;                // Asociación bidireccional

    // Constructor
    public CuentaBancaria(String cbu, double saldo, String codigoClave, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigoClave, ultimaModificacion); // Composición
    }

    // Getters y setter
    public String getCbu() {
        return cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public ClaveSeguridad getClave() {
        return clave;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuenta() != this) {
            titular.setCuenta(this);
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria {cbu= " + cbu + ", saldo= " + saldo + ", clave= " + clave + "}";
    }
}