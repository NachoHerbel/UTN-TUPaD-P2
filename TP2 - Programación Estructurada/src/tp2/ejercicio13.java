/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

/**
 *
 * @author Nacho
 */
public class ejercicio13 {
            
    /**
     * @param args the command line arguments
     */
    
    public static void mostrarPreciosOriginales(double[] array, int indice){
        if (indice == array.length) {
            return;
        }
        System.out.println("Precio: $" + array[indice]);
        mostrarPreciosOriginales(array, indice + 1);
                
    }
    
    
    public static void mostrarPreciosModificados(double[] array, int indice){
        if (indice == array.length) {
            return;
        }
        System.out.println("Precio: $" + array[indice]);
        mostrarPreciosModificados(array, indice + 1);
                
    }
    
    
    public static void main(String[] args) {
        /*13. Impresión recursiva de arrays antes y después de modificar un elemento.
Crea un programa que:
a. Declare e inicialice un array con los precios de algunos productos.
b. Use una función recursiva para mostrar los precios originales.
c. Modifique el precio de un producto específico.
d. Use otra función recursiva para mostrar los valores modificados.
Salida esperada:
Precios originales:
Precio: $199.99
Precio: $299.5
Precio: $149.75
Precio: $399.0
Precio: $89.99
Precios modificados:
Precio: $199.99
Precio: $299.5
Precio: $129.99
Precio: $399.0
Precio: $89.99 */
    
        double[] precios = {199.99, 299.5, 149.75, 397.0, 89.99};
        
        System.out.println("Precios originales:");
        mostrarPreciosOriginales(precios, 0);
                
        precios[2] = 129.99;
        
        System.out.println("Precios modificados:");
        mostrarPreciosModificados(precios, 0);
                        
    }
}
