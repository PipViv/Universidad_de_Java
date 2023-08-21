
package test;

import domain.Persona;

/**
 *
 * @author ap
 */
public class TestArreglosObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        
        personas[0] = new Persona("Andres");
        personas[1] = new Persona("Felipe");
        
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Nombre  "+ i+"= " + personas[i].toString() ) ;
        }
    }
}
