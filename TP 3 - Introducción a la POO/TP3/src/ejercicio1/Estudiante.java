/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;





/**
 *
 * @author Nacho
 */
public class Estudiante {
    
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        if (calificacion < 0) { // evitamos valores menores a 0
            this.calificacion = 0;
        } else if (calificacion > 10){  // evitamos valores mayores a 10
            this.calificacion = 10;        
        } else { 
            this.calificacion = calificacion;
        }
    }
      
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
        System.out.println("---------------");
    }

    // Verificamos los puntos de la calificación para que no superen los 10 puntos
    public void subirCalificacion (double puntos){
        if (calificacion + puntos <= 10) { // si no supera el máximo
            calificacion += puntos; // acumulador
            System.out.println("La calificación aumentó a: " + calificacion);
        } else {
            System.out.println("ERROR. La calificación no puede ser mayor que 10 puntos.");
        }
    }
    
    public void bajarCalificacion (double puntos){
        if (calificacion - puntos >= 0) { // si no es menor que el mínimo
            calificacion -= puntos; // 
            System.out.println("La calificación disminuyó a: " + calificacion);
        } else {
            System.out.println("ERROR. La calificación no puede ser inferior que 0 puntos.");
        }
    }
}