/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

/**
 *
 * @author ignac
 */
public class Empleado {
    
    private int ID;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    
    // Getters y Setters
    public int getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    // Constructor 1
    public Empleado(String nombre, String puesto, double salario) {
        totalEmpleados++;   // Contador
        this.ID = totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }
    
    // Constructor 2
    public Empleado(String nombre, String puesto) {
        totalEmpleados++;   // Contador
        this.ID = totalEmpleados;   // ID automático
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 1000;    // Salario por defecto
    }

    // Método toString()
    @Override
    public String toString() {
        return  "Empleado {" + 
                "\nID: " + ID + 
                "\nNombre: " + nombre +
                "\nPuesto: " + puesto +
                "\nSalario: "+ salario +
                "\n}";
    }
    
    // Método estático mostrarTotalEmpleados()
    public static void mostrarTotalEmpleados() {
        System.out.println("Número total de empleados: " + totalEmpleados);
    }
    
    // Métodos sobrecargados actualizarSalario()
    public void actualizarSalario(double aumento) {
        this.salario += aumento;
        System.out.println("Su sueldo tuvo un aumento fijo de $" + aumento + ". Nuevo salario: " + this.salario);
    }
    
    public void actualizarSalario(int porcentaje) {
        this.salario += this.salario * (porcentaje / 100.0); 
        System.out.println(("Su sueldo tuvo un aumento porcentual del " + porcentaje + "%. Nuevo salario: " + this.salario));
    }
}