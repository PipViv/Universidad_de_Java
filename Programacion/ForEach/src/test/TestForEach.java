package test;

import domain.Persona;

/**
 *
 * @author ap
 */
public class TestForEach {
    public static void main(String[] args) {
        int edades[] = {5,6,8,9};
        for (int edad : edades) {
            System.out.println("edad  = "+ edad);
        }
        
        Persona personas[] = {new Persona("Andres"), new Persona("Valeria"),new Persona("Felipe")};
        for(Persona persona:personas){
            System.out.println("Nombre = " + persona);
        }
        
    }
}
