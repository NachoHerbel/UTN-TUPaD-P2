package tp2;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ignac
 */
public class ejercicio3 {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /* 3. Clasificación de Edad. 
Escribe un programa en Java que solicite al usuario su edad y clasifique su 
etapa de vida según la siguiente tabla: 
Menor de 12 años: "Niño" 
Entre 12 y 17 años: "Adolescente" 
Entre 18 y 59 años: "Adulto" 
60 años o más: "Adulto mayor" 
Ejemplo de entrada/salida: 
Ingrese su edad: 25 
Eres un Adulto. 
Ingrese su edad: 10 
Eres un Niño. */
    
     Scanner sc = new Scanner(System.in);
    
    System.out.print("Ingrese su edad: ");
    int edad = Integer.parseInt(sc.nextLine());
    
    if (edad < 12) {
        System.out.println("Eres un Niño.");
    } else if (edad >= 12 && edad <= 17) {
        System.out.println("Eres un Adolescente.");
    } else if (edad >= 18 && edad <= 59) {
        System.out.println("Eres un Adulto.");
    } else {
        System.out.println("Eres un Adulto mayor.");
    }
    
    }
}
