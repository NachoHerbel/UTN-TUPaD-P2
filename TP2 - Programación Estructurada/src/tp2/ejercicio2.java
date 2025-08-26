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
public class ejercicio2 {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /* 2. Determinar el Mayor de Tres Números. 
Escribe un programa en Java que pida al usuario tres números enteros y 
determine cuál es el mayor.  
Ejemplo de entrada/salida: 
Ingrese el primer número: 8 
Ingrese el segundo número: 12 
Ingrese el tercer número: 5 
El mayor es: 12  */
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Ingrese el primer número: ");
    int num1 = Integer.parseInt(sc.nextLine());
    
    System.out.print("Ingrese el segundo número: ");
    int num2 = Integer.parseInt(sc.nextLine());
    
    System.out.print("Ingrese el tercer número: ");
    int num3 = Integer.parseInt(sc.nextLine());

    int mayor = num1;

    if (num2 > num1) {
        mayor = num2;
    }

    if (num3 > mayor) {
        mayor = num3;
    }

        System.out.println("El mayor es: " + mayor);
    }
}