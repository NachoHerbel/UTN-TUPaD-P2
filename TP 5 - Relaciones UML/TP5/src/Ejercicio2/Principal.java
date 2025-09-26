/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author ignac
 */
public class Principal {
    
    public static void main(String[] args) {
        
        // Creamos una batería independiente
        Bateria b1 = new Bateria("Orange-123", 3000);
        
        // Creamos un celular con la batería (agregación)
        Celular celu1 = new Celular("123456789101112", "Orange", "17", b1);
        
        // Creamos un usuario
        Usuario user = new Usuario("Nacho Herbel", "36485704");
        
        // Mostramos estado de los objetos previa asociación
        System.out.println("--- INFO DE OBJETOS SIN ASOCIAR ---");
        System.out.println(celu1);
        System.out.println(user);
        System.out.println();
        
        // Relacionamos usuario y celular (Asociacion bidireccional)
        user.setCelu(celu1);
        
        // Mostramos estado de los objetos luego de asociarlos
        System.out.println("--- INFO DE OBJETOS ASOCIADOS ---");
        System.out.println(celu1);
        System.out.println(user);
    }
}