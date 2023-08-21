package test;

import domain.Empleado;
import domain.Gerente;

/**
 *
 * @author ap
 */
public class testSobreEscritura {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Andres", 300.0);
//        System.out.println("empleado1 = " + empleado1.obtenerDetalles());
        imprimir(empleado1);

        Gerente gerente1 = new Gerente("Hugo",400.0,"Sistemas");
//        System.out.println("gerente1 = " + gerente1.obtenerDetalles());
        imprimir(gerente1);

    }
    //polimorfismo
    public static void imprimir(Empleado empleado){
        String detalle = empleado.obtenerDetalles();
//        System.out.println("empleado = " + empleado.obtenerDetalles());
        System.out.println("detalle = " + detalle);
    }
    
}
