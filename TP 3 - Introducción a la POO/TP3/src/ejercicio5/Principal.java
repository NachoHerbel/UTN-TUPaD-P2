/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author Nacho
 */
public class Principal {
    
        public static void main(String[] args) {
            
            NaveEspacial nave1 = new NaveEspacial();
            nave1.setNombre("'Rocketship-1'");
            nave1.setCombustible(50);
            
            nave1.despegar();
            nave1.avanzar(60);
            nave1.mostrarEstado();    
            
            nave1.recargarCombustible(45);
            nave1.avanzar(60);
            nave1.mostrarEstado();
            
            nave1.recargarCombustible(150);
            nave1.mostrarEstado();
        }
}