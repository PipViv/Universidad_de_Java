package test;

import dominio.Persona;

/**
 *
 * @author ap
 */
public class PersonaPureba {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Andres", 1500000, false);
        System.out.println("Nombre: " + persona1.getNombre());
        persona1.setNombre("Andres Felipe");
        System.out.println("(Set)Nombre: " + persona1.getNombre());
        System.out.println("Sueldo: " + persona1.getSueldo());
        System.out.println("Eliminado: " + persona1.isEliminado());
        task();
    }

    private static void task() {
        Persona persona2 = new Persona("Andres", 0, true);
        persona2.setNombre("Andres Paz");
        persona2.setSueldo(1800000);
        persona2.setEliminado(false);

        System.out.println("\n********************");
        System.out.println("*    Task Course   *");
        System.out.println("********************");
        
        System.out.println("Nombre => " + persona2.getNombre());
        System.out.println("Sueldo => "+persona2.getSueldo());
        System.out.println("Eliminado => "+persona2.isEliminado());

        System.out.println("\n********************");
        System.out.println("*     toString     *");
        System.out.println("********************");
        System.out.println("\nMetodo toString " + persona2.toString());
    }

}
