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
public class ejercicio8 {
            
    /**
     * @param args the command line arguments
     */
    
    public static double calcularPrecioFinal(double precioBase, double impuesto, double  descuento){
        double precioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
        return precioFinal;
    }
    
    
    public static void main(String[] args) {
        /* 8. Cálculo del Precio Final con impuesto y descuento.
Crea un método calcularPrecioFinal(double impuesto, double descuento) que calcule el precio final de un producto en un e-commerce. La fórmula es:
PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento) 
PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times Descuento)
Desde main(), solicita el precio base del producto, el porcentaje de impuesto y el porcentaje de descuento, llama al método y muestra el precio final.
Ejemplo de entrada/salida:
Ingrese el precio base del producto: 100
Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): 10
Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): 5
El precio final del producto es: 105.0 */
             
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = Double.parseDouble(sc.nextLine());
        
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = Double.parseDouble(sc.nextLine()) / 100.00;
        
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = Double.parseDouble(sc.nextLine()) / 100.00;
        
        double resultado = calcularPrecioFinal(precioBase, impuesto, descuento);
        
        System.out.println("El precio final del producto es: " + resultado);
    }
                
}
