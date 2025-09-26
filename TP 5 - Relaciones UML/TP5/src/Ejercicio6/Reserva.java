/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author Nacho
 */
public class Reserva {
    
    private String fecha;
    private String hora;
    private Cliente cliente;  // Asociación unidireccional
    private Mesa mesa;        // Agregación

    // Constructor
    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }
    
    // Getters
    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }
    
    @Override
    public String toString() {
        return "Reserva {fecha=" + fecha + ", hora=" + hora + 
               ", cliente=" + cliente + ", mesa=" + mesa + "}";
    }
}