/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author ignac
 */
public class Celular {
    
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;    // Agregación
    private Usuario usuario;    // Asociación bidireccional

    // Constructor
    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;     // Se pasa como parámetro (agregación)
    }

    // Getters y setter
    public String getImei() {
        return imei;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
        /* Sincronización: si el usuario aún no se relaciona con este celular,
        se lo asignamos*/
        if (usuario != null && usuario.getCelu() != this) {
            usuario.setCelu(this);
        }    
    }

    @Override
    public String toString() {
        String usuarioInfo;     // Variable local
        if (usuario != null) {
            usuarioInfo = usuario.getNombre();      // Si el celular tiene usuario 
        } else {
            usuarioInfo = "Sin usuario";            // Si el celular aún no tiene usuario
        }
        
        return "Celular {imei= " + imei + ", marca= " + marca + ", modelo= " 
                + modelo + ", bateria= " + bateria + ", usuario= " + usuarioInfo + "}";
    }
}