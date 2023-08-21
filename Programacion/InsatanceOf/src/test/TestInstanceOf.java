package test;

import domain.Empleado;
import domain.Gerente;

/**
 *
 * @author ap
 */
public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Andres", 300.0);
        determinarTipo(empleado1);
//        Gerente gerente1 = new Gerente("Hugo",400.0,"Sistemas");
        
        empleado1 =  new Gerente("Felipe", 100, "Contabilidad");
//        determinarTipo(empleado1);
    }
    
    public static void determinarTipo(Empleado empleado){
        if(empleado instanceof Gerente){
            System.out.println("El objeto es de tipo Gerente");
//            ((Gerente) empleado).getDepartamento();
            Gerente gerente = (Gerente)empleado;
            System.out.println("gerente = " + gerente.getDepartamento());
        }else if(empleado instanceof Empleado){
            System.out.println("El objeto es de tipo Empleado");
//            Gerente gerente = (Gerente)empleado;ClassCastException
              System.out.println("empleado = " + empleado.getNombre());
        }else if(empleado instanceof Object){
            System.out.println("El objeto es de tipo Object");
        }
    }
}
