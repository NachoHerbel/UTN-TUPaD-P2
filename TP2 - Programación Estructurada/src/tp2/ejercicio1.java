/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2;

import java.util.Scanner;

/**
 *
 * @author Nacho
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*1. Verificación de Año Bisiesto.
Escribe un programa en Java que solicite al usuario un año y determine si es bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea divisible por 400.
Ejemplo de entrada/salida:
Ingrese un año: 2024
El año 2024 es bisiesto.
Ingrese un año: 1900
El año 1900 no es bisiesto.*/
        
        Scanner input = new Scanner(System.in);
                
        System.out.print("Ingrese un año: ");
        int anio = Integer.parseInt(input.nextLine());
        
        if (anio % 400 == 0) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else if (anio % 4 == 0 && anio % 100 != 0) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
                
    }
    
}
