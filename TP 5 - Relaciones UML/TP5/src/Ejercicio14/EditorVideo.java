/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio14;

/**
 *
 * @author ignac
 */
public class EditorVideo {
    
    // Dependencia de creación: el método crea un render a partir de un proyecto
    public void exportar(String formato, Proyecto proyecto) {
        // Se instancia el video 
        Render render = new Render(formato, proyecto);
        
        // Se usa el objeto sin guardarlo como atributo
        System.out.println("Exportando proyecto...");
        System.out.println(render);
    }
}