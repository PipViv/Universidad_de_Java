package test;

import domain.Persona;

/**
 *
 * @author ap
 */
public class TestFinal {
    
    public static void main(String[] args) {
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
        //miVariable = 5;
        
        
        System.out.println("Mi constante" + Persona.MI_CONSTANTE);
    }
}
