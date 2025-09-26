/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Nacho
 */
public class TarjetaDeCredito {
    
    private String numero;
    private String fechaDeVencimiento;
    private Cliente cliente;            // Asociación bidireccional
    private Banco banco;                // Agregación

    // Constructor
    public TarjetaDeCredito(String numero, String fechaDeVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.banco = banco;
    }

    // Getters y setter
    public String getNumero() {
        return numero;
    }

    public String getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Banco getBanco() {
        return banco;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjeta() != this) {
            cliente.setTarjeta(this);
        }
    }

    @Override
    public String toString() {
        return "{numero= " + numero + ", Fecha de vencimiento= " + fechaDeVencimiento + ", banco= " + banco + "}";
    }
}