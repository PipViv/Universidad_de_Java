package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

/**
 *
 * @author ap
 */
public class TestHerencia {
    public static void main(String[] args) {
        System.out.println("**************************");
        System.out.println("*      EMPLYEE CLASS     *");
        System.out.println("**************************");
        Empleado empleado1 = new Empleado("Andres",500.89);
        System.out.println("empleado1 \n\t" + empleado1);
        Empleado empleado2 = new Empleado("Felipe",500.89);
        System.out.println("empleado2 \n\t" + empleado2);
        System.out.println("**************************");
        System.out.println("*      CLIENT CLASS      *");
        System.out.println("**************************");
        
        Cliente cliente1 = new Cliente("Felipe", new Date((1900+123),0,16), true);
        System.out.println("cliente1 \n\t" + cliente1);
        Cliente cliente2 = new Cliente("Andres", new Date((1900+123),0,16), true);
        System.out.println("cliente2 \n\t" + cliente2);
        Cliente cliente3 = new Cliente(new Date((1900+123),0,16), true, "Pipe", 'H', 21, "Colombia");
        System.out.println("cliente2 \n\t" + cliente3);
    }
}
