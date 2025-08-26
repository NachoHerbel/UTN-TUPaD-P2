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
public class ejercicio10 {
 
    /**
     * @param args the command line arguments
     */
    
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
    
        return nuevoStock;
    }
        
    public static void main(String[] args) {
        /* 10. Actualización de stock a partir de venta y recepción de productos.
Crea un método actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida), que calcule el nuevo stock después de una venta y recepción
de productos:
NuevoStock = StockActual − CantidadVendida + CantidadRecibida
NuevoStock = CantidadVendida + CantidadRecibida
Desde main(), solicita al usuario el stock actual, la cantidad vendida y la cantidad recibida, y muestra el stock actualizado.
Ejemplo de entrada/salida:
Ingrese el stock actual del producto: 50
Ingrese la cantidad vendida: 20
Ingrese la cantidad recibida: 30
El nuevo stock del producto es: 60 */
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = Integer.parseInt(sc.nextLine());
        
        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = Integer.parseInt(sc.nextLine());
        
        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = Integer.parseInt(sc.nextLine());
        
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
                
    }   
}
