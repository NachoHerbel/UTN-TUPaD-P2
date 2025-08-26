/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

import java.util.Scanner;

/**
 *
 * @author Nacho
 */
public class ejercicio11 {
    
    /**
     * @param args the command line arguments
     */
    
    static double porcentajeDescuento = 0.10;
    
    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * porcentajeDescuento;
        double precioFinal = precio - descuentoAplicado;
        
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
            
    public static void main(String[] args) {
        /* 11. Cálculo de descuento especial usando variable global.
Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un método calcularDescuentoEspecial(double precio) que use la variable global para calcular el descuento especial del 10%.
Dentro del método, declara una variable local descuentoAplicado, almacena el valor del descuento y muestra el precio final con descuento.
Ejemplo de entrada/salida:
Ingrese el precio del producto: 200
El descuento especial aplicado es: 20.0
El precio final con descuento es: 180.0 */ 
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(sc.nextLine());
               
        calcularDescuentoEspecial(precio);
        
    }
}
