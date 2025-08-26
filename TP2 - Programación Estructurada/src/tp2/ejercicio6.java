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
public class ejercicio6 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 6. Contador de Positivos, Negativos y Ceros (for).
Escribe un programa que pida al usuario ingresar 10 números enteros y cuente cuántos son positivos, negativos y cuántos son ceros.
Ejemplo de entrada/salida:
Ingrese el número 1: -5
Ingrese el número 2: 3
Ingrese el número 3: 0
Ingrese el número 4: -1
Ingrese el número 5: 6
Ingrese el número 6: 0
Ingrese el número 7: 9
Ingrese el número 8: -3
Ingrese el número 9: 4
Ingrese el número 10: -8
Resultados:
Positivos: 4
Negativos: 4
Ceros: 2 */
        
        Scanner sc = new Scanner(System.in);
        
        int contPositivos = 0;
        int contNegativos = 0;
        int contCeros = 0;
                
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int num = Integer.parseInt(sc.nextLine());
        
            if (num > 0) {
                contPositivos++;
            } else if (num < 0) {
                contNegativos++;
            } else {
                contCeros++;
            }
        }
        
        System.out.println("RESULTADOS:");
        System.out.println("Positivos: " + contPositivos);
        System.out.println("Negativos: " + contNegativos);
        System.out.println("Ceros: " + contCeros);
    }    
}
