/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author ignac
 */
public class Pasaporte{
    
    private String numero;
    private String fechaEmision;
    private Foto foto;              // Composición
    private Titular titular;        // Asociación bidireccional
    
    // Constructor
    public Pasaporte(String numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato);     // Se crea internamente la foto
        }
    
    // Getters y Setter
    public String getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    public Titular getTitular() {
        return titular;
    }
    
    public void setTitular(Titular titular){
        this.titular = titular;
        /* Sincronización: si el titular aún no conoce este pasaporte,
        se lo asignamos*/
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }

    @Override
    public String toString() {
        return "Pasaporte {numero='" + numero + "', fechaEmision='" + fechaEmision + "', foto=" + foto + "}";
    }  
}