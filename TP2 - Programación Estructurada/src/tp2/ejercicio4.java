/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

import java.util.Scanner;

/**
 *
 * @author ignac
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 4. Calculadora de Descuento según categoría. 
Escribe un programa que solicite al usuario el precio de un producto y 
su categoría (A, B o C). 
Luego, aplique los siguientes descuentos: 
Categoría A: 10% de descuento 
Categoría B: 15% de descuento  
Categoría C: 20% de descuento 
El programa debe mostrar el precio original, el descuento aplicado y el 
precio final 
Ejemplo de entrada/salida: 
Ingrese el precio del producto: 1000 
Ingrese la categoría del producto (A, B o C): B 
Descuento aplicado: 15% 
Precio final: 850.0 */
        
    Scanner sc = new Scanner (System.in);
    
        System.out.println("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(sc.nextLine());
        
        System.out.println("Ingrese la categoría del producto (A, B, C): ");
        String categoria = sc.nextLine().toUpperCase();

        double descuento = 0.0;
        
        switch (categoria) {
            case "A":
                descuento = 0.10;              
                break;
            case "B":
                descuento = 0.15;              
                break;
            case "C":
                descuento = 0.20;              
                break;
                
            default:
                System.out.println("Categoría inválida.");
                
                return;
        }
        
        double precioFinal = precio - (precio * descuento);
        
        System.out.println("Precio original: $" + precio);
        System.out.println("Descuento aplicado: " + descuento);
        System.out.println("Precio final: $" + precioFinal);
    }    
}
