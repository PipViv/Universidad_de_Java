package test;

import domain.Persona;

/**
 *
 * @author ap
 */
public class PersonaPrueba {
    
    public static void main(String[] args) {
        Persona persona1 = new Persona("Andres");
        Persona persona2 = new Persona("Felipe");
        
        imprimir(persona1);
        imprimir(persona2);
    }
    public static void imprimir (Persona persona){
        System.out.println("Persona:"+persona);
    }
    
}
