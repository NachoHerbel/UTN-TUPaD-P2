/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4;

/**
 *
 * @author ignac
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Instanciamos varios empleados utilizando los constructores
        Empleado e1 = new Empleado("Juan Perez","Cajero", 2000);
        Empleado e2 = new Empleado("Pedro Godoy", "Vendedor");
        Empleado e3 = new Empleado("Carlos Romero", "Maestranza", 1800);
        
        // Mostramos la informacion inicial
        System.out.println("--- Empleados ---");
        System.out.println(e1 + "\n");
        System.out.println(e2 + "\n");
        System.out.println(e3);
        
        // Aplicamos aumentos
        System.out.println("\n--- Aplicación de aumentos ---");
        e1.actualizarSalario(500.00);      // Aumento fijo de 500
        e2.actualizarSalario(10);       // Aumento 10%
        e3.actualizarSalario(5);        // Aumento 5%
        
        // Mostramos la informacion luego de los aumentos
        System.out.println("\n--- Salario actualizado ---");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        
        // Mostramos el total de los empleados
        System.out.println("\n--- Total de empleados ---");
        Empleado.mostrarTotalEmpleados();
    }
}