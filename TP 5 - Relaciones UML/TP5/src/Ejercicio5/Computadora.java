/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author Nacho
 */
public class Computadora {
    
    private String marca;
    private String numeroSerie;
    private final PlacaMadre placaMadre;    // Composición
    private Propietario propietario;        // Asociación bidireccional
    
    // Constructor
    public Computadora(String marca, String numeroSerie, String modelo, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modelo, chipset);      // Se crea internamente la placa madre
    }
    
    // Getters y setter
    public String getMarca() {
        return marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    public Propietario getPropietario() {
        return propietario;
    }
    
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }    
    
    @Override
    public String toString() {
        String propietarioInfo;
        if (propietario != null) {
            propietarioInfo = propietario.getNombre();
        } else {
            propietarioInfo = "Sin propietario";
        }
        return "Computadora {marca= " + marca + ", numeroSerie= " + numeroSerie + ", placaMadre= " + placaMadre + ", propietario= " + propietarioInfo + "}";
    }
}