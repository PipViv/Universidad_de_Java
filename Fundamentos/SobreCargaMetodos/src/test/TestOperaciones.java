
package test;

import operaciones.Operaciones;

/**
 *
 * @author ap
 */
public class TestOperaciones {
    
    public static void main(String[] args) {
        var resultado = Operaciones.sumar(10,5);
        System.out.println("resultado = " + resultado);
        
        var resultado2 = Operaciones.sumar(10.2, 5.7);
        System.out.println("resultado2 = " + resultado2);
    }
}
