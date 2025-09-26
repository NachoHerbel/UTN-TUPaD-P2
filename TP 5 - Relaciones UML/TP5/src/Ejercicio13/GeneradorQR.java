/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio13;

/**
 *
 * @author Nacho
 */
public class GeneradorQR {
 
    // Dependencia de creación: el método crea un Codigo QR
    public void generar(String valor, Usuario usuario) {
        // Se instancia el CodigoQR dentro del método
        CodigoQR codigo = new CodigoQR(valor, usuario);
        
        // Se usa el objeto sin guardarlo como atributo
        System.out.println(codigo);
    }
}