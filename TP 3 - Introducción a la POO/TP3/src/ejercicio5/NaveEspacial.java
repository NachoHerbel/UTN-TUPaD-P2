/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author Nacho
 */
public class NaveEspacial {
    
    private String nombre;
    private int combustible;
    private static final int MAX_COMBUSTIBLE = 150;    // Límite máximo del tanque

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        if (combustible <= 0) {
            System.out.println("ERROR. El combustible a recargar no puede ser negativo.");
        } else if (combustible > MAX_COMBUSTIBLE){
            this.combustible = MAX_COMBUSTIBLE;
            System.out.println("Se alcanzó el límite maximo de combustible (" + combustible + " unidades).");
        } else {
            this.combustible = combustible;
        }
    }

    // Método despegar 
    public void despegar() {
        if (combustible >= 10) {    // 10 unidades de consumo para el despegue
            combustible -= 10;
            System.out.println("La nave " + nombre + " ha despegado.");
            System.out.println("Combustible restante: " + combustible + " unidades.");
        } else {
            System.out.println("ERROR. No se puede despegar. No hay combustible suficiente.");
            System.out.println("Se necesitan al menos 10 unidades.");
        }
    }

    // Método avanzar
    public void avanzar(int distancia){
        int consumo = distancia; // 1 unidad de combustible = 1 unidad de distancia
        if(combustible >= consumo) {
            combustible -= consumo;
            System.out.println("La nave " + nombre + " avanzó " + distancia + " unidades. Combustible restante: " + combustible);
        } else {
            System.out.println("ERROR. No hay combustible suficiente para avanzar " + distancia + " unidades.");
        }
    }
    
    // Método recarCombustible
    public void recargarCombustible(int unidades) {
        if (unidades <= 0) {
            System.out.println("ERROR. La cantidad a recargar debe ser positiva.");
        } else {
            combustible += unidades;
            if (combustible > MAX_COMBUSTIBLE) {
                combustible = MAX_COMBUSTIBLE;
                System.out.println("ERROR. El tanque se llenó (" + MAX_COMBUSTIBLE + " unidades). No se puede superar el máximo.");
            } else {
                System.out.println("Recarga realizada. Combustible actual: " + combustible + " unidades.");
            }
        }
    }
    
    // Método mostrarEstado
    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Combustible: " + combustible + " / " + MAX_COMBUSTIBLE + " unidades.");
        System.out.println("--------------------");
        }
}