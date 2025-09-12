/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Nacho
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Instanciamos un estudiante
        Estudiante e1 = new Estudiante();
        e1.setNombre("Nacho");
        e1.setApellido("Herbel");
        e1.setCurso("Historia 1");
        e1.setCalificacion(7);
        
              
        // Mostramos su información
        e1.mostrarInfo();
        
        // Aumentamos su calificación
        e1.subirCalificacion(1);
        
        // Disminuimos su calificación
        e1.bajarCalificacion(2);
        
        // Intentamos aumentar a mas de 10 puntos la calificación
        e1.subirCalificacion(10);
        
        // Intentamos disminuir a menos que 0 puntos la calificación
        e1.bajarCalificacion(10);
    }
}
