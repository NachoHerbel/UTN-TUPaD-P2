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
public class ejercicio5 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /* 5. Suma de Números Pares (while).
Escribe un programa que solicite números al usuario y sume solo los números pares. El ciclo debe continuar hasta que el usuario ingrese el número 0, momento en el que se debe mostrar la suma total de los pares ingresados.
Ejemplo de entrada/salida:
Ingrese un número (0 para terminar): 4
Ingrese un número (0 para terminar): 7
Ingrese un número (0 para terminar): 2
Ingrese un número (0 para terminar): 0
La suma de los números pares es: 6 */
    
    Scanner sc = new Scanner (System.in);
    
        int sumaPares = 0;
        int num;
              
        System.out.println("Ingrese un número (0 para terminar): ");
        num = Integer.parseInt(sc.nextLine());
        
        while (num != 0) {
            if (num % 2 == 0) {
                sumaPares += num;
            }
            
            System.out.print("Ingrese un número (0 para terminar): ");
            num = Integer.parseInt(sc.nextLine());
        }
        
        System.out.println("La suma de los números pares ingresados es: " + sumaPares);
                   
    }
}