package test;

import domain.Empleado;

/**
 *
 * @author ap
 */
public class TestClaseObject {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Andres", 1200);
        Empleado empleado2 = new Empleado("Felipe", 1800);
        
        if(empleado1 ==empleado2){
            System.out.println("Tienen la misma referencia en memoria");
        }else{
                System.out.println("Tienen distinta referencia en memorai");
                }
    
        if(empleado1.equals(empleado2)){
            System.out.println("Los object son iguales en contenido");
        }else{
            System.out.println("son diferentes en contenido");
        }
        if(empleado1.hashCode() == empleado2.hashCode()){
            System.out.println("Hashcode es igual");
        }else{
            System.out.println("Hashcode diferentes");
        }
    }
}
