package test;

import domain.*;

/**
 *
 * @author ap
 */
public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        
        empleado = new Escritor("Andres", 5000, TipoEscritura.CLASICO);
        System.out.println("empleado = " + empleado);
        
//        downcastin
//        ((Escritor)empleado).getTipoEscritura();
        
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEscritura();
        
//        upcasting
        Empleado empleado2 = escritor;
        
        
        
    }
}
