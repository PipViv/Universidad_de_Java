package test;

import domain.Persona;

/**
 *
 * @author ap
 */
public class TestJavaBeans {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Andres");
        persona.setApellido("Paz");
        
        System.out.println("persona = " + persona);
    }
}
