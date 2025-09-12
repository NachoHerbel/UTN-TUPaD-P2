/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author ignac
 */
public class Principal {

    public static void main(String[] args) {
            
        Gallina gallina1 = new Gallina();
        gallina1.setIdGallina(1001);
        gallina1.setEdad(2);
        gallina1.setHuevosPuestos(40);
        
        Gallina gallina2 = new Gallina();
        gallina2.setIdGallina(1002);
        gallina2.setEdad(3);
        gallina2.setHuevosPuestos(55);
        
        // Acciones con gallina 1
        gallina1.mostrarEstado();
        gallina1.ponerHuevo();
        gallina1.envejecer();
        gallina1.mostrarEstado();
        
        // Acciones con gallina 2
        gallina2.mostrarEstado();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.envejecer();
        gallina2.envejecer();
        gallina2.mostrarEstado();
    }
}